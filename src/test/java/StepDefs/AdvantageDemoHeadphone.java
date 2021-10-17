package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.AdvantageDemoPOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdvantageDemoHeadphone {

	WebDriver driver; //Declaring Selenium WebDriver Global veritable.

	@Given("^User should visit AdvantageDemo website$")
	public void user_should_visit_AdvantageDemo_website() throws Throwable {
		//Using Try/Catch block in case there is any run time error occurs. 
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe"); //To open GoogleChrome browser
			driver = new ChromeDriver(); //Getting all ChromeDriver methods inside driver.
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Implicit wait is a soft wait to fix synchronizing issue.
			driver.manage().window().maximize(); //To maximize the window
			driver.get("https://www.advantageonlineshopping.com"); //To open URL of AdvantageDemo Website
		} catch (Exception e) {
			System.out.println("Check your Browser's Driver Update");
			System.out.println("Cause is: " + e.getCause()); //To get cause of the exception.
			System.out.println("Message is: " + e.getMessage()); //To get exception message.
			e.printStackTrace(); //It helps to trace the exception as I said at the beginning.
		}
	}

	@And("^Mouse hover on category picture$")
	public void mouse_hover_on_category_picture() throws Throwable {
		Actions HeadCategory = new Actions (driver); // Used Actions class and created an object so that I can work with mouse hover action 
		AdvantageDemoPOM CategoryValid = new AdvantageDemoPOM (driver); //Object Created to get Web Elements from Page Object Model
		HeadCategory.moveToElement(CategoryValid.HoverHeadphone()).build().perform(); //Performing mouse hover action
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@When("^Click on Shop Now button$")
	public void click_on_Shop_Now_button() throws Throwable {
		AdvantageDemoPOM CategoryValid = new AdvantageDemoPOM (driver); //Object Created to get Web Elements from Page Object Model
		CategoryValid.HeadphoneShopNow().click(); //Click on the Shop Now Button
	}

	@Then("^User redirect to headphone category page$")
	public void user_redirect_to_headphone_category_page() throws Throwable {
		Thread.sleep(7000); // Wait to see the result
		driver.close(); // Close the driver
		driver.quit(); // Quit Browser
	}
}