package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GOOGLE {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("narendramodi");
		 Thread.sleep(3000);
		 List<WebElement> ref = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	       	for(WebElement option:ref) {
			if(option.getText().equals("narendra modi stadium")) {
				option.click();
			}
		}
		
		
	}

}
