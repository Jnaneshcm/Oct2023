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

	
}
