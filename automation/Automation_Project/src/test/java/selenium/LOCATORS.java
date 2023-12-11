package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LOCATORS {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.facebook.com/");
	//	driver.findElement(By.id("email")).sendKeys("vamshi");
	//	driver.findElement(By.name("pass")).sendKeys("vamshi123");
	//	driver.findElement(By.name("login")).click();
	//	driver.findElement(By.cssSelector("[class=\"inputtext _55r1 _6luy\"]")).sendKeys("vamshi");
	//	driver.findElement(By.linkText("Forgotten password?")).click();
	//	driver.findElement(By.partialLinkText("Forgotten pa")).click();
	//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vamshi");
	//	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	//	Thread.sleep(15000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));    //implicit type synchronization
		driver.findElement(By.xpath("//input[@id='email'][@type='text']")).sendKeys("ram");
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15000));    //explicit
		//   WebElement btn =     wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email'][@type='text']")));
	 //         btn.click();
	}

}
