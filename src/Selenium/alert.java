package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// To launch chrome browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\RATHISH\\OneDrive\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
				ChromeDriver d=new ChromeDriver();
				d.get("https://demo.automationtesting.in/Alerts.html");
				
				Thread.sleep(3000);
				
				//simple
				 WebElement box = d.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
				 box.click();
				
				//Alert handling main code
				Alert a=d.switchTo().alert();
				
				Thread.sleep(3000);
				a.accept();
				
				//confirmation
				WebElement box2 = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
				box2.click();
				
				Thread.sleep(3000);
				
				WebElement box3 = d.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
				box3.click();
				Alert b=d.switchTo().alert();
				Thread.sleep(3000);
				b.accept();
				
				
				//prompt
				WebElement box4 = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
				box4.click();
				
				Thread.sleep(3000);
				
				WebElement box5 = d.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
				box5.click();
				Alert c=d.switchTo().alert();
				c.sendKeys("navitha");
				Thread.sleep(3000);
				c.accept();
				
			
				
				
	}

}