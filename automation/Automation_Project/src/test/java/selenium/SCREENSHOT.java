package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

 public class SCREENSHOT {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	    TakesScreenshot ts = (TakesScreenshot) driver;
			File srs = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Admin\\Pictures\\Saved Pictures\\redbus.png");
			Files.copy(srs, dest);
		
		
		
		
	}

}
