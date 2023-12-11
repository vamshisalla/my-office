package selenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RUNTIMEPOLYMORPHISM {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter BrowserName");
		String BrowserName = sc.next();
		
		if(BrowserName.equals("Chrome")) {
			new ChromeDriver();
		}
		
		else if(BrowserName.equals("Edge")) {
			new EdgeDriver();
		}
		else if(BrowserName.equals("Firefox")) {
			new FirefoxDriver();
		}
		else {
			System.out.println("print the correct browser");
		}
		
	}

}
