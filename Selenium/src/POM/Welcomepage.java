package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	//initialization
	public Welcomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(linkText = "Register")
	private WebElement registerLink;

	//getter
	public WebElement getRegisterLink()
	{
		return registerLink;
	}
	
}
