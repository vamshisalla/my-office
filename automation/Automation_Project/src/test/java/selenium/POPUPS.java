package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUPS {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("vamshi");
		a.accept();
		
		
		
		
	//	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	//	Alert a = driver.switchTo().alert();
	//	a.dismiss();
		
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	//	Alert a = driver.switchTo().alert();
//		a.accept();
	
		
		
		
		
		
	}

}
