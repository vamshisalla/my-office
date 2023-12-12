package com.master.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.master.qa.base.BASETEST;

public class HolidaysPage extends BASETEST {
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	WebElement addnewholidays;
         
	@FindBy(xpath = "//input[@class='form-control']")
	WebElement holidaydate;
	
	@FindBy(xpath = "//input[@name='HolidayName']")
	WebElement holidayname;
	
	@FindBy(xpath = "//input[@name='HolidayDesc']")
	WebElement holidaydescription;
	
	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;
	public HolidaysPage()throws Throwable{
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifyHolidaysPageTitle() {
		return driver.getTitle();
	}
	
	public void VerifyHolidaysPage() throws Throwable {
		   
		    Thread.sleep(1000);
           addnewholidays.click();
           holidaydate.sendKeys("01/14/0000");
           holidaydate.sendKeys("01/14/2000");
           holidaydate.sendKeys("00/00/2023");
           holidayname.sendKeys("friday");
           holidaydescription.sendKeys("sankranthi");
           Thread.sleep(1000);
          save.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
