package com.sais.cashoffice.CashOfficeTest.paypointtransaction.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.sais.cashoffice.CashOfficeTest.entities.TPaypointCrHdr;
import com.sais.cashoffice.CashOfficeTest.entities.TPaypointCrLine;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.TPpCrFileFormatHdrRepository;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.TPpCrFileFormatLineRepository;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.service.FileService;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.CreditFileFieldFormatForm;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.CreditFileForm;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.CreditFileUploadForm;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.repository.TpaypointCrHdrRepository;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.repository.TpaypointCrLinesRepository;
import com.sais.cashoffice.exception.Response;

@Service
public class CreditFileUploadServiceImpl implements CreditFileUploadService {
	private static final Logger LOGGER = LogManager.getLogger(CreditFileUploadServiceImpl.class);
	@Autowired
	FileService fileservice;

	@Autowired
	TPpCrFileFormatLineRepository crFileFormatRepo;

	@Autowired
	TPpCrFileFormatHdrRepository filecrHdr;

	@Autowired
	TpaypointCrHdrRepository crdtHdr;

	@Autowired
	TpaypointCrLinesRepository crdtLineRepo;

	@Autowired
	ModelMapper modelmapper;

	private List<CreditFileForm> crFileLines = new ArrayList<CreditFileForm>();

	public List<CreditFileForm> getCrFileLines() {
		return crFileLines;
	}

	public void setCrFileLines(List<CreditFileForm> crFileLines) {
		this.crFileLines = crFileLines;
	}

