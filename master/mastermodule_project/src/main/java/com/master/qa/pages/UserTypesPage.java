package com.master.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.master.qa.base.BASETEST;

public class UserTypesPage extends BASETEST {
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	WebElement addnewusertypes;
         
	@FindBy(xpath = "//input[@name='TypeName']")
	WebElement typename;
	
	@FindBy(xpath = "//input[@name='TypeCode']")
	WebElement typecode;
	
	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;
	

	
	
	public UserTypesPage()throws Throwable{
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifyusertypesTitle() {
		return driver.getTitle();
	}
	public void VerifyUserTypesPage() throws Throwable {
		   
	    Thread.sleep(1000);
       addnewusertypes.click();
       typename.sendKeys("emp");
       typecode.sendKeys("789");
       Thread.sleep(1000);
       save.click();

	}
	
	
	
}
