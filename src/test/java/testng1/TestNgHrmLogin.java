package testng1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.snehatech.DriverManager;
import com.snehatech.login.AdminCreationPage;
import com.snehatech.login.AdminHomePage;
import com.snehatech.login.HomePage;
import com.snehatech.login.OrangeHrmLogin;

public class TestNgHrmLogin {
	@BeforeTest
	public void Setup() {
		DriverManager.driverinstance();
		DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("App Launched");
	}
	
	@Test
	public void Login() {
		OrangeHrmLogin objlogin=new OrangeHrmLogin(DriverManager.getDriver());
		objlogin.loginToPage("Admin","admin123");
		HomePage homePage = new HomePage(DriverManager.getDriver());
		AssertJUnit.assertEquals(homePage.getdashboard(), "Dashboard","Vefify Home Page");
		homePage.clickadmin();
		homePage.waitTime(2);
		
		AdminHomePage adminPage=new AdminHomePage(DriverManager.getDriver());
		adminPage.addadmin();
		adminPage.waitTime(4);
		
		AdminCreationPage adminCreation=new AdminCreationPage(DriverManager.getDriver());
		adminCreation.createAdminUser();
		adminCreation.waitTime(8);
	}
	
	@AfterTest
	public void Release() {
		DriverManager.closedriver();
	}
}
