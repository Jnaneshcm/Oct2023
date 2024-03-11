package com.cucumber.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;
import com.cucumber.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseTest{
	
	BasePage page;
	PageFactory pageFactory = new PageFactory();
	
	@Given("User launch application")
	public void user_launch_application() {
	   launchapplication();
	}
	
	@Given("User is on {string}")
	public void user_is_on(String pageName) {
		page = pageFactory.initialize(pageName);
	}
	
	
	@Then("User Enter into the textbox {string} {string}")
	public void user_enter_into_the_textbox(String logicalName, String value) {
	    page.enterIntoTextbox(logicalName, value);
	}
	
	
	@Then("User Click on Button {string}")
	public void user_click_on_button(String logicalName) {
	 page.clickonButton(logicalName);
	}
	
	@After
	public void teardown(Scenario scenario) {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		driver.close();
		driver =null;
	}
	

}
