package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class class5 {

	public static void main(String[] args) throws InterruptedException {
		// To launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RATHISH\\\\OneDrive\\\\Desktop\\\\selenium\\\\chromedriver\\\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/automation-practice-form");
		
		//sleepmode
		Thread.sleep(3000);
		//click button
		
		//to import input to the firstname command
		WebElement firstname = d.findElement(By.id("firstName"));
		firstname.sendKeys("navitha");
		
	
		
		//to pass the inputs in lastName command
		WebElement lastname = d.findElement(By.id("lastName"));
		lastname.sendKeys("dharmaraj");
		
		
		
		//to pass the input in email command
		WebElement email = d.findElement(By.id("userEmail"));
		email.sendKeys("abc@gmail.com");
		
		//to select the gender
		WebElement gender = d.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
		gender.click();
		
		//to pass the input in phone number command
		WebElement userNumber = d.findElement(By.id("userNumber"));
		userNumber.sendKeys("8551004520");
		
		//to pass the input in email command
		WebElement hobbies = d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
		hobbies.click();
				
		WebElement hobbies2 = d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label"));
		hobbies2.click();
		
		WebElement hobbies3 = d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		hobbies3.click();
		
		//to pass the input in subject
		WebElement currentAddress = d.findElement(By.id("currentAddress"));
	    currentAddress.sendKeys("d/no 1019 Mudukkandhurai pogalur post anuur via pincode-641653");
	    
	    WebElement dateOfBirthInput = d.findElement(By.id("dateOfBirthInput"));
	    dateOfBirthInput.click();
	    
	    WebElement month = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
	    month.click();
	    Select s2=new Select(month);
	    s2.selectByIndex(0);
	    

	    WebElement year = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
	    year.click();
	    Select s3=new Select(year);
	    s3.selectByIndex(20);
	    
	    WebElement date = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]"));
	    date.click();
	    
	    WebElement file2 = d.findElement(By.id("uploadPicture"));
	    file2.sendKeys("C:\\Users\\RATHISH\\OneDrive\\Desktop\\navi vscode");
	    
	    
	    
	    
	    
	    
	   
	    
	    
	    
		
	     
		
		
	}

}
