package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseHRMClass;
import pompackage.PomLogin;


public class LoginTest extends BaseHRMClass {
	PomLogin Log;
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
		initiation();
		
		
		Log=new PomLogin();
	}

	@Test 
	public void Title() {
		String actual= Log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "OrangeHRM");
	}
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
