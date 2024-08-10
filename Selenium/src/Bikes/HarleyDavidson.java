package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HarleyDavidson {
	@Test(groups="smoke")
	public void launchedHarleyDavidson()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.harley-davidson.com/in/en/index.html");
		Reporter.log("HarleyDavidson lanunched successfully");
	}
}
