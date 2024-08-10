package Listeners;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listenersimplementation implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("testscript failed",true);
		TakesScreenshot ts=(TakesScreenshot)driver;
	}
	
}
