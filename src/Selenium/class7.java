package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class class7 {

	public static void main(String[] args) {
		//To launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RATHISH\\\\OneDrive\\\\Desktop\\\\selenium\\\\chromedriver\\\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		//to get url
		d.get("https://demoqa.com/browser-windows");
		
		WebElement newtab = d.findElement(By.id("tabButton"));
		newtab.click();
		
		//to close the first window
//		d.close();
		
		//to get parent window window
		String parentwindow = d.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> childwindow = d.getWindowHandles();
		
		for (String allTabs:childwindow) {
			d.switchTo().window(allTabs);
//			d.close();
//			
		}
		d.close();
		
		d.switchTo().window(parentwindow);
//		
		WebElement newwindow = d.findElement(By.id("windowButton"));
		newwindow.click();
		
	}

}
