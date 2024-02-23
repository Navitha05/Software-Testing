package registrationform;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class task2 {

	public static void main(String[] args) throws IOException {
		// To launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RATHISH\\\\OneDrive\\\\Desktop\\\\selenium\\\\chromedriver\\\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		
		TakesScreenshot screen =(TakesScreenshot)d;
		File source = screen.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\RATHISH\\OneDrive\\Desktop\\navi vscode\\images\\task2_image.png");
		FileHandler.copy(source, destination);
		d.quit();

	}

}
