package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@AfterClass(groups={"Smoke"})  	// used this to group and then filter to get desired output
	public void afc() {
		System.out.println("*		AFTER CLASS		");
	}
	
	@AfterSuite
	public void Real_First() {
		System.out.println("*		I Am Laaaassstttt		*");
	}
	
	@AfterMethod(timeOut=4000)		//used this to wait for the given time & then give error, works like WAITS
	public void AF_Meth() {
		System.out.println("*	AFTER EVERY METHOD	*");
	}
	
	
	@Test(groups={"Smoke"})
	public void WebLogin_CarLoan() {
		//selenium
		System.out.println("webLogin_Car");
	}
	
	@Parameters({ "URL", "APIKey/username"})
	@Test
	public void Modification_CarLoan(String url, String key) {
		
		System.out.println("Modification_Car");
		System.out.println(url);
		System.out.println(key);
	}
	
	@Test
	public void MobileLogin_CarLoan() {
//		Appium
		System.out.println("mobileLogin_Car");
	}
	
	@Test(dataProvider="getData")
	public void MobileSignOUT_CarLoan(String username, String password) {
//		FOR ACCESSING THE RETURNED DATA DETAILS AND PRINT THEM
		System.out.println("MobileSignOUT_Car");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(enabled=false) // to skip any method
	public void APILogin_CarLoan() {
//		Rest API Automation
		System.out.println("APILogin_Car");
	}
	
	
	@Test 
	public void API_SignIn_CarLoan(String url) {
//		Rest API Automation
		System.out.println("APISignIn_Car");
		
	}
	
	@Test(dependsOnMethods = {"WebLogin_CarLoan", "MobileLogin_CarLoan"}) 	// These 2 methods will execute first and then the below method
	public void API_SignOut_CarLoan() {
//		Rest API Automation
		System.out.println("APISignOut_Car");
		
	}
	
	@BeforeSuite(groups={"Smoke"})
	public void Real_Last() {
		System.out.println("*		I Am Fiiiirrrrsssstttt		*");
	}
	
	@BeforeMethod
	public void BF_Meth() {
		System.out.println("*	BEFORE EVERY METHOD		*");
	}
	
	
	@BeforeClass
	public void bfc() {
		System.out.println("*		BEFORE CLASS		");
	}
	
	@DataProvider
	public Object[][] getData() {
		// 1st combination : username - password -  good credit history 
		// 2nd combination : username - pasword  - 	bad credit history
		// 3rd combination : username - password - 	fraudlent history 
		
		Object [][] data = new Object[3][2];
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}
}
