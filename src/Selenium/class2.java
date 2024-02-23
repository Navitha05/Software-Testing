package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {

	public static void main(String[] args) {
		//to launch Chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RATHISH\\OneDrive\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		//to maximize the window
		d.manage().window().maximize();
		
		//to go to particular website-method1
		d.get("https://www.facebook.com");
		
		//to minimize the window
		d.manage().window().minimize();
		
		//to go to particular website-method1
		d.navigate().to("https://www.youtube.com");
		
		//to forward command
		d.navigate().forward();
		
		//to backward command
		d.navigate().back();
		
		//to close the browser
		//d.close()
		
		//to close the browser
		d.quit();
		
		
		
		

	}

}