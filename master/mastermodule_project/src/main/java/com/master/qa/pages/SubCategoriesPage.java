package com.master.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.master.qa.base.BASETEST;

public class SubCategoriesPage extends BASETEST {


	
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	WebElement addnewsubcat;
         
	@FindBy(xpath = "//select[@id='subcatDD']")
	WebElement categoryname;
	
	@FindBy(xpath = "//input[@id='SubCategoryName']")
	WebElement subcategoryname;
	
	
	
	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;
	
	public SubCategoriesPage()throws Throwable{
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifySubCategoriesPageTitle() {
		return driver.getTitle();
	}
	
	public void VerifySubCategoriesPage() throws Throwable {
		   
		    Thread.sleep(1000);
           addnewsubcat.click();
           categoryname.sendKeys("hall");
           subcategoryname.sendKeys("chairs");
           
           Thread.sleep(1000);
           save.click();
	}
	
	
	
}
