package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOCATORS1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
	//	driver.findElement(By.id("email")).sendKeys("vamshi");
	//	driver.findElement(By.name("Password")).sendKeys("vamshi123");
		driver.findElement(By.xpath("//input[@maxlength='75'//]")).sendKeys("vamshi");
		
		
		
	}

}
