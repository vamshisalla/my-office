package com.master.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.master.qa.base.BASETEST;

public class LocationPage extends BASETEST {

	@FindBy(xpath = "//i[@class='fa fa-plus']")
	WebElement addnewlocation;
         
	@FindBy(xpath = "//input[@id='LocationName']")
	WebElement locationname;
	
	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;
	
	public LocationPage()throws Throwable{
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifyLocationPageTitle() {
		return driver.getTitle();
	}
	
	public void VerifyLocationPage() throws Throwable {
		   
		    Thread.sleep(1000);
           addnewlocation.click();
           locationname.sendKeys("hyderabad");
           Thread.sleep(1000);
           save.click();
	}
	
	
	
	
	
	
	
	
}
