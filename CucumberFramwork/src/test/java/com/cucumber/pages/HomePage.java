package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class HomePage extends BasePage{
	static WebDriver driver ; 
	public HomePage() {
		super(driver = BaseTest.getDriver());
		addObject("Home", By.xpath("//a[text()='Home']")); 
		addObject("Firstname", By.id("name"));
		addObject("Lastname", By.id("lname"));
		addObject("PostalAddress", By.id("lname"));
	}

}
