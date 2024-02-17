package testng2;

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

public class TestNGsuites {
	

	@Test(priority=1,groups= {"dev test"})
	public void rTestMethod() {
		System.out.println("You are in R Test Method in suite2");
	}

	@Test(priority=0,groups= {"dev test"})
	public void zTestMethod() {
		System.out.println("You are in Z Test Method in siute2");
	}

	
	@Test(priority=2,groups= {"release test"})
	public void testMethod1() {
		System.out.println("You are in Test Method 1 in siute2");
	}
	
	
	@Test(priority=3,groups= {"release test"})
	public void testMethod2() {
		System.out.println("You are in Test Method 2 in siute2");
	}

	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("You are in Before Test in siute2");		
	}

	@AfterTest
	public void afterTestMethod() {
		System.out.println("You are in After Test in siute2");		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("You are in Before Method in siute2");		
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("You are in After Method in siute2");		
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("You are in Before Suite in siute2");		
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("You are in After Suite in siute2");		
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("You are in Before Groups in siute2");		
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("You are in After Groups in siute2");		
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("You are in Before Class in siute2");		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("You are in After Class in siute2");		
	}

}
