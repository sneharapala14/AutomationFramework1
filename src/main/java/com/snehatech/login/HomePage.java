package com.snehatech.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snehatech.actions.ActionClasses;

public class HomePage extends ActionClasses{
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement locatedashboard;
	
	@FindBy(linkText="Admin")
	WebElement locateadmin;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public String getdashboard() {
		String dashboard1=locatedashboard.getText();
		System.out.println("Expected Text is: "+dashboard1);
		return dashboard1;
		}
	public void clickadmin() {
		locateadmin.click();
	}

}
