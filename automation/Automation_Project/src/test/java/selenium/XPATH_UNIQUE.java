package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH_UNIQUE {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("sureshbabuemp@gmail.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ZPMHQHIA");
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
		
		
		
	}

}
