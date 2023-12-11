package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class STATICDROPDOWN1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		List<WebElement>country = driver.findElements(By.xpath("//select[@name='Country']//option"));
      //  for(int k = 0; k<country.size(); k++) {
       // 	System.out.println(country.get(k).getText()); 
        //	if(country.get(k).getText().equals("Australia"))  {
        //	country.get(k).click();
          for(WebElement option:country) {          // foreachloop
        	  if(option.getText().equals("Algeria"))  {
        		  option.click();
	
	
	}
        }
	
	
	}

}
