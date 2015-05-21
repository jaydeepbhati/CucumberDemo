package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitiateDriver {

	protected static WebDriver driver;
	
	protected WebDriver initiateDriver(){
		
	if(driver==null){
		driver = new FirefoxDriver();
	}
	return driver;
	}
}
