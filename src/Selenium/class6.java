package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class6 {

	public static void main(String[] args) throws InterruptedException {
		// To launch the chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RATHISH\\\\OneDrive\\\\Desktop\\\\selenium\\\\chromedriver\\\\chromedriver.exe");
				ChromeDriver d=new ChromeDriver();
				
				//to get url
				d.get("https://www.google.com");
				
				//interact with search box
				WebElement searchbox = d.findElement(By.id("APjFqb"));
				boolean enablecheck = searchbox.isEnabled();
				System.out.println(enablecheck);
				
				boolean displayback = searchbox.isDisplayed();
				System.out.println(displayback);
				
				org.openqa.selenium.Dimension size = searchbox.getSize();
				System.out.println(size);
				
				d.navigate().to("https://demoqa.com/automation-practice-form");
				WebElement female = d.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
				female.click();
				
				Thread.sleep(3000);
				boolean selectcheck = female.isSelected();
				System.out.println(selectcheck);
				
				
								
				

	}

}
