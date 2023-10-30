package elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class alert1 {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/alerts");
	}
	
	@Test
	public void alerttest()
	{
		driver.manage().window().maximize();
		driver.findElement(By.id("alertButton")).click();
		Alert alrt=driver.switchTo().alert();
		alrt.accept();
	}

}
