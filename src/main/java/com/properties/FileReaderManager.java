package com.properties;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager() {

	}

	public static FileReaderManager getInstance() {
 FileReaderManager helper = new FileReaderManager();
		return helper;
	}
	
	
	public ConfigurationReader getInstanceCR() throws IOException {
ConfigurationReader reader = new ConfigurationReader();
return reader;
		
		
	}
}
