package com.snehatech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class DriverManager {
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static WebDriver driverinstance() {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	public static WebDriver driverinstance(String browsername) {
		switch(browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		}
		System.out.println("Driver Initialized");
		return driver;
	}
	public static void closedriver() {
		driver.quit();
		System.out.println("Driver Closed");
	}
}
