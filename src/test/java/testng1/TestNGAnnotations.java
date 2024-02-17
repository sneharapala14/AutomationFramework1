package testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	

	@Test(priority=1,groups= {"dev test"})
	public void rTestMethod() {
		System.out.println("You are in R Test Method");
	}

	@Test(priority=0,groups= {"dev test"})
	public void zTestMethod() {
		System.out.println("You are in Z Test Method");
	}

	
	@Test(priority=2,groups= {"release test"})
	public void testMethod1() {
		System.out.println("You are in Test Method 1");
	}
	
	
	@Test(priority=3,groups= {"release test"})
	public void testMethod2() {
		System.out.println("You are in Test Method 2");
	}

	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("You are in Before Test");		
	}

	@AfterTest
	public void afterTestMethod() {
		System.out.println("You are in After Test");		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("You are in Before Method");		
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("You are in After Method");		
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("You are in Before Suite");		
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("You are in After Suite");		
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("You are in Before Groups");		
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("You are in After Groups");		
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("You are in Before Class");		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("You are in After Class");		
	}

}
