package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome_Browser {
	public static void main(String[] args) throws Throwable  {
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.facebook.com/");
	//	driver.manage().window().maximize();
	//	driver.get("https://www.google.com/search?q=redbus");
	//	String s = driver.getCurrentUrl();
	//	System.out.println(s);
		// String a =driver.getPageSource();
		// System.out.println(a);
	//	Dimension d = new Dimension(400,500);
	//	driver.manage().window().setSize(d);
		driver.get("https://www.google.com/search?q=redbus");
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		
		
		
		
		
	}

}
