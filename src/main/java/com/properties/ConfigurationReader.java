package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws IOException {
		File f = new File(
				"C:\\Users\\suren\\eclipse-workspace\\Adactincucumber\\src\\main\\java\\com\\properties\\Adactin_Properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;

	}

	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getUserName() {
		String username = p.getProperty("username");
		return username;

	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}

	public String getCard() {
		String card = p.getProperty("card");
		return card;

	}
}
