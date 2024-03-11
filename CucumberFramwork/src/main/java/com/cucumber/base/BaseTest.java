package com.cucumber.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected static WebDriver driver;
	static CommonUtilities common = new CommonUtilities();
	
	public static void launchapplication() {
		driver = getDriver();
	    
		driver.get("https://selenium-prd.firebaseapp.com/");
	}
	
	public static WebDriver getDriver() {
		if(driver ==null) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  }
		return driver;
	}

}
