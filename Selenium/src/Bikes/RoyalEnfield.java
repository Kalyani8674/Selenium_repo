package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalEnfield {
	@Test(groups="system")
	public void LaunchedRoyalEnfield()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bikewale.com/royalenfield-bikes/");
		Reporter.log("RoyalEnfield launched successfully");
	}
}
