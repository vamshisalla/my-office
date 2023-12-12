package com.master.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.master.qa.base.BASETEST;

public class HOMEPAGE extends BASETEST {
	@FindBy(xpath = "//i[@class='fa fa-database']")
	WebElement masters;
	
	@FindBy(xpath = "//a[text()='User Types']")
	WebElement usertypes;
	@FindBy(xpath = "//a[text()='Categories']")
	WebElement category;
	
	@FindBy(xpath = "//a[text()='Sub Categories']")
	WebElement subcat;
	
	@FindBy(xpath = "//a[@href='/Master/Loctation']")
	WebElement loc;
	
	@FindBy(xpath = "//a[text()='Condition']")
	WebElement cond;
	
	@FindBy(xpath = "//a[text()='Inventory Status']")
	WebElement invst;
	
	@FindBy(xpath = "//a[text()='Holidays']")
	WebElement holidays;
	
	@FindBy(xpath = "//a[text()='Shifts']")
	WebElement shifts;
	
	@FindBy(xpath = "//a[text()='Taxes']")
	WebElement taxes;
	
	@FindBy(xpath = "//a[text()='MRP Factors']")
	WebElement mrpfactors;
	
	
	public HOMEPAGE() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifyEhomepageTitle() {
		return driver.getTitle();
	}
	public UserTypesPage VerifyUserTypesPage() throws Throwable {
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		usertypes.click();
	
		return new UserTypesPage();
	}
	public CategoriesPage VerifyCategoriesPage() throws Throwable {
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		category.click();
		return new CategoriesPage();
		
	}
	public SubCategoriesPage VerifySubCategoriesPage() throws Throwable {
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		subcat.click();
		return new SubCategoriesPage();
	}
	public LocationPage VerifyLocationPage() throws Throwable {
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		loc.click();
		return new LocationPage();
		
	}
	public ConditionPage VerifyConditionPage() throws Throwable {
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		cond.click();
		return new ConditionPage();
		
		
	}
	public InventoryStatusPage VerifyInventoryStatusPage() throws Throwable {
		
			Thread.sleep(1000);
			masters.click();
			Thread.sleep(1000);
			invst.click();
			return new InventoryStatusPage();
			
			
		
	}
	public HolidaysPage VerifyHolidaysPage() throws Throwable  {
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		holidays.click();
		return new HolidaysPage();
		
		
		
	}
	public ShiftsPage VerifyShiftsPage() throws Throwable {
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		shifts.click();
		return new ShiftsPage();
		
		
		
	}
	public TaxesPage VerifyTAXESPage() throws Throwable {
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		taxes.click();
		return new TaxesPage();
		

		
	}
	public MRPFactorPage VerifyMRPFactorPage() throws Throwable {
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		mrpfactors.click();
		return new MRPFactorPage();
		
		
	}
	public void VerifyHomePage() {
		// TODO Auto-generated method stub
		
	}
}

	
	
	
	

