package selenium;





import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCREENSHOTONE {
	  
			public static void main(String[] args) throws Throwable {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.redbus.in/");
			WebElement India =	driver.findElement(By.xpath("//img[@alt='India']"));
			File from = India.getScreenshotAs(OutputType.FILE);	
            File to = new File("C:\\Users\\Admin\\Pictures\\Saved Pictures\\redbusIndia.jpg");
            Files.copy(from, to);
}
	 }

