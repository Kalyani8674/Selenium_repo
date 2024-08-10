package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//step:1 Create FileInputStream Object
		FileInputStream fis = new FileInputStream("./TestData/Commondata.properties");
		
		//step:2 create respective file type object
		Properties prop = new Properties();
		
		//step:3 call read methods
		prop.load(fis);
		String URL = prop.getProperty("url");
		String EMAIL = prop.getProperty("email");
		String password = prop.getProperty("password");
		
		System.out.println(URL);
		System.out.println(EMAIL);
		System.out.println(password);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		driver.findElement(By.name(EMAIL));
		driver.findElement(By.name(password));

	}

}
