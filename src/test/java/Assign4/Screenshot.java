package Assign4;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		File screenshotFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(screenshotFile, new File("D:\\screen\\screen.png"));
		
		driver.close();
		

	}

}
