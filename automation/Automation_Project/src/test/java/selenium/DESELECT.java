package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DESELECT {
		public static void main(String[] args) {
			WebDriver google = new ChromeDriver();
			google.manage().window().maximize();
			google.get("file:///C:/Users/Admin/Documents/mypage.html");
			WebElement form = google.findElement(By.xpath("//select[@id='dropdown']"));
			Select form1 = new Select(form);
			form1.selectByVisibleText("Apple");
			form1.selectByVisibleText("Banana");
			form1.selectByVisibleText("Cherry");
			form1.deselectByVisibleText("Cherry");
		

		}

	
	}


