package com.sais.cashoffice.CashOfficeTest.paypointtransaction.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sais.cashoffice.CashOfficeTest.entities.TPaypointDrHdr;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.SplitDebitFileForm;

public class FileMerge {
	private static final Logger LOGGER = LogManager.getLogger(FileMerge.class);
	public static final Path mergedFiles = Paths.get("Merge_FilesDir");
	public static final String MERGE_SOURCE_DIR_KEY = "mergeSourceDir";
	public static final String MERGE_DESTN_DIR_KEY = "mergeDestnDir";

	public static Map<String, String> getMergeFilePath() {

		LOGGER.info("Get Merge File Path Invoked");

		File mergeFileDir = new File(FileSplit.premDebits + File.separator + mergedFiles.toString());

		if (!mergeFileDir.exists()) {
			boolean createReportDir = mergeFileDir.mkdir();
			LOGGER.debug("Created Merge Dir : " + createReportDir);
		}

		Map<String, String> filePathMap = new HashMap<String, String>();
		filePathMap.put(MERGE_DESTN_DIR_KEY, mergeFileDir.toString());
		filePathMap.put(MERGE_SOURCE_DIR_KEY, FileSplit.premDebits.toString());

		return filePathMap;

	}

	public static void mergeFiles(List<SplitDebitFileForm> checkedSplitMergeDTOs, String createdNewFileName,
			Map<String, String> mergeFilePath) throws IOException {

		LOGGER.info("Merge Files INVOKED");
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		BufferedWriter bw = null;
		BufferedReader br = null;

		try {

			StringBuilder destnFile = new StringBuilder();
			destnFile.append(mergeFilePath.get(MERGE_DESTN_DIR_KEY));
			destnFile.append(File.separator);
			destnFile.append(dateFormat.format(date) + "-" + createdNewFileName);

			FileWriter fw = new FileWriter(destnFile.toString());
			bw = new BufferedWriter(fw);

			for (SplitDebitFileForm checkedSplitMergeDTO : checkedSplitMergeDTOs) {
				LOGGER.debug("FileName : " + checkedSplitMergeDTO.getFileName());

				StringBuilder sourceFile = new StringBuilder();
				sourceFile.append(mergeFilePath.get(MERGE_SOURCE_DIR_KEY));
				sourceFile.append(File.separator);
				sourceFile.append(checkedSplitMergeDTO.getFileName());

				FileReader fr = new FileReader(sourceFile.toString());
				br = new BufferedReader(fr);

				String data = null;
				while ((data = br.readLine()) != null) {
					bw.write(data);
					bw.write("\n");
				}

				br.close();
			}

		} finally {
			if (br != null) {
				br.close();
			}

			if (bw != null) {
				bw.close();
			}

		}
		// return createdNewFileName;
	}

}
