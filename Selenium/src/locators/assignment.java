package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment
{

	public static void main(String[] args) 
	{


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("Email:")).sendKeys("kalyani@gmail.com");
		driver.findElement(By.xpath("Password:")).sendKeys("Password:");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();


	}

}
