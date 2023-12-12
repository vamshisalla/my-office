package com.master.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.master.qa.base.BASETEST;
import com.master.qa.pages.CategoriesPage;
import com.master.qa.pages.HOMEPAGE;
import com.master.qa.pages.LOGINPAGE;
import com.master.qa.pages.UserTypesPage;


	public class HOMEPAGETEST extends BASETEST {
		LOGINPAGE loginpage;
		HOMEPAGE homepage;
		
		
		
		
		public HOMEPAGETEST()throws Throwable {
			super();
		}
		@BeforeMethod
		public void setup() throws Throwable{
			initialization();
			loginpage = new LOGINPAGE();
			homepage = new HOMEPAGE();
			     homepage = loginpage.VerifyLoginPage();
			     
		}
		@Test
		public void VerifyEhomepageTitleTest() {
			String title = homepage.VerifyEhomepageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
		}
		@Test
		public void VerifyHomePageTest() throws Throwable  {
			 homepage.VerifyHomePage();
		}
		@AfterMethod
		public void teardown()  {
			driver.quit();
		}
			
		
}
