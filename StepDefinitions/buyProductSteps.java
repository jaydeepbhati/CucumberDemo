package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class buyProductSteps extends InitiateDriver{

	WebDriver driver = initiateDriver();

	

	@When("^I search for a MagicMouse$")
	public void i_search_for_a_MagicMouse() throws Throwable {
		WebElement web = driver.findElement(By
				.xpath(".//*[@id='main-nav']/form/fieldset/input[1]"));
		web.sendKeys(" Magic Mouse");
		web.submit();

	}

	@And("^I add it to the cart$")
	public void i_add_it_to_the_cart() throws Throwable {
		driver.findElement(
				By.xpath(".//*[@id='grid_view_products_page_container']/div/div/div[3]/form/div/div[1]/span/input"))
				.click();
		Thread.sleep(5000);
	}

	@And("^I checkout and Continue$")
	public void i_checkout_and_Continue() throws Throwable {

		java.util.Set<String> allWindows = driver.getWindowHandles();
		if (!allWindows.isEmpty()) {
			for (String windowId : allWindows) {

				driver.switchTo().window(windowId);
				driver.findElement(
						By.xpath(".//*[@id='fancy_notification_content']/a[1]"))
						.click();
				Thread.sleep(3000);

			}
		}

		driver.findElement(
				By.xpath(".//*[@id='checkout_page_container']/div[1]/a/span"))
				.click();
	}

	@Then("^I should be navigated to checkout page$")
	public void i_should_be_navigated_to_checkout_page() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Checkout"));
	}

	@When("^I select India from the country dropdown$")
	public void i_enter_billing_and_shipping_address() throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(
				By.xpath(".//*[@id='current_country']"));
		element.click();
		
		Select select = new Select(element);
		select.selectByValue("IN");
		Thread.sleep(2000);
	}

	@And("^I click on purchase$")
	public void i_click_on_purchase() throws Throwable {
		driver.findElement(
				By.xpath(".//*[@id='wpsc_shopping_cart_container']/form/div[4]/div/div/span/input"))
				.click();
	}

	@Then("^I should be navigated to Trasaction results page$")
	public void i_should_be_navigated_to_Trasaction_results_page()
			throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Transaction"));
		driver.quit();
	}

}
