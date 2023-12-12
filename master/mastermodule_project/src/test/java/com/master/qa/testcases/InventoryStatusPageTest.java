package com.master.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.master.qa.base.BASETEST;
import com.master.qa.pages.HOMEPAGE;
import com.master.qa.pages.InventoryStatusPage;
import com.master.qa.pages.LOGINPAGE;

public class InventoryStatusPageTest extends BASETEST {
	LOGINPAGE loginpage;
	HOMEPAGE homepage;

	InventoryStatusPage inventorystatuspage;
	
	public  InventoryStatusPageTest () throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LOGINPAGE();
		homepage = new HOMEPAGE();
	     inventorystatuspage = new InventoryStatusPage();
		homepage = loginpage.VerifyLoginPage();
		inventorystatuspage = homepage.VerifyInventoryStatusPage();
	}
	@Test
	public void VerifyinventorystatusTitleTest() {
		String title = inventorystatuspage.VerifyInventoryStatusPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
		
		
		
		@Test
		public void VerifyinventorystatuspageTest() throws Throwable {
			inventorystatuspage.VerifyInventoryStatusPage();
		}
		@AfterMethod
		public void teardown() {
			driver.quit();
		}	
}
