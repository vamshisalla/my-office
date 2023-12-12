package com.master.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.master.qa.base.BASETEST;
import com.master.qa.pages.ConditionPage;
import com.master.qa.pages.HOMEPAGE;
import com.master.qa.pages.LOGINPAGE;
import com.master.qa.pages.ShiftsPage;

public class ShiftsPageTest extends BASETEST {
	LOGINPAGE loginpage;
	HOMEPAGE homepage;

	ShiftsPage shiftspage;
	
	public  ShiftsPageTest () throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LOGINPAGE();
		homepage = new HOMEPAGE();
	     shiftspage = new ShiftsPage();
		homepage = loginpage.VerifyLoginPage();
		shiftspage = homepage.VerifyShiftsPage();
	}
	@Test
	public void VerifyshiftspageTitleTest() {
		String title = shiftspage.VerifyShiftsPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
		
		
		
		@Test
		public void VerifyshiftspageTest() throws Throwable {
			shiftspage.VerifyShiftsPage();
		}
		@AfterMethod
		public void teardown() {
			driver.quit();
		
		}

}
