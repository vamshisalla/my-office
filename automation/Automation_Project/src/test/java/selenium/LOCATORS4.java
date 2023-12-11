package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOCATORS4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://affiliate.flipkart.com/login");
		driver.findElement(By.id("inputEmail")).sendKeys("vamshi");
	
		
		
		
		
		
	}

}
