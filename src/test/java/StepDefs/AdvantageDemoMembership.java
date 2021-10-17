package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.AdvantageDemoPOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdvantageDemoMembership {

	WebDriver driver; //Declaring Selenium WebDriver Global veritable.

	//Test Steps for Creating an Account

	@Given("^Visit AdvantageDemo website$")
	public void visit_AdvantageDemo_website() throws Throwable {
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

	@And("^User will click on the user icon$")
	public void user_will_click_on_the_user_icon() throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.MemberiCon().click(); // To click on the User icon
		Thread.sleep(4000); // Wait to see the result
	}

	@When("^User click on create a new account text and redirect to registration page$")
	public void user_click_on_create_a_new_account_text_and_redirect_to_registration_page() throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.NewAccount().click(); // To click on the create new account text
		Thread.sleep(5000); // Wait to see the result
	}

	@And("^User should type \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", and \"([^\"]*)\"$")
	public void user_should_type_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.SignUpUsername().sendKeys(arg1); // To type username
		CreateAccount.SignUpEmail().sendKeys(arg2); // To type email
		CreateAccount.SignUpPassword().sendKeys(arg3); // To type password
		CreateAccount.SignUpConfirmPassword().sendKeys(arg4); // To type confirm password
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^User will also type \"([^\"]*)\", \"([^\"]*)\", and \"([^\"]*)\"$")
	public void user_will_also_type_and(String arg1, String arg2, String arg3) throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.SignUpFirstName().sendKeys(arg1); // To type first name
		CreateAccount.SignUpLastName().sendKeys(arg2); // To type last name
		CreateAccount.SignUpPhone().sendKeys(arg3); // To type phone number
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^User also select country and type \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", and \"([^\"]*)\"$")
	public void user_also_select_country_and_type_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		Select Country = new Select(CreateAccount.SignUpCountry()); // Creating Select Object from Selenium for select the country
		Country.selectByVisibleText("United States"); // To select country name from the drop down list
		CreateAccount.SignUpCity().sendKeys(arg1); // To type the city
		CreateAccount.SignUpAddress().sendKeys(arg2); // To type address
		CreateAccount.SignUpState().sendKeys(arg3); // To type state
		CreateAccount.SignUpPostCode().sendKeys(arg4); // To type post code
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^User will agree with terms conditions$")
	public void user_will_agree_with_terms_conditions() throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.SignUpAgree().click(); // To click on 'I agree' option
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@Then("^User should click on the register button$")
	public void user_should_click_on_the_register_button() throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.SignUpRegister().click(); // To click on the Register button
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^User will redirect to the homepage$")
	public void user_will_redirect_to_the_homepage() throws Throwable {
		Thread.sleep(5000); // Wait to see the result
		driver.close(); // To close Internet connection with WebDriver
		driver.quit(); // To quit browser
	}

	//Test Steps for Sign in

	@Given("^AdvantageDemo website visit by user$")
	public void advantagedemo_website_visit_by_user() throws Throwable {
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

	@And("^Click on user icon by user$")
	public void click_on_user_icon_by_user() throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.MemberiCon().click(); // To click on the User icon
		Thread.sleep(4000); // Wait to see the result
	}

	@When("^Type \"([^\"]*)\" and \"([^\"]*)\" by user$")
	public void type_and_by_user(String arg1, String arg2) throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.LoginUsername().sendKeys(arg1); // To type username
		CreateAccount.LoginPassword().sendKeys(arg2); // To type password
		CreateAccount.LoginRememberMe().click(); // To click on the 'I agree' option
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^Click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.SignIn().click(); // To click on the Sign In button
		WebDriverWait wait = new WebDriverWait(driver,40); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^User can see username beside user icon$")
	public void user_can_see_username_beside_user_icon() throws Throwable {
		Thread.sleep(4000); // Wait to see the result
	}

	@Then("^User will click on the username$")
	public void user_will_click_on_the_username() throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.UserAccountPage().click(); // To click on the username beside user icon
		WebDriverWait wait = new WebDriverWait(driver,40); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^Click on the sign out option$")
	public void click_on_the_sign_out_option() throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.AccountSignOut().click(); // To click on the sign out button
		WebDriverWait wait = new WebDriverWait(driver,40); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^User will sign out$")
	public void user_will_sign_out() throws Throwable {
		Thread.sleep(5000); // Wait to see the result
		driver.close(); // To close Internet connection with WebDriver
		driver.quit(); // To quit browser
	}

	//Test Steps for Delete an Account

	@Given("^AdvantageDemo visits by user$")
	public void advantagedemo_visits_by_user() throws Throwable {
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

	@And("^User just click on user icon$")
	public void user_just_click_on_user_icon() throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.MemberiCon().click(); // To click on the User icon
		Thread.sleep(4000); // Wait to see the result
	}

	@When("^User just type \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_just_type_and(String arg1, String arg2) throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.LoginUsername().sendKeys(arg1); // To type username
		CreateAccount.LoginPassword().sendKeys(arg2); // To type password
		CreateAccount.LoginRememberMe().click(); // To click on the 'I agree' option
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^User just click on sign in$")
	public void user_just_click_on_sign_in() throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.SignIn().click(); // To click on the Sign In button
		Thread.sleep(4000); // Wait to see the result
	}

	@And("^User will just click on username and my account option$")
	public void user_will_just_click_on_username_and_my_account_option() throws Throwable {
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.UserAccountPage().click(); // To click on the username beside user icon
		CreateAccount.MyAccount().click(); // To click on the my account option
		WebDriverWait wait = new WebDriverWait(driver,40); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@Then("^User just will redirect to account page and click on delete account button$")
	public void user_just_will_redirect_to_account_page_and_click_on_delete_account_button() throws Throwable {
		Thread.sleep(4000); // Wait to see the result
		AdvantageDemoPOM CreateAccount = new AdvantageDemoPOM(driver); //Object Created to get Web Elements from Page Object Model
		CreateAccount.DeleteAccount().click(); // To click on the Delete button
		CreateAccount.DeleteYes().click(); // To click on the yes button to confirm delete
		WebDriverWait wait = new WebDriverWait(driver,40); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^User can see homepage$")
	public void user_can_see_homepage() throws Throwable {
		Thread.sleep(5000); // Wait to see the result
		driver.close(); // To close Internet connection with WebDriver
		driver.quit(); // To quit browser
	}

}
