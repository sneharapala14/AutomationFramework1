package example22;

import org.openqa.selenium.WebDriver;

import com.snehatech.DriverManager;
import com.snehatech.login.OrangeHrmLogin;

public class HrmLogin {
	OrangeHrmLogin objectlogin;
	
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=DriverManager.driverinstance();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		OrangeHrmLogin objectlogin=new OrangeHrmLogin(driver);
		objectlogin.loginToPage("Admin", "admin123");
	}

}
