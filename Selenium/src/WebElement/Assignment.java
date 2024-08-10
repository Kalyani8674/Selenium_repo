package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usernameTf = driver.findElement(By.id("username"));
		
		usernameTf.clear();
		
		usernameTf.sendKeys("selenium");
		
		 driver.findElement(By.xpath("//input[@value='Sign in']")).submit();
	}

}
