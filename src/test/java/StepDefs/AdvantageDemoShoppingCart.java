package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.AdvantageDemoPOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdvantageDemoShoppingCart {
	
	WebDriver driver; //Declaring Selenium WebDriver Global veritable.
	
	@Given("^User will visits AdvantageDemo website$")
	public void user_will_visits_AdvantageDemo_website() throws Throwable {
		//Using Try/Catch block in case there is any run time error occurs. 
				try {
					System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe"); //To open GoogleChrome browser
					driver = new ChromeDriver(); //Getting all ChromeDriver methods inside driver.
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Implicit wait is a soft wait to fix synchronizing issue.
					driver.manage().window().maximize(); //To maximize the window
					driver.get("https://www.advantageonlineshopping.com"); //To open URL of AdvantageDemo Website
				} catch (Exception e) {
					e.printStackTrace(); //It helps to trace the exception as I said at the beginning.
					System.out.println("Check your Browser's Driver Update");
				}
	}

	@When("^User search a \"([^\"]*)\" and select a product with \"([^\"]*)\" and add to cart$")
	public void user_search_a_and_select_a_product_with_and_add_to_cart(String arg1, String arg2) throws Throwable {
		AdvantageDemoPOM Chromebook = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		Chromebook.ClickSearch().click(); //Click on the search icon
		Thread.sleep(7000); // Wait to see the result
		Chromebook.Search().sendKeys(arg1); // Type into the search box
		WebDriverWait wait = new WebDriverWait(driver,30); // Explicit wait is a soft wait to fix synchronizing issue.
		Chromebook.SearchClick().click(); //Click on the search icon
		Thread.sleep(4000); // Wait to see the result
		Chromebook.CloseSearch().click(); // Click to close the search box
		Thread.sleep(4000); // Wait to see the result
		Chromebook.ClickChromebook().click(); // Click to open specific product page
		Thread.sleep(4000); // Wait to see the result
		Chromebook.ColorBlack().click(); //To select product color
		Chromebook.Quantity().sendKeys(arg2); //To type product quantity
		Chromebook.AddToCart().click(); // To click on the "Add to Cart" button
		WebDriverWait waitt = new WebDriverWait(driver,30); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@Then("^User visit shopping cart$")
	public void user_visit_shopping_cart() throws Throwable {
		AdvantageDemoPOM Chromebook = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		Chromebook.ViewCart().click(); //To visit shopping cart
		Thread.sleep(5000); // Wait to see the result
		Chromebook.RemoveCart().click(); //To remove the product from the cart
		Chromebook.ContinueShopping().click(); //To click on the "Continue Shopping" button
		WebDriverWait wait = new WebDriverWait(driver,30); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^User should find a recently added product into the cart$")
	public void user_should_find_a_recently_added_product_into_the_cart() throws Throwable {
		Thread.sleep(5000); // Wait to see the result
		driver.close(); // To close Internet connection with WebDriver
		driver.quit(); // To quit browser
	}

}
