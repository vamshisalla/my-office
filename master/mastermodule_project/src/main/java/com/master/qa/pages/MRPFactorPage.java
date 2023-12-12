package com.master.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.master.qa.base.BASETEST;

public class MRPFactorPage extends BASETEST {
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	WebElement addnewmrp;
         
	@FindBy(xpath = "//input[@id='FactorName']")
	WebElement factorname;
	
	@FindBy(xpath = "//input[@id='FactorValue']")
	WebElement factorvalue;
	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;
	
	public MRPFactorPage()throws Throwable{
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifyMRPFactorPageTitle() {
		return driver.getTitle();
	}
	
	public void VerifyMRPFactorPage() throws Throwable {
		   
		    Thread.sleep(1000);
           addnewmrp.click();
           factorname.sendKeys("GST");
           factorvalue.sendKeys("9.00");
           Thread.sleep(1000);
           save.click();
	}
	
	
}
