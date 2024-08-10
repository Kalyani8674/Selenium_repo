package PopUps;

import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowpopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://shoppersstack.com/products_page/15");
		
		String parentid = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		Set<String> allwindowids = driver.getWindowHandles();
		
		for(String id:allwindowids) {
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(url.contains("amazon"))
			{
				break;
			}
			
		}
		switchTowindow(driver, "amazon");
		System.out.println(driver.getTitle());
		driver.close();
		
		switchTowindow(driver, "shoppersstack");
		driver.close();
	}
	public static void switchTowindow(WebDriver driver,String expurl)
	{
		Set<String> allwindowids = driver.getWindowHandles();
		
		for(String id:allwindowids)
		{
			String url = driver.switchTo().window(id).getCurrentUrl();
		
			if(url.contains(expurl)) {
				break;
			}
		}
	}

}
