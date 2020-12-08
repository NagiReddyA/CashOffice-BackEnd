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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sais.cashoffice.CashOfficeTest.CashOfficeTestApplication;

public class FileSplit {
	public static final Path tempDebits = Paths.get("Tempdebits");
	public static final Path premDebits = Paths.get("PremiumDebits");
	public static final Path splitFiles = Paths.get("Split_FilesDir");

	public static final String SPLIT_SOURCE_DIR_KEY = "splitSourceDir";
	public static final String SPLIT_DESTN_DIR_KEY = "splitDestnDir";
	

	private static final Logger LOGGER = LogManager.getLogger(FileSplit.class);

	public static Map<String, String> getSplitFilePath() {

		LOGGER.info("SplitFilePath Method Invoked");

		File splitFileDir = new File(premDebits+File.separator+splitFiles.toString());

		if (!splitFileDir.exists()) {
			boolean createSplitFileDir = splitFileDir.mkdir();
			LOGGER.debug("Created Split Files Dir : " + createSplitFileDir);
		}

		LOGGER.debug("Split File Dir Absolute Path : " + splitFileDir.getAbsolutePath());
		System.out.println(splitFileDir.getAbsolutePath());
		Map<String, String> filePathMap = new HashMap<String, String>();
		filePathMap.put(SPLIT_DESTN_DIR_KEY, splitFileDir.toString());
		filePathMap.put(SPLIT_SOURCE_DIR_KEY, premDebits.toString());
		return filePathMap;

	}

	public static Collection<String> splitFiles(int fileLimit, String fileForSplit, Map<String, String> splitFileMap)
			throws IOException {

		LOGGER.info("splitFiles Method Invoked");

		Collection<String> splitfileNames = new ArrayList<String>();
		LOGGER.debug("FileName of the file to be split : " + fileForSplit);

		String sourceFilePath = splitFileMap.get(SPLIT_SOURCE_DIR_KEY);
		String destinationFilePath = splitFileMap.get(SPLIT_DESTN_DIR_KEY);

		File inputFile = new File(sourceFilePath + File.separator + fileForSplit);

		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;

		try {
			FileReader fileReader = new FileReader(inputFile);
			bufferedReader = new BufferedReader(fileReader);

			int currentFileLimit = 1;
			int fileNumber = 1;
			DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
			Date date = new Date();
			System.out.println(dateFormat.format(date));

			File outputFile = new File(destinationFilePath + File.separator + fileNumber + "_" + dateFormat.format(date)
					+ "_" + fileForSplit);
			System.out.println(destinationFilePath + File.separator + fileNumber + "_" + dateFormat.format(date)+ "_" + fileForSplit);
			FileWriter fileWriter = new FileWriter(outputFile);
			bufferedWriter = new BufferedWriter(fileWriter);

			splitfileNames.add(outputFile.getName());

			String readLine = null;
			while ((readLine = bufferedReader.readLine()) != null) {

				bufferedWriter.write(readLine);
				bufferedWriter.write("\n");

				if (currentFileLimit == fileLimit) {
					currentFileLimit = 0;
					fileNumber++;
					bufferedWriter.close();

					outputFile = new File(destinationFilePath + File.separator + fileNumber + "_"
							+ dateFormat.format(date) + "_" + fileForSplit);
					fileWriter = new FileWriter(outputFile);
					bufferedWriter = new BufferedWriter(fileWriter);
					LOGGER.debug("Creating new file : " + outputFile.getName());

					splitfileNames.add(outputFile.getName());
					continue;
				}

				currentFileLimit++;
			}

			return splitfileNames;
		}

		finally {
			LOGGER.debug("Cleaning up file resources");
			if (bufferedReader != null) {
				bufferedReader.close();
			}

			if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}

	}

	public static void main(String[] args) {
		FileSplit split = new FileSplit();
		Map<String, String> splitFileMap = new HashMap<String, String>();
		splitFileMap.put(SPLIT_SOURCE_DIR_KEY,
				"C:\\Documents and Settings\\admin\\Desktop\\split_test");
		splitFileMap.put(SPLIT_DESTN_DIR_KEY,
				"C:\\Documents and Settings\\admin\\Desktop\\split_test");
		try {
			Collection<String> fileNames = split.splitFiles(3, "DRTEST01-MAY-2010.txt", splitFileMap);
			LOGGER.debug(fileNames);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
