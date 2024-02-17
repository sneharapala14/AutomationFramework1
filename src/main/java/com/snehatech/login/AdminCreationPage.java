package com.snehatech.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snehatech.actions.ActionClasses;

public class AdminCreationPage extends ActionClasses {
	
	
	
	@FindBy(xpath="//label[text()='User Role']/parent::div/following-sibling::div/div/div/div")
	WebElement selectUserRole;
	
	@FindBy(xpath="//div[@role='listbox']/div/following-sibling::div")
	WebElement UserRoleAdmin;
	
	@FindBy(xpath="//label[text()='Employee Name']/parent::div/following-sibling::div/div/div/div/following-sibling::input")
	WebElement txtEmployeeName;
	
	@FindBy(xpath="//label[text()='Status']/parent::div/following-sibling::div/div/div/div")
	WebElement txtStatus;
	
	@FindBy(xpath="//div[@role='listbox']/div/following-sibling::div")
	WebElement valueEnabled;
	
	@FindBy(xpath="//label[text()='Username']/parent::div/following-sibling::div/input")
	WebElement txtUsername;
	
	@FindBy(xpath="//label[text()='Password']/parent::div/following-sibling::div/input")
	WebElement txtPassword;
	
	@FindBy(xpath="//label[text()='Confirm Password']/parent::div/following-sibling::div/input")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement btnSave;
	
	public AdminCreationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createAdminUser() {
		clickbutton(selectUserRole);
		waitTime(2);
		clickbutton(UserRoleAdmin);
		waitTime(2);
		sendtext(txtEmployeeName, "Sravan Rapala");
		clickbutton(txtStatus);
		waitTime(2);
		clickbutton(valueEnabled);
		waitTime(2);
		sendtext(txtUsername, "Sravan1");
		sendtext(txtPassword,"sravan@123");
		sendtext(txtConfirmPassword,"sravan@123");
		clickbutton(btnSave);
		waitTime(4);

		
		
	}
	
	

}
