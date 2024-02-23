package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
public class class3 {

	public static void main(String[] args) {
		// to launch the chrome browser
		System.setProperty("webdriver.chromedriver","C:\\Users\\RATHISH\\OneDrive\\Desktop\\selenium\\\\chromedriver\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.instagram.com/");
		d.get("https://www.youtube.com/");
		d.navigate().back();
		
		//to get the current page url
		String currenturl = d.getCurrentUrl();
		System.out.println("current page url is:"+currenturl);
		
		//to get the current page title
		String pagetitle = d.getTitle();
		System.out.println("current page Title is:"+pagetitle);
		
		d.navigate().forward();
		d.quit();
		
		
		

	}

}
