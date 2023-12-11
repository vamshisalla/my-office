package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH_DESCENDANT {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
	//	driver.findElement(By.xpath("//input[@name='pass']/preceding::input[@id='email']")).sendKeys("vamshi");
		driver.findElement(By.xpath("//input[@id='pass']/preceding::input[@name='email']")).sendKeys("ram");
		driver.findElement(By.xpath("//input[@id='pass']/preceding::input[@name='email']/descendant::button[@name='Log in']")).click();
		
	//	driver.findElement(By.xpath("//input[@id='pass']/following::button[@name='login']")).click();;
		
		
		
		
		
		
		
	}

}
