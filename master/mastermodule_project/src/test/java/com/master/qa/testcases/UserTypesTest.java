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
import com.master.qa.pages.UserTypesPage;
import com.master.qa.utils.UTILSTEST;

public class UserTypesTest extends BASETEST {
	LOGINPAGE loginpage;
	HOMEPAGE homepage;

	UserTypesPage usertypespage;
	
	public  UserTypesTest () throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LOGINPAGE();
		homepage = new HOMEPAGE();
	     usertypespage = new UserTypesPage();
		homepage = loginpage.VerifyLoginPage();
		usertypespage = homepage.VerifyUserTypesPage();
	}
	@Test
	public void VerifyusertypespageTitleTest() {
		String title = usertypespage.VerifyusertypesTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
		@Test
		public void VerifyusertypespageTest() throws Throwable {
			usertypespage.VerifyUserTypesPage();
		}
	@AfterMethod
		public void teardown() {
			driver.quit();
	}
}

	
	
	
	
	
