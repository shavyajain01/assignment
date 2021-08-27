package Assign2;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	WebDriver driver;
	String url=" https://jqueryui.com/droppable/";    
	
	@BeforeClass
	public void setUp() throws Exception{ 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	
	
	@Test
	public void Test() throws InterruptedException
	{
	//Thread.sleep(5000);
	//source element
	WebElement fromElement = driver.findElement(By.id("draggable"));
	//Thread.sleep(5000);
	//destination element
	WebElement toElement = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	//Thread.sleep(5000);
	//reference for action class
	Actions action = new Actions(driver);
	action.dragAndDrop(fromElement , toElement).perform();
	//Thread.sleep(5000);
	String expectedMessage = "Dropped";
	//Thread.sleep(5000);
	String actualMessage = driver.findElement(By.xpath("//*[@id=\\\"droppable\\\"]")).getText();
	//Thread.sleep(5000);
	Assert.assertEquals(expectedMessage, actualMessage);
	
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.close();
	}
}