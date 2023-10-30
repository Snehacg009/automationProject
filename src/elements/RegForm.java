package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegForm {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://mytestingthoughts.com/Sample/home.html");
	}
	
	@Test
	public void regformtest()
	{
		//firstname
		driver.findElement(By.name("first_name")).sendKeys("Albert");
		//lastname
		driver.findElement(By.name("last_name")).sendKeys("Thomas");
		
		//gender
		driver.findElement(By.id("inlineRadioMale")).click();
		
		//hobbies
		Select objSelect=new Select(driver.findElement(By.id("exampleFormControlSelect2")));
		objSelect.selectByVisibleText("Jogging");
		
		//department
		Select obj1Select=new Select(driver.findElement(By.name("department")));
		obj1Select.selectByIndex(1);
		
		//username
		driver.findElement(By.name("user_name")).sendKeys("albert345");
		
		//password
		driver.findElement(By.name("user_password")).sendKeys("albert12345678");
		//confirm password
		driver.findElement(By.name("confirm_password")).sendKeys("albert12345678");
		
		//email
		driver.findElement(By.name("email")).sendKeys("albert9999@gmail.com");
		
		//contactno
		driver.findElement(By.name("contact_no")).sendKeys("989-6777-465");
		
		driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("I'm a software engineer");
		
		//submit
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")).click();
		
	}

}
