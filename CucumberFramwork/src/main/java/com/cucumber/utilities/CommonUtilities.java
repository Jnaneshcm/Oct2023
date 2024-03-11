package com.cucumber.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {
	public String getproperty(String key) throws IOException {
		
		String spath = "C:\\workspaces\\October23\\CucumberFramwork\\properties\\application.properties";
		FileInputStream fileInput = new FileInputStream(spath);
		Properties prop = new Properties();
		prop.load(fileInput);
		
		String value = prop.getProperty(key);
		
		return value;
	}

}
