package com.master.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.master.qa.base.BASETEST;
import com.master.qa.pages.HOMEPAGE;
import com.master.qa.pages.HolidaysPage;
import com.master.qa.pages.InventoryStatusPage;
import com.master.qa.pages.LOGINPAGE;

public class HolidaysPageTest extends BASETEST {
	LOGINPAGE loginpage;
	HOMEPAGE homepage;

	HolidaysPage  holidayspage;
	
	public  HolidaysPageTest () throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LOGINPAGE();
		homepage = new HOMEPAGE();
	     holidayspage = new HolidaysPage();
		homepage = loginpage.VerifyLoginPage();
		holidayspage = homepage.VerifyHolidaysPage();
	}
	@Test
	public void VerifyholidayspageTitleTest() {
		String title = holidayspage.VerifyHolidaysPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
		
		
		
		@Test
		public void VerifyholidayspageTest() throws Throwable {
			holidayspage.VerifyHolidaysPage();
		}
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
}

