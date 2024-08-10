package Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedOptions {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("");
		WebElement pricelistbox = driver.findElement(By.id(""));
		priceselect.select
		
	//	WebElement firstselected = priceselect.getfirstselectoption();
	//	System.out.println(firstselected.getText());
		
		for<WebElement> allselected = priceselect.getallselectedoptions();
				System.out.println(allselected.size());
		
		
		
	}

}
