package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class LoginPage extends BasePage {
	
	static WebDriver driver ; 
	public LoginPage() {
		super(driver = BaseTest.getDriver());
		addObject("username", By.id("email_field"));
		addObject("password", By.id("password_field"));
		addObject("loginButton", By.xpath("//button[contains(text(),'Login')]"));
	}

	

}
