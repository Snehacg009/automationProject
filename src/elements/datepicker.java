package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datepicker {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/date-picker");
	}
	
	@Test
	public void datePicker() throws InterruptedException
	{
		String month="December 2024";
		//String day="20";
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		Thread.sleep(2000);
		
		while(true)
		{
		String text=driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
		
		   if(text.equals(month))
		   {
			   break;
		   }
		   else
		   {
			   driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/button[2]")).click();		   
		   }
		}
		
		//driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]")).click();
		
	}

}
