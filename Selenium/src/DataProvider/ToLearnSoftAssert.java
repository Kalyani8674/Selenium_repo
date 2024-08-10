package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert {
	public void login() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(driver.getTitle(), "Demo Web Shop.login", "login page is not displayed");
		Reporter.log("login page is displsyed",true);
		
		driver.findElement(By.id("Email")).sendKeys("kalyani123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("kalyani@1");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		soft.assertNotEquals(driver.getTitle(), " Demo Web Shop","home page is not displayed"); 
		Reporter.log("home page is displayed");
		
		
		
	
	}
}
