package Assign4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		WebElement attr = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		attr.sendKeys("shavya");
		String firstname = attr.getAttribute("value");
		System.out.println("first name:"+firstname);
		
		WebElement attr1 = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		attr1.sendKeys("jain");
		String lastname = attr1.getAttribute("value");
		System.out.println("Last name:"+lastname);
		
		WebElement attr3 = driver.findElement(By.name("Username"));
		attr3.sendKeys("shavya.jain");
		String username = attr3.getAttribute("value");
		System.out.println("username:"+username);
		
		
		//driver.close();
		
		
	}

}
