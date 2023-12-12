package com.master.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.master.qa.base.BASETEST;
import com.master.qa.pages.HOMEPAGE;
import com.master.qa.pages.LOGINPAGE;
import com.master.qa.pages.LocationPage;
import com.master.qa.pages.SubCategoriesPage;

public class LocationPageTest extends BASETEST  {

	LOGINPAGE loginpage;
	HOMEPAGE homepage;

	LocationPage locationpage;
	
	public  LocationPageTest () throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LOGINPAGE();
		homepage = new HOMEPAGE();
	     locationpage = new LocationPage();
		homepage = loginpage.VerifyLoginPage();
		locationpage = homepage.VerifyLocationPage();
	}
	@Test
	public void VerifylocationpageTitleTest() {
		String title = locationpage.VerifyLocationPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
		
		
		
		@Test
		public void VerifylocationpageTest() throws Throwable {
			locationpage.VerifyLocationPage();
		}
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
}
	


     
