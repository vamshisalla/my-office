package com.master.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.master.qa.base.BASETEST;

public class ConditionPage extends BASETEST {

	@FindBy(xpath = "//i[@class='fa fa-plus']")
	WebElement addnewcondition;
         
	@FindBy(xpath = "//input[@id='ConditionName']")
	WebElement conditionname;
	
	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;
	
	
	public ConditionPage()throws Throwable{
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifyConditionPageTitle() {
		return driver.getTitle();
	}
	
	public void VerifyConditionPage() throws Throwable {
		   
		    Thread.sleep(1000);
           addnewcondition.click();
           conditionname.sendKeys("good");
           Thread.sleep(1000);
           save.click();
	}
	
	
	
	
	
	
}
