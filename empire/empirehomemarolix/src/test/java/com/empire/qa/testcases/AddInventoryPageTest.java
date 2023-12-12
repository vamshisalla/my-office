package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.AddInventoryPage;
import com.empire.qa.pages.AllInventoryPage;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;
import com.empire.qa.utils.UtilsTest;

public class AddInventoryPageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	AddInventoryPage addinventorypage;
	AllInventoryPage allinventorypage;
	static String shname = "Sheet1";
	
	
	public AddInventoryPageTest() throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		addinventorypage = new AddInventoryPage();
		allinventorypage = new AllInventoryPage();
		homepage = loginpage.VerifyLoginPage();
		addinventorypage = homepage.VerifyHomePage();
	}
	@Test
	public void VerifyaddinventoryTitleTest() {
		String title = addinventorypage.VerifyaddinventoryTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	@DataProvider
	public static Object[][] ExcelData()   {
		Object[][] data = UtilsTest.getExcelData(shname);
		return data;
	}
	
	
	
	
	@Test(dataProvider = "ExcelData")
	public void VerifyAddInventoryTest(String modelnumber, String title, String itemdescription, String brand, String height, String width, String breadth, String colorname, String actualprice, String hsncode, String rackname, String invoicenum, String qty) throws Throwable {
		addinventorypage.VerifyAddInventory(modelnumber, title, itemdescription, brand, height, width, breadth, colorname, actualprice, hsncode, rackname, invoicenum, qty);
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	
	
	
	
	}
	
	
	}


