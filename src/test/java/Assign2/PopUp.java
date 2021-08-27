package Assign2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class PopUp {
	
	WebDriver driver;
	String url="https://www.jquery-az.com/boots/demo.php?ex=63.0_2";
	
	@BeforeClass
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\hp\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test
	public void Test() throws InterruptedException{
		
	}
}
