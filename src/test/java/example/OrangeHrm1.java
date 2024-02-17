package example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.snehatech.DriverManager;


public class OrangeHrm1 {
	//static DriverManager dr=new DriverManager();
	public static void main(String args[]) throws InterruptedException {
		
		/*System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();*/
		WebDriver driver=DriverManager.driverinstance("chrome");
		//WebDriver driver=dr.getDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
			String userName="Admin";
		    System.out.println("User name :"+userName);
			driver.findElement(By.name("username")).sendKeys(userName);
			Thread.sleep(4000);
			
			String password="admin123";
			driver.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(4000);
		    System.out.println("Password is :"+password);

		    driver.findElement(By.className("orangehrm-login-button")).click();
			Thread.sleep(5000);
			boolean loginSuccess = false;
			try {
				if (driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed()) {
					loginSuccess = true;
				}
			}
			catch (NoSuchElementException e) {
				
			}
			
			if( loginSuccess) {
				System.out.println("Successfully logged in for User: " + userName);
				driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();							
				Thread.sleep(5000);
		    }
			else {
				System.out.println("Unable to login with the User: " + userName);				
			}
			
		//driver.quit();
	    DriverManager.closedriver();
	}

		
	}


