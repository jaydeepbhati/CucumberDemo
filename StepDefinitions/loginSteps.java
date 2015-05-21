package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;

public class loginSteps extends InitiateDriver{

	
	
	@Given("^I am logged into toolsQA$")
	public void i_am_logged_into_toolsQA() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("http://store.demoqa.com/");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.id("log")).sendKeys("testuser_1");
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
	}
}
