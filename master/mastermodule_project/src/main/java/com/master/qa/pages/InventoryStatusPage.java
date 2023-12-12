package com.master.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.master.qa.base.BASETEST;

public class InventoryStatusPage extends BASETEST {
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	WebElement addnewinventorystatus;
         
	@FindBy(xpath = "//input[@id='StatusName']")
	WebElement statusname;
	
	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;
	
	public InventoryStatusPage()throws Throwable{
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifyInventoryStatusPageTitle() {
		return driver.getTitle();
	}
	
	public void VerifyInventoryStatusPage() throws Throwable {
		   
		    Thread.sleep(1000);
           addnewinventorystatus.click();
           statusname.sendKeys("incomplete");
           Thread.sleep(1000);
           save.click();
	}
	
	
	
	
	
}
