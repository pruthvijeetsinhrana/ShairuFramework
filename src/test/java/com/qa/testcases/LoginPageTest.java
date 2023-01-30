package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

import dev.failsafe.internal.util.Assert;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	
	
	
	
	public LoginPageTest()	
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void Verify_UserLogin()
	{
		
		
	}

}
