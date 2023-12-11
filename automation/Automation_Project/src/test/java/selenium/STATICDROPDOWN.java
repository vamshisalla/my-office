package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class STATICDROPDOWN {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		WebElement country = driver.findElement(By.xpath("//select[@name='Country']"));
		Select sel = new Select(country);
	//	sel.selectByVisibleText("Germany");
	//	sel.selectByValue("Dominica");
		sel.selectByIndex(123);
		sel.selectByIndex(56);
		
	
	}

}
