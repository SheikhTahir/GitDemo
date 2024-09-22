package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Intro_TestNG {
	
	@AfterTest
	public void last() {
		System.out.println("I will execute Last");
//		Assert.assertTrue(false);
	}
	
//	@Test
//	public void failing() {
//		Assert.assertTrue(false); 
//	}
	
	@Test
	public void Meth1() {
		System.out.println("Hello");
		Assert.assertTrue(false);		//Did this for checking failure part in LISTENERS topic
	}
	
	
	@Test
	public void Name() {
		System.out.println("Tahir");
		Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void first() {
		System.out.println("I will execute First");
	}

}
