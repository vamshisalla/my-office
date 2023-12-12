package com.master.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.master.qa.base.BASETEST;
import com.master.qa.pages.HOMEPAGE;
import com.master.qa.pages.LOGINPAGE;
import com.master.qa.pages.SubCategoriesPage;
import com.master.qa.utils.UTILSTEST;

public class SubCategoriesPageTest extends BASETEST {

	LOGINPAGE loginpage;
	HOMEPAGE homepage;

	SubCategoriesPage subcategoriespage;
	
	
	
	public  SubCategoriesPageTest () throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LOGINPAGE();
		homepage = new HOMEPAGE();
	     subcategoriespage = new SubCategoriesPage();
		homepage = loginpage.VerifyLoginPage();
		 subcategoriespage = homepage.VerifySubCategoriesPage();
	}
	@Test
	public void VerifysubcategoriespageTitleTest() {
		String title = subcategoriespage.VerifySubCategoriesPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
		
		
		
		@Test
		public void VerifysubcategoriespageTest() throws Throwable {
			subcategoriespage.VerifySubCategoriesPage();
		}
	@AfterMethod
		public void teardown() {
			driver.quit();
	}
}
	
	
	

