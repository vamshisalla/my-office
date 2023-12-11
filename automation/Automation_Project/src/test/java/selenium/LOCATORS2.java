package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOCATORS2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://accounts.snapchat.com/accounts/v2/signup");
		driver.findElement(By.id("email")).sendKeys("vamshi");
		driver.findElement(By.name("password")).sendKeys("vamshi123");
		
		
		
		
		
	}

}
