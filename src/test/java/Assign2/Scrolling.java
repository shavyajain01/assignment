package Assign2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Scrolling {
	WebDriver driver;
	String url="http://openclinic.sourceforge.net/openclinic/home/index.php";
	@BeforeClass
	public void before()
	{
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\hp\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	@AfterClass
	public void after()
	{
		driver.close();
	}
  @Test
  public void test() {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  driver.manage().window().maximize();
	  js.executeScript("window.scrollBy(0,1000)");
	  
	  
  }
}