package com.master.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.master.qa.base.BASETEST;
import com.master.qa.pages.HOMEPAGE;
import com.master.qa.pages.LOGINPAGE;
import com.master.qa.pages.MRPFactorPage;
import com.master.qa.pages.TaxesPage;

public class MRPFactorPageTest extends BASETEST {
	LOGINPAGE loginpage;
	HOMEPAGE homepage;

	MRPFactorPage mrpfactorpage;
	
	public  MRPFactorPageTest () throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LOGINPAGE();
		homepage = new HOMEPAGE();
	     mrpfactorpage = new MRPFactorPage();
		homepage = loginpage.VerifyLoginPage();
		mrpfactorpage = homepage.VerifyMRPFactorPage();
	}
	@Test
	public void VerifymrpfactorpageTitleTest() {
		String title = mrpfactorpage.VerifyMRPFactorPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
		
		
		
		@Test
		public void VerifymrpfactorpageTest() throws Throwable {
			mrpfactorpage.VerifyMRPFactorPage();
		}
	@AfterMethod
		public void teardown() {
			driver.quit();
	}
}
