package com.master.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.master.qa.base.BASETEST;

public class TaxesPage extends BASETEST {
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	WebElement addnewtax;
         
	@FindBy(xpath = "//select[@name='TaxName']")
	WebElement taxname;
	
	@FindBy(xpath = "//input[@name='TaxAmount']")
	WebElement taxamount;
	
//	@FindBy(xpath = " //option[text()=' Furniture']")
//	WebElement catname;
	
	
//	@FindBy(xpath = "//option[text()='Beds']")
//	WebElement subcatname;
	
	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;
	
	public TaxesPage()throws Throwable{
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifyTaxesPageTitle() {
		return driver.getTitle();
	}
	
	public void VerifyTaxesPage() throws Throwable {
		   
		    Thread.sleep(1000);
           addnewtax.click();
           taxname.sendKeys("GST");
           taxamount.sendKeys("500");
       //    catname.sendKeys("Furniture");
        //   subcatname.sendKeys("Beds");
           Thread.sleep(1000);
           save.click();
	}
	
	
	
}
