package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class textbox {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/text-box");
	}
	
	@Test
	public void textboxtest()
	{
		WebElement fullname=driver.findElement(By.id("userName"));
		fullname.sendKeys("Mr.Albert Thomas");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("albertthomas123@gmail.com");
		
		WebElement Curraddress=driver.findElement(By.id("currentAddress"));
		Curraddress.sendKeys(" 132, My Street, Kingston, New York 12401");
		
		//to copy current address
		Curraddress.sendKeys(Keys.CONTROL);
		Curraddress.sendKeys("A");
		Curraddress.sendKeys(Keys.CONTROL);
		Curraddress.sendKeys("C");
		
		//press tab key to move to permanant address field
		Curraddress.sendKeys(Keys.TAB);
		
		WebElement permAddress=driver.findElement(By.id("permanentAddress"));
		permAddress.sendKeys(Keys.CONTROL);
		permAddress.sendKeys("V");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		driver.close();
		
	}
}
