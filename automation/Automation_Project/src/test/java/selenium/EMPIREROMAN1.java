package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class EMPIREROMAN1 {
	public static void main(String[] args) throws InterruptedException, Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.xpath("//input[@id='pword']")).sendKeys("ZPMHQHIA");
		driver.findElement(By.xpath("//button[@class='btn green_btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-houzz']")).click();
		driver.findElement(By.xpath("//a[@href='/Inventory/InventoryData']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='ModelNumber']")).sendKeys("20156");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("EMPIRE");
		driver.findElement(By.xpath("//textarea[@name='ItemDescription']")).sendKeys("ITEMS");
		driver.findElement(By.xpath("//input[@name='Brand']")).sendKeys("IREST");
		driver.findElement(By.xpath("//input[@name='Height']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@name='Width']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='Breadth']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='ColorName']")).sendKeys("BLUE");
		driver.findElement(By.xpath("//input[@id='RecievedDate']")).sendKeys("09/26/2023");
		driver.findElement(By.xpath("//input[@name='ActualPrice']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@name='HSNCode']")).sendKeys("NEWR");
		driver.findElement(By.xpath("//input[@name='RackName']")).sendKeys("vam");
		driver.findElement(By.xpath("//input[@name='PODetails']")).sendKeys("vamshi");
		driver.findElement(By.xpath("//input[@name='InvoiceNumber']")).sendKeys("87964");
		driver.findElement(By.xpath("//input[@name='Qty']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='gstName']")).sendKeys("16%");
		WebElement image = driver.findElement(By.name("ProductMainImageUploaded"));
		JavascriptExecutor js = (JavascriptExecutor) driver;   //downcasting
		js.executeScript("arguments[0].click();", image);
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Pictures\\Saved Pictures\\x440image");   
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		WebElement doc = driver.findElement(By.xpath("//input[@name='DocumentsUploaded']"));
		JavascriptExecutor jp = (JavascriptExecutor) driver;
		jp.executeScript("arguments[0].click();",doc);
		Robot rs = new Robot();
		rs.delay(2000);
		StringSelection sb = new StringSelection("C:\\Users\\Admin\\Downloads\\Core Java(Gova)"); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sb,null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		WebElement dox = driver.findElement(By.xpath("//input[@name='ProductOtherImagesUploaded']"));
		JavascriptExecutor jd = (JavascriptExecutor) driver;
		jd.executeScript("arguments[0].click();",dox);
		Robot rc = new Robot();
		rs.delay(2000);
		StringSelection sr = new StringSelection("C:\\Users\\Admin\\Downloads\\jakob-rosen-IyuXfY_i7tA-unsplash"); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sr,null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.name("ColorImageUploaded")).sendKeys("C:\\Users\\Admin\\Downloads\\jayalekshman-sj-vuCyQMMMjn0-unsplash.JPG");
		List<WebElement> cast = driver.findElements(By.xpath("//select[@id='catDD']//option"));
		for(WebElement option: cast)  {
			if(option.getText().equals("Hall")) {
				option.click(); 
				List<WebElement> subcat = driver.findElements(By.xpath("//select[@id='subcatDD']//option")); // subcategory
			           for(WebElement option1 : subcat) {                                                                    
				       	 if(option1.getText().equals("plants")) {                                                          	
                     		 option1.click();                                                                                     
	Thread.sleep(3000);
				List<WebElement> run = driver.findElements(By.xpath("//select[@id='InventoryStatusId']//option"));
		for(WebElement option2:run) {
			if(option2.getText().equals("sanju")) {
		option2.click();
			List<WebElement> con = driver.findElements(By.xpath("//select[@name='InventoryConditonId']//option"));
			for(WebElement option5:con) {
				if(option5.getText().equals("Good")) {
					option5.click();
				List<WebElement> status = driver.findElements(By.xpath("//select[@name='InventoryLocationId']//option"));
				for(WebElement option8:status) {
				if(option8.getText().equals("america")) {
					option8.click();
			List<WebElement>factor = driver.findElements(By.xpath("//select[@name='MRPFactorId']//option"));
			for(WebElement option9:factor) {
				if(option9.getText().equals("3.25")) {
					option9.click();
			driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
				}
				
			}
			}
				
				
				}
				}
				}
				
				
				
				
				}
			}
			
			}
		}
			
			
			
			
			
			}
			}
			
			}
					
					
					
					
					
					
					
				}
				
			
		
		
		
		
		
		
		
		
		
		
	

