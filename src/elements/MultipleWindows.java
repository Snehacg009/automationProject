package elements;

//import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindows {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	
	
	@Test
	public void wndwhndle() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/browser-windows");
		String parentWindow=driver.getWindowHandle(); //window handle id of current browser
		System.out.println("The url of parent window is: "+driver.getCurrentUrl()); //url of parent window
		driver.findElement(By.id("tabButton")).click();
		
		Thread.sleep(4500);
		Set<String> childWindows=driver.getWindowHandles();//window handle id of all the browsers/window
		
		for(String handle:childWindows)
		{
			System.out.println(handle);
		
		
			if(!parentWindow.equalsIgnoreCase(handle))
			{
				driver.switchTo().window(handle);
				System.out.println("Url of child window is: "+driver.getCurrentUrl());
				driver.close();			
			}
		}
		
		
		Thread.sleep(4500);

		driver.switchTo().window(parentWindow);
		driver.close();
		
       }

}
