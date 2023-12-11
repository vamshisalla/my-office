package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCROLLDOWNPARTICULARELEMENT {
	public static void main(String[] args) {
		WebDriver ram = new ChromeDriver();
		ram.manage().window().maximize();
		ram.get("https://www.redbus.in/");
		WebElement cost = ram.findElement(By.xpath("//img[@alt='TSRTC_logo']"));
		Point krish = cost.getLocation();
		JavascriptExecutor js = (JavascriptExecutor) ram;
		js.executeScript("window.scrollBy"+ krish);
		
		
		
		
	}

}
