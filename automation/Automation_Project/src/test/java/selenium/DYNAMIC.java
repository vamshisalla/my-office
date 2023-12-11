package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DYNAMIC {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("hyderabad");
		List<WebElement> city = driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//text"));
		for(int k = 0; k<city.size(); k++) {
		       	System.out.println(city.get(k).getText()); 
		        	if(city.get(k).getText().equals("Secundeabad"))  {
		        	city.get(k).click();
	//	for(WebElement option: city) {
	//	System.out.println(	option.getText());
	//	if(option.getText().equals("Secunderabad")) {
	//		option.click();
		}
		}
	}

}
