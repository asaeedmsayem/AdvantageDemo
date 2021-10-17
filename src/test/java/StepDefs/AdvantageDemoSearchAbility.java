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

public class AdvantageDemoSearchAbility {
	
	WebDriver driver; //Declaring Selenium WebDriver Global veritable.

	@Given("^User visits AdvantageDemo website$")
	public void user_visits_AdvantageDemo_website() throws Throwable {
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

	@When("^User click on the search icon$")
	public void user_click_on_the_search_icon() throws Throwable {
		AdvantageDemoPOM SearchMouse = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		SearchMouse.ClickSearch().click(); //Click on the search icon
		//WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
		Thread.sleep(4000); // Wait to see the result
	}

	@And("^Type \"([^\"]*)\" name$")
	public void type_name(String arg1) throws Throwable {
		AdvantageDemoPOM SearchMouse = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		SearchMouse.Search().sendKeys(arg1); // Type into the search box
		//WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
		Thread.sleep(4000); // Wait to see the result
	}

	@And("^Click on search icon$")
	public void click_on_search_icon() throws Throwable {
		AdvantageDemoPOM SearchMouse = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		SearchMouse.SearchClick().click(); //Click on the search icon
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@Then("^Click on search on close button$")
	public void click_on_search_on_close_button() throws Throwable {
		AdvantageDemoPOM SearchMouse = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		SearchMouse.CloseSearch().click(); // Click to close the search box
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^User will see search result$")
	public void user_will_see_search_result() throws Throwable {
		Thread.sleep(7000); // Wait to see the result
		driver.close(); // Close the driver
		driver.quit(); // Quit Browser
	}

	@Given("^User goes to AdvantageDemo website$")
	public void user_goes_to_AdvantageDemo_website() throws Throwable {
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

	@When("^User click search icon$")
	public void user_click_search_icon() throws Throwable {
		AdvantageDemoPOM SearchLaptop = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		SearchLaptop.ClickSearch().click(); //Click on the search icon
		//WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
		Thread.sleep(4000); // Wait to see the result
	}

	@And("^Type \"([^\"]*)\" in the search box$")
	public void type_in_the_search_box(String arg1) throws Throwable {
		AdvantageDemoPOM SearchLaptop = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		SearchLaptop.Search().sendKeys(arg1);
		//WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
		Thread.sleep(4000); // Wait to see the result
	}

	@And("^Click on the view all button$")
	public void click_on_the_view_all_button() throws Throwable {
		AdvantageDemoPOM SearchLaptop = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		SearchLaptop.ClickViewAll().click();
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@Then("^Click to close search box$")
	public void click_to_close_search_box() throws Throwable {
		AdvantageDemoPOM SearchLaptop = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		SearchLaptop.CloseSearch().click(); // Click to close the search box
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^User will see laptop search result$")
	public void user_will_see_laptop_search_result() throws Throwable {
		Thread.sleep(7000); // Wait to see the result
		driver.close(); // Close the driver
		driver.quit(); // Quit Browser
	}

}
