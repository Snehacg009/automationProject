package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Droppable {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
	}
	
	@Test
	public void drpble()
	{
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		WebElement dragme=driver.findElement(By.id("draggable"));
		WebElement drophere=driver.findElement(By.id("droppable"));
		actions.dragAndDrop(dragme, drophere).perform();
		
		
		/*String finaltext=to.getText();
		
		if(finaltext.equals("Dropped!"))
		{
			System.out.println("The action successfully completed");
			
		}
		else
		{
			System.out.println("Action Failed!!");
		}*/
	
		driver.close();
	}
	

}
