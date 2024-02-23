package registrationform;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class task1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// To launch the chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RATHISH\\\\OneDrive\\\\Desktop\\\\selenium\\\\chromedriver\\\\chromedriver.exe");
				ChromeDriver d=new ChromeDriver();
				d.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
				
				//sleepmode
				Thread.sleep(3000);
				//click button
				
				//to import input to the firstname command
				WebElement firstname = d.findElement(By.id("RESULT_TextField-1"));
				firstname.sendKeys("navitha");
				

				//to import input to the lastname command
				WebElement lastname = d.findElement(By.id("RESULT_TextField-2"));
				lastname.sendKeys("Dharmaraj");

				//to import input to the phone command
				WebElement phone = d.findElement(By.id("RESULT_TextField-3"));
				phone.sendKeys("8455285253");
				
				//to import input to the phone command
				WebElement country = d.findElement(By.id("RESULT_TextField-4"));
				country.sendKeys("India");
				
				//to import input to the phone command
				WebElement city = d.findElement(By.id("RESULT_TextField-5"));
				city.sendKeys("Coimbatore");
				
				//to import input to the phone command
				WebElement email = d.findElement(By.id("RESULT_TextField-6"));
				email.sendKeys("navi@gmail.com");
				
				//to import input to the gender command
				WebElement gender = d.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label"));
				gender.click();
				
				//to import input to the gender command
				WebElement day1 = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[2]/td"));
				day1.click();
				
				Thread.sleep(3000);
				WebElement day2 = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[3]/td/label"));
				day2.click();
				
				Thread.sleep(3000);
				WebElement day3 = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[4]/td/label"));
				day3.click();
							
				Thread.sleep(3000);
				WebElement day4 = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[5]/td/label"));
				day4.click();
				
				Thread.sleep(3000);
				WebElement day5 = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[6]/td/label"));
				day5.click();
				
				Thread.sleep(3000);
				WebElement day6 = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[7]/td"));
				day6.click();
				
				Thread.sleep(3000);
				WebElement day7 = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label"));
				day7.click();
				
				WebElement drop1 = d.findElement(By.id("RESULT_RadioButton-9"));
				Select s21 = new Select(drop1);
				s21.selectByIndex(2);
				System.out.println("dropdown 2 selected");
				
				WebElement file = d.findElement(By.id("RESULT_FileUpload-10"));
				file.sendKeys("C:\\Users\\RATHISH\\OneDrive\\Desktop\\navi vscode");
				
				
				TakesScreenshot ss =(TakesScreenshot)d;
				File source = ss.getScreenshotAs(OutputType.FILE);
				File destination = new File("C:\\Users\\RATHISH\\OneDrive\\Desktop\\navi vscode\\images\\task1_image.png");
				FileHandler.copy(source, destination);
				d.quit();

							
				
				

				
	}

}
