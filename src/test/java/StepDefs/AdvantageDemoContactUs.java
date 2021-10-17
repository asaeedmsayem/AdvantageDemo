package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.AdvantageDemoPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdvantageDemoContactUs {
	WebDriver driver; //Declaring Selenium WebDriver Global veritable.
	
	@Given("^User will visit AdvantageDemo website$")
	public void user_will_visit_AdvantageDemo_website() throws Throwable {
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

	@When("^User click on contact us button$")
	public void user_click_on_contact_us_button() throws Throwable {
		AdvantageDemoPOM ContactUsForm = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		ContactUsForm.ContactUs().click(); //Click on the contact us button
		Thread.sleep(4000); // Wait to see the result
	}

	@When("^User will select product category$")
	public void user_will_select_product_category() throws Throwable {
		AdvantageDemoPOM ContactUsForm = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		Select ProductType = new Select (ContactUsForm.ContactProductsType()); //Used Select class for selecting value from a dropdown menu
		ProductType.selectByVisibleText("Speakers"); // Selecting visible text value from dropdown menu
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@When("^User will select a product$")
	public void user_will_select_a_product() throws Throwable {
		AdvantageDemoPOM ContactUsForm = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		Select ProductType = new Select (ContactUsForm.ContactProducts()); //Used Select class for selecting value from a dropdown menu
		ProductType.selectByVisibleText("HP Roar Plus Wireless Speaker"); // Selecting index wise value from dropdown menu
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@When("^User type \"([^\"]*)\" address$")
	public void user_type_address(String arg1) throws Throwable {
		AdvantageDemoPOM ContactUsForm = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		ContactUsForm.ContactUsEmail().sendKeys(arg1); //Typing email address into the text box
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@When("^User type \"([^\"]*)\" message$")
	public void user_type_message(String arg1) throws Throwable {
		AdvantageDemoPOM ContactUsForm = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		ContactUsForm.ContactUsSubject().sendKeys(arg1); //Typing message subject into the text box
		//WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
		Thread.sleep(4000); // Wait to see the result
	}

	@Then("^User click on send button$")
	public void user_click_on_send_button() throws Throwable {
		AdvantageDemoPOM ContactUsForm = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		ContactUsForm.ContactUsSend().click(); //Click on the Send button
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@Then("^User see the notification$")
	public void user_see_the_notification() throws Throwable {
		Thread.sleep(5000); // Wait to see the result
		driver.close(); // Close the driver
		driver.quit(); // Quit Browser
	}

	@Given("^User should open AdvantageDemo website$")
	public void user_should_open_AdvantageDemo_website() throws Throwable {
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

	@When("^User click contact button$")
	public void user_click_contact_button() throws Throwable {
		AdvantageDemoPOM ContactUsForm = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		ContactUsForm.ContactUs().click(); //Click on the contact us button
		Thread.sleep(5000); // Wait to see the result
	}

	@When("^User should type \"([^\"]*)\" address$")
	public void user_should_type_address(String arg1) throws Throwable {
		AdvantageDemoPOM ContactUsForm = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		ContactUsForm.ContactUsEmail().sendKeys(arg1); //Typing email address into the text box
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@When("^User should type \"([^\"]*)\" message$")
	public void user_should_type_message(String arg1) throws Throwable {
		AdvantageDemoPOM ContactUsForm = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		ContactUsForm.ContactUsSubject().sendKeys(arg1); //Typing message subject into the text box
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@Then("^User should click the send button$")
	public void user_should_click_the_send_button() throws Throwable {
		AdvantageDemoPOM ContactUsForm = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		ContactUsForm.ContactUsSend().click(); //Click on the Send button
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@Then("^User will see notification$")
	public void user_will_see_notification() throws Throwable {
		Thread.sleep(7000); // Wait to see the result
		driver.close(); // Close the driver
		driver.quit(); // Quit Browser
	}

}
