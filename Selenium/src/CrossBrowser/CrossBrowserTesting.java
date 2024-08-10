package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	public WebDriver driver;
	@Parameters("Browser")
	@Test
	public void launch(String BrowserName)
	{
		if(BrowserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("safari")) {
			driver=new SafariDriver();
		}
		else if(BrowserName.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if (BrowserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.get("https://demowebshop.tricentis.com/");
	}
}
