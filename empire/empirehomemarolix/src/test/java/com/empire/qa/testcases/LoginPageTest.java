package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() throws Throwable{
		super();
	}
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
	}
	@Test
	public void VerifyEhomeTitleTest() {
	String title = 	loginpage.VerifyEhomeTitle();
	Assert.assertEquals(title,"Empire Home Admin Panel");
	}
	@Test
	public void VerifyEhomeImageTest()  {
		boolean img = loginpage.VerifyEhomeImage();
		Assert.assertTrue(img);
	}
	@Test
	public void VerifyLoginPageTest() throws Throwable  {
		homepage = loginpage.VerifyLoginPage();
	}
	@AfterMethod
	public void teardown() {
	driver.quit();
		
	}		
		
	}


