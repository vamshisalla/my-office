package com.master.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.master.qa.base.BASETEST;
import com.master.qa.pages.ConditionPage;
import com.master.qa.pages.HOMEPAGE;
import com.master.qa.pages.LOGINPAGE;
import com.master.qa.pages.LocationPage;

public class ConditionPageTest extends BASETEST {
	LOGINPAGE loginpage;
	HOMEPAGE homepage;

	ConditionPage conditionpage;
	
	public  ConditionPageTest () throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LOGINPAGE();
		homepage = new HOMEPAGE();
	     conditionpage = new ConditionPage();
		homepage = loginpage.VerifyLoginPage();
		conditionpage = homepage.VerifyConditionPage();
	}
	@Test
	public void VerifyconditionpageTitleTest() {
		String title = conditionpage.VerifyConditionPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
		
		
		
		@Test
		public void VerifyconditionpageTest() throws Throwable {
			conditionpage.VerifyConditionPage();
		}
		@AfterMethod
		public void teardown() {
			driver.quit();
		
		}	

}
