package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) {
		//to launch Chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RATHISH\\OneDrive\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");

	}

}
