package com.empire.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.AddInventoryPage;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;



public class HomePageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	AddInventoryPage addinventorypage;
	
	
	public HomePageTest()throws Throwable {
		super();
	}
	@BeforeMethod
	public void setup() throws Throwable{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		addinventorypage = new AddInventoryPage();
		     homepage = loginpage.VerifyLoginPage();
	}
	@Test
	public void VerifyEhomepageTitleTest() {
		String title = homepage.VerifyEhomepageTitle();
	Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	@Test
	public void VerifyHomePageTest() throws Throwable  {
		addinventorypage = homepage.VerifyHomePage();
	}
	@AfterMethod
	public void teardown()  {
		driver.quit();
	}
		
	
	
	
	
	
	
		
		
		
		
	}


