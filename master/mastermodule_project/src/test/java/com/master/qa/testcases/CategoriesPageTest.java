package com.master.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.master.qa.base.BASETEST;
import com.master.qa.pages.CategoriesPage;
import com.master.qa.pages.ConditionPage;
import com.master.qa.pages.HOMEPAGE;
import com.master.qa.pages.LOGINPAGE;
import com.master.qa.pages.SubCategoriesPage;
import com.master.qa.pages.UserTypesPage;
import com.master.qa.utils.UTILSTEST;

public class CategoriesPageTest extends BASETEST  {
      
	LOGINPAGE loginpage;
	HOMEPAGE homepage;

	CategoriesPage categoriespage;
	
	public  CategoriesPageTest () throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LOGINPAGE();
		homepage = new HOMEPAGE();
	     categoriespage = new CategoriesPage();
		homepage = loginpage.VerifyLoginPage();
		categoriespage = homepage.VerifyCategoriesPage();
	}
	@Test
	public void VerifycategoriespageTitleTest() {
		String title = categoriespage.VerifyCategoriesPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}	
		@Test
		public void VerifycategoriespageTest() throws Throwable {
			categoriespage.VerifyCategoriesPage();
		}
		@AfterMethod
		public void teardown() {
			driver.quit();
		
}
}
	
	
	
	
	
	
	

