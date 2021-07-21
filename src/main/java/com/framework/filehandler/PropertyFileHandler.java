package com.framework.filehandler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileHandler {
	
	Properties property = new Properties();
	
	public void readFile(String path) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		property.load(fis);
	}
	
	public void writeFile(String path) throws IOException {
		FileOutputStream fos = new FileOutputStream(path);
		property.store(fos, null);
	}
	
	public String getData(String path, String key) throws IOException {
		readFile(path);
		return property.getProperty(key);
	}
	
	public void setData(String path ,String key, String value) throws IOException {
		property.setProperty(key, value);
		writeFile(path);
	}
	
	public void deleteData(String key, String path) throws IOException {
		property.remove(key);
		writeFile(path);
	}
}
