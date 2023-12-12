package com.master.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.master.qa.base.BASETEST;
import com.master.qa.pages.HOMEPAGE;
import com.master.qa.pages.LOGINPAGE;



public class LOGINPAGETEST extends BASETEST {
	LOGINPAGE loginpage;
	HOMEPAGE homepage;

	
	public LOGINPAGETEST() {
		super();
	}
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LOGINPAGE();
		homepage = new HOMEPAGE();
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
	
	
	

