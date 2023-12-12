package com.master.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.master.qa.base.BASETEST;
import com.master.qa.pages.HOMEPAGE;
import com.master.qa.pages.LOGINPAGE;
import com.master.qa.pages.ShiftsPage;
import com.master.qa.pages.TaxesPage;

public class TaxesPageTest extends BASETEST {
	LOGINPAGE loginpage;
	HOMEPAGE homepage;

	TaxesPage taxespage;
	
	public  TaxesPageTest () throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LOGINPAGE();
		homepage = new HOMEPAGE();
	     taxespage = new TaxesPage();
		homepage = loginpage.VerifyLoginPage();
		taxespage = homepage.VerifyTAXESPage();
	}
	@Test
	public void VerifytaxespageTitleTest() {
		String title = taxespage.VerifyTaxesPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
		
		
		
		@Test
		public void VerifytaxespageTest() throws Throwable {
			taxespage.VerifyTaxesPage();
		}
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
	
}
