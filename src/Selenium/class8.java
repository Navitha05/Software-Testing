package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class8 {

	public static void main(String[] args) {
		//To launch the chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RATHISH\\\\OneDrive\\\\Desktop\\\\selenium\\\\chromedriver\\\\chromedriver.exe");
				ChromeDriver d=new ChromeDriver();
				
				String parentwindow = d.getWindowHandle();
				System.out.println(parentwindow);
				
				//to get url
				d.get("https://demoqa.com/browser-windows");
				
				WebElement newtab = d.findElement(By.id("tabButton"));
				newtab.click();
				
				WebElement newwindow = d.findElement(By.id("windowButton"));
				newwindow.click();
				
//				WebElement newmessage = d.findElement(By.id("messageWindowButton"));
//				newmessage.click();
				

				Set<String> childwindow = d.getWindowHandles();
				
				for(String allTabs:childwindow){
					d.switchTo().window(allTabs);
					d.navigate().to("https://www.google.com");
				}
				



	}

}
