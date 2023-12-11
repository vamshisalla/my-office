package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DYNAMIC1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hyderabad");
	List<WebElement> city = driver.findElements(By.xpath("//input[@type='text']//text"));
		for(int k = 0; k<city.size(); k++) {
		       	System.out.println(city.get(k).getText()); 
		        	if(city.get(k).getText().equals("Chennai"))  {
		        	city.get(k).click();
	}
		}
	}
	}
