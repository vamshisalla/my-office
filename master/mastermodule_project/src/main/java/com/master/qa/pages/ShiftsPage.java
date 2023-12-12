package com.master.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.master.qa.base.BASETEST;

public class ShiftsPage extends BASETEST {
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	WebElement addnewshifts;
         
	@FindBy(xpath = "//input[@name='ShiftName']")
	WebElement shiftname;
	
	@FindBy(xpath = "//input[@name='StartTime']")
	WebElement starttime;
	
	@FindBy(xpath = "//input[@name='EndTime']")
	WebElement endtime;
	
	
	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;
	    
	public ShiftsPage()throws Throwable{
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifyShiftsPageTitle() {
		return driver.getTitle();
	}
	
	public void VerifyShiftsPage() throws Throwable {
		   
		    Thread.sleep(1000);
           addnewshifts.click();
           shiftname.sendKeys("home");
           starttime.sendKeys("9:00PM");
           endtime.sendKeys("6:00AM");
           Thread.sleep(1000);
          save.click();
	}
	
	
	
	
	
}