	@Override
	@Transactional
	public ResponseEntity<?> uploadCreditFile(CreditFileUploadForm formData, MultipartFile file) throws Exception {
		boolean status = true;
		Response resp = null;
		System.out.println(formData);
		CreditFileForm creditFileForm = null;
		String msg = "";
		LOGGER.debug("Paypoint ID : " + formData.getPaypointId());
		try {
			// saving the uploaded file to server
			status = saveCreditFileToServer(formData.getCreditFile(), file);
			// after saving process the file based on the file type
			if (status == true) {

				String strFileName = file.getOriginalFilename();// formData.getCreditFile();
				System.out.println(strFileName + "      strFileName");
				String strFileDPath = FileService.creditFilesLocation + File.separator + strFileName;

				LOGGER.debug("File Name-------> : " + strFileDPath);

				// getting data from t_pp_cr_lines to determine which fields should be there in
				// the uploaded cr file
				CreditFileFieldFormatForm fldDetails = crFileFormatRepo
						.getCreditFileFieldFormat(Long.valueOf(formData.getPaypointId()), 1, "LINES");
				String strDelimeterType;
				LOGGER.debug("Delimeter Type   :" + fldDetails.getDelimiter());
				if (fldDetails.getDelimiter() == null) {
					LOGGER.debug("Delimeter Is missing in File Designer   :" + fldDetails.getDelimiter());
					throw new Exception("Plesae Check The Credit File Format in File Designer Unauthorized Operation");
				} else {
					strDelimeterType = fldDetails.getDelimiter();
					// handling credit file with "P" as delimiter
					if (strDelimeterType.equalsIgnoreCase("P")) {
						this.setCrFileLines(
								ParseStringFIXWidth(strFileDPath, formData.getPaypointId(), creditFileForm));
					} else {
						// handling credit file with ","(comma) as delimiter
						if ((file.getContentType().equalsIgnoreCase("application/vnd.ms-excel"))
								|| (file.getContentType().equalsIgnoreCase("CSV"))) {
							LOGGER.debug("Parse CSV Section");
							// csv file parsing
							this.setCrFileLines(ParseCSV(strFileDPath, formData.getPaypointId(), creditFileForm));
						} else {
							LOGGER.debug("Parse Comma Seperated Text File Section");
							// text file parsing
							this.setCrFileLines(
									ParseStringDeli(strFileDPath, formData.getPaypointId(), creditFileForm));

						}

					}
					LOGGER.debug("Total Records :" + crFileLines.size());
					if (crFileLines.size() > 0) {
						LOGGER.info("Record Insertion started........" + this.getCrFileLines().size());
						Date period = SplitMergeServiceImpl.convertToDate(formData.getPeriod());
						crFileLines.stream().forEach(elt -> elt.setCollection_Period(period));
						// saving credit file data into corresponding tables
						msg = insertCrHdr(crFileLines, strFileName, period, formData.getPaypointId());
						LOGGER.info(msg);

					}
				}
			}
		} catch (InterruptedException e) {
			LOGGER.error("Error Occured : ", e);
			throw e;
		} catch (DataAccessException e) {
			// e.printStackTrace();
			throw new Exception("Data Access Error");
		} catch (IllegalArgumentException e) {
			LOGGER.error("Error Occured : ", e);
			throw e;
		} catch (NoSuchMethodException e) {
			throw e;
		} catch (Exception e) {
			// e.printStackTrace();
			throw new Exception(e.getLocalizedMessage());
		}
		resp = new Response(200, msg);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

	@Transactional
	public boolean saveCreditFileToServer(String filePath, MultipartFile file) throws Exception {
		boolean status = false;
		BufferedReader brReader = null;
		BufferedWriter brWriter = null;
		try {
			if ((file.getContentType().equalsIgnoreCase("application/vnd.ms-excel"))
					|| (file.getContentType().equalsIgnoreCase("CSV"))) {
				status = savecsv(file);
			} else {
				fileservice.store(file, FileService.creditFilesLocation);

				// purpose of below code is to copy the credit file into server location premium
				// credits folder
				// above method does the same hence commented below code
				/*
				 * File reportFileDir = new File(FileService.creditFilesLocation.toString());
				 * 
				 * if (!reportFileDir.exists()) { boolean createReportDir =
				 * reportFileDir.mkdir(); LOGGER.debug("Created CreditFiles Dir : " +
				 * createReportDir); } LOGGER.debug("Is Binary : " + file.getContentType());
				 * 
				 * brReader = new BufferedReader(new FileReader(filePath));
				 * 
				 * FileWriter fileWriter = new FileWriter(
				 * FileService.creditFilesLocation.toString() + File.separator +
				 * file.getName()); brWriter = new BufferedWriter(fileWriter);
				 * 
				 * String line = null; while ((line = brReader.readLine()) != null) { //
				 * logger.debug(line); brWriter.write(line); brWriter.write("\n"); }
				 * Files.copy(file.getInputStream(),
				 * FileService.creditFilesLocation.resolve(file.getOriginalFilename()));
				 */
				status = true;
			}
		} catch (RuntimeException e) {
			// e.printStackTrace();
			throw new Exception("Error Occured while parsing credit File ");
		} finally {
			LOGGER.debug("cleaning up file resources");
			try {
				if (brReader != null) {
					brReader.close();
				}

				if (brWriter != null) {
					brWriter.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return status;
	}

	@Transactional
	public boolean savecsv(MultipartFile file) throws Exception {
		boolean status = false;
		BufferedInputStream brInputStream = null;
		// BufferedWriter brWriter = null;
		BufferedOutputStream brOutputStream = null;
		MultipartFile uploadMedia = null;
		// File timeStampDir = null;
		try {

			uploadMedia = file;
			InputStream inputStream = uploadMedia.getInputStream();
			LOGGER.debug("Character Reader : " + inputStream);
			brInputStream = new BufferedInputStream(inputStream);

			File reversalFileDir = new File(FileService.resources.toString(), "reversals");
			if (!reversalFileDir.exists()) {
				boolean reversalFileDirCreate = reversalFileDir.mkdir();
				LOGGER.debug("Reversals File Directory Created : " + reversalFileDirCreate);
			}

			File reportFileDir = new File(FileService.creditFilesLocation.toString());

			if (!reportFileDir.exists()) {
				boolean createReportDir = reportFileDir.mkdir();
				LOGGER.debug("Created Reports Dir : " + createReportDir);
			}

			FileOutputStream fileOutputStream = new FileOutputStream(
					FileService.creditFilesLocation.toString() + File.separator + uploadMedia.getOriginalFilename());
			brOutputStream = new BufferedOutputStream(fileOutputStream);

			// String line = null;
			byte[] buffer = new byte[102400];
			int bytesRead = 0;
			bytesRead = brInputStream.read(buffer);
			while (bytesRead != -1) {
				LOGGER.debug("Bytes Read : " + bytesRead);
				brOutputStream.write(buffer);
				bytesRead = brInputStream.read(buffer, 0, bytesRead);
			}
			brInputStream.close();
			brOutputStream.close();

			status = true;

		} catch (Exception e) {
			throw new Exception("Exception while saving csv to server location");

		} finally {
			LOGGER.debug("cleaning up file resources");
			try {
				if (brInputStream != null) {
					brInputStream.close();
				}

				if (brOutputStream != null) {
					brOutputStream.close();
				}

			} catch (IOException e) {
				LOGGER.error("Error Occured : ", e);
			}
		}
		return status;

	}

	public List<CreditFileForm> ParseStringFIXWidth(String strInputFile, String strPayPointID, Object ObjcreditFileDTO)
			throws IOException {

		LOGGER.info("ParseStringFIXWidth Method Invoked");
		try

		{
			// Getting File Name
			String strFilNameNew = ParseFileName(strInputFile);

			// Reading File buffer
			// -----------------------------------------------------------

			String strFile = strInputFile;
			BufferedReader br = new BufferedReader(new FileReader(strFile));

			String strLine = "";
			StringTokenizer st = null;
			int line_Number = 0, token_Number = 0;

			Class[] types = new Class[] {};
			types = new Class[] { String.class };

			// Number of Header Record
			// ---------------------------------------------------------
			int fieldCount = getFieldCount(strPayPointID);
			long header_Count = 0;
			header_Count = filecrHdr.findByPaypointId(Long.valueOf(strPayPointID)).getNoOfCreditHdrLines();
			// header_Count= getNumberOflines(strPayPointID,"HEADER");
			LOGGER.debug(" Total Header  Records" + header_Count);
			// call method

			boolean first_Line;
			if (header_Count > 0) {
				first_Line = false;
			} else {
				first_Line = true;
			}

			// ----------------------------------------------------------

			// Number of Trailer Record
			// --------------------------------------------------------
			String Trailer_Const = "9999***";
			String strDelimiter = ",";

			// Reading file
			// --------------------------------------------------------

			while ((strLine = br.readLine()) != null) {
				Method method = null;
				// skip header lines
				// ---------------------------------------------------------
				// if ((first_Line == true) && (header_Count > 0)) {
				if (header_Count > 0) {
					LOGGER.debug("Header line invoked");
					header_Count = header_Count - 1;
					first_Line = false;
					continue;

				} else if (strLine.startsWith(Trailer_Const)) {
					LOGGER.debug("Trailer line invoked");
					continue;
				} else {

					String strFieldName = null;
					ObjcreditFileDTO = new CreditFileForm();

					int lenLine = 0;
					lenLine = strLine.length();
					System.out.println("String lenght " + lenLine);
					int i = 0;
					int startPosition, endPosition;
					String strFieldValue;
					while ((lenLine > 0) && (i < fieldCount)) {

						// if(i<2){
						CreditFileFieldFormatForm crf = crFileFormatRepo
								.getCreditFileFieldFormat(Long.valueOf(strPayPointID), i + 1, "LINES");
						LOGGER.debug("fileFormatDTO --------------->" + crf);
						strFieldName = crf.getFieldName();

						if (crf != null) {
							startPosition = crf.getStartPosition();
							endPosition = crf.getEndPosition();
							LOGGER.debug("Start Positio:" + startPosition);
							LOGGER.debug("End Position :" + endPosition);
							strFieldValue = strLine.substring(startPosition, endPosition);
							LOGGER.debug("Field Name :" + strFieldName);
							LOGGER.debug("Field Lenght :" + strFieldValue.length());
							LOGGER.debug("Field Value :" + strFieldValue);
							// strFieldName = getMethodName(strFieldName);
							lenLine = lenLine - strFieldValue.length();
							LOGGER.debug("Linght Of Line :" + lenLine);
							String strField = strFieldValue;
							strFieldName = getMethodName(strFieldName);
							method = ObjcreditFileDTO.getClass().getMethod(strFieldName, types);
							method.invoke(ObjcreditFileDTO, strField.trim());
						}

						i++;
					}

				}

				crFileLines.add((CreditFileForm) ObjcreditFileDTO);
			}

			LOGGER.debug("File Reading Finished And Total Records " + crFileLines.size());

		}

		catch (Exception e)

		{
			LOGGER.error("Error Occured : ", e);

		}
		return crFileLines;
	}

	@Transactional
	private String insertCrHdr(List<CreditFileForm> crFileLines, String strFileName, Date period, String paypointId)
			throws Exception {
		String msg = "";
		Set<String> upstatus = new HashSet<String>(Arrays.asList("U", "I"));
		Set<String> processedstatus = new HashSet<String>(Arrays.asList("P"));
		List<TPaypointCrHdr> uploadedList = crdtHdr
				.findByPaypointIdAndUploadPeriodAndFileStatusIn(Long.valueOf(paypointId), period, upstatus);
		List<TPaypointCrHdr> processedList = crdtHdr
				.findByPaypointIdAndUploadPeriodAndFileStatusIn(Long.valueOf(paypointId), period, processedstatus);
		if (processedList.size() > 0) {
			msg = "Cr File already uploaded  for the Paypoint Id " + paypointId + " for the Period " + period;
		} else if (uploadedList.size() > 0) {

			TPaypointCrHdr creditHdr = uploadedList.get(0);
			if (creditHdr != null) {
				List<TPaypointCrLine> crdtLine = crdtLineRepo.findByCreditHdrid(creditHdr.getPpCrHdrId());
				crdtLine.stream().forEach(elt -> elt.setStatus("D"));
				// crdtLine.setStatus("D");
				crdtLineRepo.saveAll(crdtLine);
				creditHdr.setFileStatus("D");
				crdtHdr.save(creditHdr);
			}
			uploadedList.clear();
		}
		if (uploadedList.size() == 0 && processedList.size() == 0) {
			TPaypointCrHdr entity = new TPaypointCrHdr();
			entity.setPaypointId(Long.valueOf(paypointId));
			entity.setFileName(strFileName);
			entity.setUploadPeriod(period);
			entity.setFileStatus("U");
			entity.setCreationDate(new Date());

			TPaypointCrHdr id = crdtHdr.save(entity);
			if (id != null) {
				msg = "Record generated successfully!";
				LOGGER.info(" Credit Hdr insertion completed");
				LOGGER.info(" Credit Lines insertion started");
				insertCrLines(crFileLines, id.getPpCrHdrId(), id.getPaypointId(), period);
			} else {
				throw new Exception("Error while Saving Credit header Details");
			}

		}
		return msg;
	}

	@Transactional
	private String insertCrLines(List<CreditFileForm> crFileLines, long ppCrHdrId, long paypointId, Date period)
			throws Exception {
		String msg = "";
		String currency = filecrHdr.findCurrencyByPaypointId(paypointId);
		Double premium;
		for (CreditFileForm crdtLine : crFileLines) {
			if (crdtLine.getPension_premium() == null) {
				crdtLine.setPension_premium("0");
			}
			if (crdtLine.getLife_premium() == null) {
				crdtLine.setLife_premium("0");
			}
			if (crdtLine.getPremium() == null) {
				crdtLine.setPremium("0");
			}
			premium = Double.parseDouble(crdtLine.getPremium().toString())
					+ Double.parseDouble(crdtLine.getLife_premium().toString())
					+ Double.parseDouble(crdtLine.getPension_premium().toString());
			if (currency.equals("THEBE")) {
				premium = premium / 100;
			}
			TPaypointCrLine crline = modelmapper.map(crdtLine, TPaypointCrLine.class);
			crline.setPaypointId(paypointId);
			crline.setPartyIdentificationCode(null);
			crline.setPartyName(crdtLine.getEmployee_name());
			crline.setPolicyCode(crdtLine.getPolicy_number());
			// crline.setProductId(0);
			crline.setEmployeeCode(crdtLine.getEmployee_number());
			crline.setStrikeDay(null);
			crline.setBankCode(null);
			crline.setBranchCode(null);
			crline.setBankAccountCode(null);
			crline.setBankAccountHolder(null);
			// crline.setBankAccountType(null);
			crline.setCrAmount(new BigDecimal(premium));
			crline.setTPaypointCrHdr(crdtHdr.findById(ppCrHdrId).orElse(null));
			crline.setCollectionPeriod(period);
			crline.setCreationDate(new Date());
			crline.setCreatedBy(null);
			try {
				crdtLineRepo.save(crline);
				msg = "Saved Data into Credit lines Successfully";
			} catch (Exception e) {
				throw new Exception("Error while saving data into Credit lines");
			}

		}
		return msg;

	}

	private List<CreditFileForm> ParseStringDeli(String strFileDPath, String paypointId, CreditFileForm creditFileForm)
			throws Exception {

		LOGGER.info("ParseStringDeli Method Invoked");
		LOGGER.debug("Paypoint ID :" + paypointId);
		LOGGER.debug("Input File Name: " + strFileDPath);
		// String strFilNameNew = ParseFileName(strFileDPath);

		// Reading File buffer
		// -----------------------------------------------------------
		int header_Count = 0;
		header_Count = (int) filecrHdr.findByPaypointId(Long.valueOf(paypointId)).getNoOfCreditHdrLines();
		LOGGER.debug("header_Count  :" + header_Count);
		String strFile = strFileDPath;

		// Getting Tokens per line
		// -----------------------------------------------------------
		int fieldCount = getFieldCount(paypointId);
		int Tokens = getCountTokens(strFileDPath, header_Count);

		LOGGER.debug("Number Of Tokens--  :" + Tokens);
		LOGGER.debug("Number Of field  :" + fieldCount);
		// uncomment below code to ensure strict parsing of credit file
		/*
		 * if (!(fieldCount == Tokens)) { throw new
		 * Exception("File structure is not matching with defined credit file format");
		 * }
		 */

		LOGGER.debug("Get Number of Tokens Method Finished and Number Of Tokens " + Tokens);

		// Getting Fields Name from credit file format
		String[] fieldname = getFieldName(Tokens, paypointId);
		LOGGER.debug("Get Fields Method Finished and Total number of fields" + fieldname.length);

		String strLine = "";
		StringTokenizer st = null;
		int line_Number = 0, token_Number = 0;

		Class[] types = new Class[] {};
		types = new Class[] { String.class };

		LOGGER.debug(" Total Header  Records" + header_Count);
		boolean first_Line;
		if (header_Count > 0) {
			first_Line = true;
		} else {
			first_Line = false;
		}

		// Number of Trailer Record
		String Trailer_Const = "9999***";
		String strDelimiter = ",";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(strFile));
			// Reading file
			while ((strLine = br.readLine()) != null) {
				// skip header lines
				// ---------------------------------------------------------
				// if ((first_Line == true) && (header_Count > 0)) {
				if (header_Count > 0) {
					LOGGER.debug("SKIP HEADER INVOKED   --------------------------->");
					header_Count = header_Count - 1;
					// first_Line = false;
					continue;
				} else {
					// skip trailer record
					if (strLine.startsWith(Trailer_Const)) {
						continue;
					} else {
						creditFileForm = new CreditFileForm();
						line_Number++;

						st = new StringTokenizer(strLine, strDelimiter);

						while (st.hasMoreTokens()) {
							token_Number++;
							Method method = null;
							String strFieldName = null;
							String strField = st.nextToken();

							if (token_Number > Tokens) {
								continue;
							} else {
								if (fieldname.length > 0) {
									strFieldName = fieldname[token_Number - 1];
									if ((strFieldName == null) || (strFieldName.isEmpty())) {/// for skiping columns
																								/// from
																								/// ffile
										LOGGER.debug("no field found");
										continue;
									} else {
										strFieldName = getMethodName(strFieldName);
										method = creditFileForm.getClass().getMethod(strFieldName, types);
										method.invoke(creditFileForm, strField.trim());
									}
								}
							}

						}

					}
					// reset token number
					token_Number = 0;
					this.getCrFileLines().add((CreditFileForm) creditFileForm);
				}
			}
		} finally {
			// to avoid memory leaks
			if (br != null) {
				br.close();
			}
		}
		LOGGER.debug("File Reading Finished And Total Records " + crFileLines.size());
		System.out.println("File Parsing Finished.................");
		return crFileLines;
	}

	public List<CreditFileForm> ParseCSV(String strInputFile, String strPayPointID, Object ObjcreditFileDTO)
			throws Exception {

		// refer to this articale to understnd the code better
		// https://www.callicoder.com/java-read-write-csv-file-opencsv/
		LOGGER.info("ParseStringDeli Method Invoked");
		LOGGER.debug("Paypoint ID :" + strPayPointID);
		LOGGER.debug("Input File Name: " + strInputFile);

		LOGGER.info("CSV ParseStringDeli Method Invoked");
		LOGGER.debug("Paypoint ID :" + strPayPointID);
		LOGGER.debug("Input File Name: " + strInputFile);

		long headerCount = 0;
		CSVReader reader = null;
		try {
			headerCount = filecrHdr.findByPaypointId(Long.valueOf(strPayPointID)).getNoOfCreditHdrLines();
			// reader = new CSVReaderBuilder(new
			// FileReader(strInputFile)).withSkipLines(1).build();
			int Tokens = getCountTokensForCSV(strInputFile, (int) headerCount);
			String[] columns = getFieldName(Tokens, strPayPointID);

			// String Trailer_Const = "9999***";
			LOGGER.debug("ARRAY LENGTH :" + columns.length);
			ColumnPositionMappingStrategy<CreditFileForm> strategy = new ColumnPositionMappingStrategy<CreditFileForm>();
			strategy.setType(CreditFileForm.class);
			strategy.setColumnMapping(columns);
			// CsvToBean<CreditFileForm> csv = new CsvToBean<CreditFileForm>();
			CsvToBean<CreditFileForm> csvToBean = new CsvToBeanBuilder<CreditFileForm>(new FileReader(strInputFile))
					.withMappingStrategy(strategy).withSkipLines(1).withIgnoreLeadingWhiteSpace(true).build();
			crFileLines = csvToBean.parse();

			LOGGER.debug("Number of record :" + crFileLines.size());
		} catch (Exception e) {
			throw new Exception("Error raised at Parsing given CSV credit file");
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		return crFileLines;

	}

	private int getFieldCount(String strPayPointID) {
		return (int) crFileFormatRepo.getFieldCount(Long.valueOf(strPayPointID));
	}

	public String getMethodName(String name) {
		// logger.info("getMethodName Method Invoked"+name);
		String strMethod = null;
		try {
			strMethod = "set" + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		} catch (Exception e) {
			LOGGER.error("Error Occured : ", e);

		}
		return strMethod;
	}

	public String ParseFileName(String strInputFile) {
		// String strPayPointID
		String strFileName = null;
		try {
			int lastIndex = strInputFile.lastIndexOf("/");
			strFileName = strInputFile.substring(lastIndex + 1);

		} catch (Exception e) {

		}

		return strFileName;
	}

	public int getCountTokensForCSV(String strFile, int header_Count) throws IOException {
		// System.out.println(name);

		LOGGER.info("Get Token count For CSV Meyhod Invoked");
		int countTokens = 0;
		BufferedReader inputFile = null;
		String[] line;
		try {
			// inputFile = new BufferedReader(new FileReader(strFile));
			CSVReader reader = new CSVReader(new FileReader(strFile));

			// For each line read, increment the counter
			int i = 0;
			int count = 0;

			while ((line = reader.readNext()) != null) {

				{
					count = line.length;
					if (i > 3) {
						return count;
					}

					i++;
				}
				// logger.debug("Number of Tokens : " + line.length);
				LOGGER.debug("Number of Tokens: " + line.length);
				// Print the number of lines
				// System.out.println("Number of lines is: " + countTokens);
			}
		} catch (Exception e) {
			LOGGER.error("Error Occured : ", e);

		} finally {
			// inputFile.close();

			line = null;

		}

		return countTokens;
	}

	/******************************************************************
	 * This function will returns field name for paypoint
	 * 
	 * @param countTokens
	 * @param strPayPointID
	 * @return
	 * @throws IOException
	 *************************************************************/
	public String[] getFieldName(int countTokens, String strPayPointID) throws IOException {

		LOGGER.info("Get Field Name Meyhod Invoked");

		String[] fieldname = new String[countTokens];
		try {
			System.out.println("Number of tokens:   " + countTokens);
			for (int i = 0; i < countTokens; i++) {
				CreditFileFieldFormatForm crf = crFileFormatRepo.getCreditFileFieldFormat(Long.valueOf(strPayPointID),
						i + 1, "LINES");
				if (crf != null) {
					fieldname[i] = crf.getFieldName();

					LOGGER.debug("Token Number:    " + i + "Field Name:    " + crf.getFieldName());
				}
			}

		} catch (Exception e) {
			LOGGER.error("Error Occured : ", e);

		}

		return fieldname;
	}

	public int getCountTokens(String strFile, int header_Count) throws IOException {
		// System.out.println(name);

		LOGGER.info("Get Token count Meyhod Invoked");
		int countTokens = 0;
		BufferedReader inputFile = null;
		String line = "";
		try {
			inputFile = new BufferedReader(new FileReader(strFile));

			// For each line read, increment the counter
			int i = 0;
			while (((line = inputFile.readLine()) != null)) {
				// logger.debug("Inside While loop"+line);
				if (i > 3) {
					return countTokens;
				}
				if (header_Count > 0) {
					LOGGER.debug("GET TOKEN SKIPING HEADER");
					header_Count = header_Count - 1;
					// first_Line = false;
					continue;

				} else {
					StringTokenizer st = null;
					st = new StringTokenizer(line, ",");
					countTokens = st.countTokens();
					// logger.debug("Count------------------------------------"+countTokens);
				}
				i++;
			}

			LOGGER.debug("Number of Tokens : " + countTokens);

		} catch (Exception e) {
			LOGGER.error("Error Occured : ", e);

		} finally {
			inputFile.close();
			line = null;
		}

		return countTokens;
	}

}
