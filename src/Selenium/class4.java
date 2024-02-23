package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class class4 {

	public static void main(String[] args) throws InterruptedException {
		// To launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RATHISH\\OneDrive\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//sleepmode
		Thread.sleep(3000);
		//click button
		
		//to import input to the username command
		WebElement username = d.findElement(By.name("username"));
		username.sendKeys("Admin");
		
	
		
		//to pass the inputs in password command
		WebElement password = d.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		
		
		//to click the button command
		WebElement login = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
		
		

	}

}
