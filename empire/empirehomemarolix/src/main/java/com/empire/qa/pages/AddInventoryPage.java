package com.empire.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.empire.qa.base.BaseTest;
import com.empire.qa.utils.UtilsTest;

public class AddInventoryPage extends BaseTest {
	@FindBy(xpath = "//select[@id='catDD']")
	WebElement categorydrp;
	
	@FindBy(xpath = "//select[@id='subcatDD']")
	WebElement subcategorydrp;
	
	@FindBy(name="ModelNumber")
	WebElement modelnum;
	
	@FindBy(name="Title")
	WebElement itemtitle;
	
	@FindBy(name="ItemDescription")
	WebElement itemdescription;
	
	@FindBy(name="Brand")
	WebElement brand;
	
	@FindBy(name="Height")
	WebElement height;
	
	@FindBy(name="Width")
	WebElement width;
	
	@FindBy(name="Breadth")
	WebElement breadth;
	
	@FindBy(name="ColorName")
	WebElement colorname;
	
	
	@FindBy(name="ColorImageUploaded")
	WebElement colorimg;
	
	@FindBy(xpath = "//select[@id='InventoryStatusId']")
	WebElement inventorystatus;
	
	@FindBy(xpath = "//select[@id='InventoryConditonId']")
	WebElement inventoryconid;
	
	
	@FindBy(xpath = "//select[@id='InventoryLocationId']")
	WebElement inventorylocid;
	
	@FindBy(name="RecievedDate")
	WebElement recieveddate;
	
	@FindBy(name="ActualPrice")
	WebElement actualprice;
	
	@FindBy(name="MRPFactorId")
	WebElement mrpfactor;
	
	
	@FindBy(name="HSNCode")
	WebElement hsncode;
	
	@FindBy(name="RackName")
	WebElement rackname;
	
	
	@FindBy(name="InvoiceNumber")
	WebElement invoicenum;
	
	@FindBy(name="Qty")
	WebElement qty;
	
	@FindBy(name="ProductMainImageUploaded")
	WebElement primaryimg;
	
	public AddInventoryPage()throws Throwable{
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifyaddinventoryTitle() {
		return driver.getTitle();
	}
	public AllInventoryPage VerifyAddInventory(String modelnumber, String title, String itemdescription, String brand, String height, String width, String breadth, String colorname, String actualprice, String hsncode, String rackname, String invoicenum, String qty) throws Throwable { 
	      UtilsTest.dropdownmethod( categorydrp, "table");
	      UtilsTest.dropdownmethod(subcategorydrp, "chair");
	      modelnum.sendKeys(modelnumber);
	      itemtitle.sendKeys(title);
	      this.itemdescription.sendKeys(itemdescription);
	      this.brand.sendKeys(brand);
	      this.height.sendKeys(height);
	      this.width.sendKeys( width);
	      this.breadth.sendKeys(breadth);
	      this.colorname.sendKeys(colorname);
	    recieveddate.sendKeys("13-10-23");
	      this.actualprice.sendKeys(actualprice);
	      this.hsncode.sendKeys(hsncode);
	      this.rackname.sendKeys(rackname);
	      this.invoicenum.sendKeys(invoicenum);
	      this.qty.clear();
	      this.qty.sendKeys(qty);
	      UtilsTest.dropdownmethod(inventorystatus, "1000");
	      UtilsTest.dropdownmethod(inventoryconid, "Damaged");
	      UtilsTest.dropdownmethod(inventorylocid, "1245");
      UtilsTest.dropdownmethod(mrpfactor, "3.00");
	      
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].click();", primaryimg);
	      UtilsTest.UploadingFile();
	      return new AllInventoryPage();
	      
	}
}
	      
	      
	      
	      
	      
	      
	       
	      
	      
	
	
	
	

	
	
	
	


