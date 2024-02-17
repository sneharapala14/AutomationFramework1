package com.snehatech.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snehatech.actions.ActionClasses;

public class OrangeHrmLogin extends ActionClasses{
	/*By locateUsername=By.name("username");
	By locatePassword=By.name("password");
	By locatebuttonlgn=By.className("orangehrm-login-button");*/
	
	@FindBy(name="username")
	WebElement locateUsername;
	
	@FindBy(name="password")
	WebElement locatePassword;
	
	@FindBy(className="orangehrm-login-button")
	WebElement locatebuttonlgn;
	
	public OrangeHrmLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setUsername(String username) {
		sendtext(locateUsername, username);
	}
	
	public void setPassword(String password) {
		locatePassword.sendKeys(password);
	}
	
	public void clickLogin() {
		locatebuttonlgn.click();
	}
	
	
	
	public void loginToPage(String username,String password) {
		this.setUsername(username);
		this.setPassword(password);
		this.clickLogin();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
