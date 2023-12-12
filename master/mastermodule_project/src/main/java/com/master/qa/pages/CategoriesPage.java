package com.master.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.master.qa.base.BASETEST;

public class CategoriesPage extends BASETEST {
	
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	WebElement addnewcat;
	
	@FindBy(xpath = "//input[@name='CategoryName']")
	WebElement categoryname;

	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;

	public CategoriesPage()throws Throwable{
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifyCategoriesPageTitle() {
		return driver.getTitle();
	}
	
	public void VerifyCategoriesPage() throws Throwable {
		   
	    Thread.sleep(1000);
       addnewcat.click();
       categoryname.sendKeys("kitchen");
       Thread.sleep(1000);
       save.click();
}
           
          

}

