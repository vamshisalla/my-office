package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LOCATORS3 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
	//	driver.findElement(By.id("cb-user-email-input")).sendKeys("vamshi");
	//	driver.findElement(By.className("cb-text-center cb-font-10 cb-sign-up-tnc-text")).click();
	//	Thread.sleep(10000);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	
		driver.findElement(By.id("cb-user-mobile-input")).sendKeys("9775443334");
		
		
	}

}
