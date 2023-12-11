package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCROLLDOWN {
	public static void main(String[] args) {
		WebDriver down = new ChromeDriver();
		down.manage().window().maximize();
		down.get("https://www.redbus.in/");
		JavascriptExecutor js = (JavascriptExecutor) down;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");  
	}

}
