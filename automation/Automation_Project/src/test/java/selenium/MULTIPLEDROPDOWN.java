package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MULTIPLEDROPDOWN {
        public static void main(String[] args) throws Throwable {
        	WebDriver driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
    		driver.findElement(By.xpath("//input[@name=\'source\']")).sendKeys("Vijayawada");
    		List<WebElement> city = driver.findElements(By.xpath("//input[@name=\'source\']//text"));
    		 Thread.sleep(3000);
    		for(int k = 0; k<city.size(); k++) {
    		       	System.out.println(city.get(k).getText()); 
    		        	if(city.get(k).getText().equals("VIJAYAWADA INTERNATIONAL AIRPORT"))  {
    		        	city.get(k).click();
		}
}
        }
}
