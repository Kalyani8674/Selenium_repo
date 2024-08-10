package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class toyota {
	@Test
	public void launchedToyota()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toyotabharat.com/");
		Reporter.log("Toyota launched successfully");
	}
}
