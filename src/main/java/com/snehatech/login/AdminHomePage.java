package com.snehatech.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snehatech.actions.ActionClasses;

public class AdminHomePage extends ActionClasses{
	
	@FindBy(xpath="//button[text()=' Add ']")
	 WebElement btnAddAdmin;
	
	public AdminHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addadmin() {
		clickbutton(btnAddAdmin);
	}

}
