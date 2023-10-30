package bookstoreapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/books");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("userName")).sendKeys("albertt");
		driver.findElement(By.id("password")).sendKeys("Albert@123");
		//driver.findElement(By.id("login")).click();
		driver.findElement(By.id("login")).click();	
		
		driver.findElement(By.id("submit")).click();
		
		driver.quit();
		
	}

}
