package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenNewTab {

WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/links");
	}
	
	@Test
	public void newTab()
	{
		driver.manage().window().maximize();
		driver.findElement(By.id("simpleLink")).click();
		WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
		driver1.get("https://www.google.com");

	

	}
	
}
