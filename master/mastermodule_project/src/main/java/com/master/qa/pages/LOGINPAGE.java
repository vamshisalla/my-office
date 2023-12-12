package com.master.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.master.qa.base.BASETEST;

public class LOGINPAGE extends BASETEST {
	@FindBy(name="emailid")
	WebElement uname;
	
	@FindBy(id="pword")
	WebElement pwd;
	
	@FindBy(xpath ="//button[text()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath ="//img[@src='/WebApp/assets/dist/img/logo.png']")
	WebElement ehimg;
	
	
	public LOGINPAGE() throws Throwable{
	super();
    PageFactory.initElements(driver, this);
}
	public String VerifyEhomeTitle() {
		return driver.getTitle();
	}
	public boolean VerifyEhomeImage()  {
		return ehimg.isDisplayed();
	}
	public HOMEPAGE VerifyLoginPage() throws Throwable  {
		uname.sendKeys(prop.getProperty("username"));
		pwd.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		return new HOMEPAGE();
			
	}
	
}

