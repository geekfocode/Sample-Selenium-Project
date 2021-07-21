package com.framework.filehandler;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class CsvFileHandler {

	public static void writeListOfStringArray(String path, List<String[]> data) {

		File file = new File(path);
		try {
			FileWriter outputFile = new FileWriter(file);
			CSVWriter writer = new CSVWriter(outputFile);
			writer.writeAll(data);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static List<String[]> readLineByLine(String fileToRead) {
		String[] nextRecord = null;
		List<String[]> csvFileData = new ArrayList<>();
		try {
			FileReader reader = new FileReader(fileToRead);
			@SuppressWarnings("resource")
			CSVReader csvReader = new CSVReader(reader);
			while ((nextRecord = csvReader.readNext()) != null) {
				csvFileData.add(nextRecord);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return csvFileData;
	}
}
