package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClick {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/buttons");
	}
	
	@Test
	public void rightClick()
	{

		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		WebElement element=driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(element).perform();
		
		driver.close();
	}

}
