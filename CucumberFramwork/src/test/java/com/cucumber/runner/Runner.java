package com.cucumber.runner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\workspaces\\October23\\CucumberFramwork\\feature\\Login.feature",
                  glue= {"com.cucumber.steps"},
                  plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
                		               "json:target/cucumber-reports/cucumber.json" },
                  publish=true
                
		)


public class Runner {

	@AfterClass
	public static void teardown() throws InterruptedException {
	
		String Source = System.getProperty("user.dir")+ "\\target\\html-reports\\cucumber-html-reports\\overview-features.html";
		String destination = System.getProperty("user.dir")+"\\target\\html-reports\\cucumber-html-reports\\report.png";
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Source);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);		
		File destFile = new File(destination);
		
		driver.close();
		driver=null;
		try {
			Files.copy(srcfile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}
