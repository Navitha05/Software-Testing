package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// To launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RATHISH\\\\OneDrive\\\\Desktop\\\\selenium\\\\chromedriver\\\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Thread.sleep(3000);
		//select the dropdown 2-select in class
		
		WebElement drop = d.findElement(By.id("animals"));
		Select s2 = new Select(drop);
		s2.selectByIndex(2);
		System.out.println("dropdown 2 selected");
		
		Thread.sleep(3000);
		

		WebElement drop1 = d.findElement(By.id("animals"));
		Select s3 = new Select(drop1);
		s3.selectByIndex(3);
		System.out.println("dropdown 3 selected");
		
		Thread.sleep(3000);

		WebElement drop3 = d.findElement(By.id("custom"));
		Select s21 = new Select(drop3);
		s21.selectByIndex(2);
		System.out.println("dropdown 2 selected");
		
	}

}
