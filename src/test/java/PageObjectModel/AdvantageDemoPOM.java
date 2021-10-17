package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvantageDemoPOM {

	WebDriver driver; // Global variable for WebDriver
	/*
	 *  Constructor is not a method but a special type of method
	 *  1. Constructor shouldn't have any return type.
	 *  2. Constructor Name and Class Name should be the same.
	 */

	public AdvantageDemoPOM (WebDriver driver) {
		//This driver is a local driver inside the constructor.
		this.driver = driver; //Global driver = local driver
		PageFactory.initElements(driver, this);
	}

	//Story: Validate Membership\\
	//Task: Validate Signin Process\\

	// Element 1
	@FindBy(xpath="//a[@id=\"hrefUserIcon\"]") // Used custom 'xpath' locator to identify User icon
	WebElement click_member_icon;
	public WebElement MemberiCon(){
		return click_member_icon;
	}
	// Element 2	
	@FindBy(xpath="//input[@name=\"username\"]") // Used custom 'xpath' locator to identify login username text box
	WebElement type_login_username;
	public WebElement LoginUsername(){
		return type_login_username;
	}
	// Element 3
	@FindBy(xpath="//input[@name=\"password\"]") // Used custom 'xpath' locator to identify login password text box
	WebElement type_login_password;
	public WebElement LoginPassword(){
		return type_login_password;
	}
	// Element 4
	@FindBy(xpath="//input[@name=\"remember_me\"]") // Used custom 'xpath' locator to identify Remember Me Check Box
	WebElement click_remember_me;
	public WebElement LoginRememberMe(){
		return click_remember_me;
	}
	// Element 5
	@FindBy(xpath="//button[@id=\"sign_in_btnundefined\"]") // Used custom 'xpath' locator to identify Sign In Button
	WebElement click_signin;
	public WebElement SignIn(){
		return click_signin;
	}
	//Bonus Element Sign Out
	@FindBy(xpath="//*[@id=\"loginMiniTitle\"]/*[3]") // Used custom 'xpath' locator to identify Sign Out Button
	WebElement click_signout;
	public WebElement AccountSignOut() {
		return click_signout;
	}

	//Story: Validate Membership\\
	//Task: Validate Signup Process\\

	// Element 6
	@FindBy(xpath="//a[@class=\"create-new-account ng-scope\"]") // Used custom 'xpath' locator to identify Create New Account Link
	WebElement click_new_account;
	public WebElement NewAccount(){
		return click_new_account;
	}
	// Element 7
	@FindBy(xpath="//input[@name=\"usernameRegisterPage\"]") // Used custom 'xpath' locator to identify SignUp Username Text Box
	WebElement type_signup_username;
	public WebElement SignUpUsername(){
		return type_signup_username;
	}
	// Element 8
	@FindBy(xpath="//input[@name=\"emailRegisterPage\"]") // Used custom 'xpath' locator to identify SignUp Email Text Box
	WebElement type_signup_email;
	public WebElement SignUpEmail(){
		return type_signup_email;
	}
	// Element 9
	@FindBy(xpath="//input[@name=\"passwordRegisterPage\"]") // Used custom 'xpath' locator to identify SignUp Password Box
	WebElement type_signup_password;
	public WebElement SignUpPassword(){
		return type_signup_password;
	}
	// Element 10
	@FindBy(xpath="//input[@name=\"confirm_passwordRegisterPage\"]") // Used custom 'xpath' locator to identify SignUp Confirm Password Box
	WebElement type_signup_confirm_password;
	public WebElement SignUpConfirmPassword(){
		return type_signup_confirm_password;
	}
	// Element 11
	@FindBy(xpath="//input[@name=\"first_nameRegisterPage\"]") // Used custom 'xpath' locator to identify SignUp First Name Box
	WebElement type_first_name;
	public WebElement SignUpFirstName(){
		return type_first_name;
	}
	// Element 12
	@FindBy(xpath="//input[@name=\"last_nameRegisterPage\"]") // Used custom 'xpath' locator to identify SignUp Last Name Box
	WebElement type_last_name;
	public WebElement SignUpLastName(){
		return type_last_name;
	}
	// Element 13
	@FindBy(xpath="//input[@name=\"phone_numberRegisterPage\"]") // Used custom 'xpath' locator to identify Phone Number Box
	WebElement type_phone;
	public WebElement SignUpPhone(){
		return type_phone;
	}
	// Element 14
	@FindBy(xpath="//select[@name=\"countryListboxRegisterPage\"]") // Used custom 'xpath' locator to identify SignUp Country DropDown
	WebElement select_country;
	public WebElement SignUpCountry(){
		return select_country;
	}
	// Element 15
	@FindBy(xpath="//input[@name=\"cityRegisterPage\"]") // Used custom 'xpath' locator to identify SignUp City Box
	WebElement type_city;
	public WebElement SignUpCity(){
		return type_city;
	}
	// Element 16
	@FindBy(xpath="//input[@name=\"addressRegisterPage\"]") // Used custom 'xpath' locator to identify SignUp Address Box
	WebElement type_signup_address;
	public WebElement SignUpAddress(){
		return type_signup_address;
	}
	// Element 17
	@FindBy(xpath="//input[@name=\"state_/_province_/_regionRegisterPage\"]") // Used custom 'xpath' locator to identify SignUp State Box
	WebElement type_state;
	public WebElement SignUpState(){
		return type_state;
	}
	// Element 18
	@FindBy(xpath="//input[@name=\"postal_codeRegisterPage\"]") // Used custom 'xpath' locator to identify SignUp Postcode Box
	WebElement type_postcode;
	public WebElement SignUpPostCode(){
		return type_postcode;
	}
	// Element 19
	@FindBy(xpath="//input[@name=\"i_agree\"]") // Used custom 'xpath' locator to identify 'I agree' Check Box
	WebElement click_agree;
	public WebElement SignUpAgree(){
		return click_agree;
	}
	// Element 20
	@FindBy(xpath="//button[@id=\"register_btnundefined\"]") // Used custom 'xpath' locator to identify Register Button
	WebElement click_register;
	public WebElement SignUpRegister(){
		return click_register;
	}

	//Story: Validate Membership\\
	//Task: Validate Account Deletion Process\\

	// Element 21
	@FindBy(xpath="//a[@id=\"menuUserLink\"]") // Used custom 'xpath' locator to identify User Account Button
	WebElement click_user_account;
	public WebElement UserAccountPage() {
		return click_user_account;
	}
	// Element 22
	@FindBy(xpath="//*[@id=\"loginMiniTitle\"]/*[1]") // Used 'xpath' locator to identify My Account Option
	WebElement click_my_account;
	public WebElement MyAccount() {
		return click_my_account;
	}
	// Element 23
	@FindBy(xpath="//*[@class=\"deleteMainBtnContainer a-button ng-scope\"]") // Used custom 'xpath' locator to identify Delete Account Button
	WebElement click_delete_account;
	public WebElement DeleteAccount() {
		return click_delete_account;
	}
	// Element 24
	@FindBy(xpath="//*[@class=\"deleteBtnContainer\"]/*[1]") // Used custom 'xpath' locator to identify Delete Confirm Button
	WebElement click_yes;
	public WebElement DeleteYes() {
		return click_yes;
	}
	// Element 25
	@FindBy(xpath="//*[@id=\"loginMiniTitle\"]/*[3]") // Used 'xpath' locator to identify Sign Out Option
	WebElement click_sign_out;
	public WebElement SignOut() {
		return click_sign_out;
	}

	//Story: Validate Contact Us\\

	// Element 26
	@FindBy(xpath="//*[@ng-click=\"gotoElement('contact_us')\"]") // Used custom 'xpath' locator to identify Contact Us Button
	WebElement click_contact_us;
	public WebElement ContactUs() {
		return click_contact_us;
	}
	// Element 27
	@FindBy(xpath="//*[@name=\"categoryListboxContactUs\"]") // Used custom 'xpath' locator to identify Contact Us Product Type
	WebElement select_contact_product;
	public WebElement ContactProductsType() {
		return select_contact_product;
	}
	// Element 28
	@FindBy(xpath="//*[@name=\"productListboxContactUs\"]") // Used custom 'xpath' locator to identify Contact Us Products
	WebElement select_contact_products;
	public WebElement ContactProducts() {
		return select_contact_products;
	}
	// Element 29
	@FindBy(xpath="//*[@name=\"emailContactUs\"]") // Used custom 'xpath' locator to identify Contact Us Email
	WebElement type_contact_email;
	public WebElement ContactUsEmail() {
		return type_contact_email;
	}
	// Element 30
	@FindBy(xpath="//*[@name=\"subjectTextareaContactUs\"]") // Used custom 'xpath' locator to identify Contact Us Subject Box
	WebElement type_contact_subject;
	public WebElement ContactUsSubject() {
		return type_contact_subject;
	}
	// Element 31
	@FindBy(xpath="//*[@id=\"send_btnundefined\"]") // Used custom 'xpath' locator to identify Contact Us Send Button
	WebElement click_contact_send;
	public WebElement ContactUsSend() {
		return click_contact_send;
	}

	//Story: Validate Product Search ability\\

	// Element 32
	@FindBy(xpath="//*[@id=\"search\"]") // Used custom 'xpath' locator to identify Search Button
	WebElement click_search;
	public WebElement ClickSearch() {
		return click_search;
	}

	//Element 45
	@FindBy(xpath="//*[@id=\"menuSearch\"]") // Used custom 'xpath' locator to identify search button
	WebElement click_search_second;
	public WebElement SearchClick() {
		return click_search_second;
	}

	// Element 33
	@FindBy(xpath="//*[@id=\"autoComplete\"]") // Used custom 'xpath' locator to identify Search Box
	WebElement type_search;
	public WebElement Search() {
		return type_search;
	}

	// Element 34
	//Following xpath not only define Web UI Element but also defines specific text by using selenium text() function.
	@FindBy(xpath="//*[@id=\"output\"]//*[text()='View All']") // Used custom 'xpath' locator to identify View All Link Text
	WebElement click_view_all;
	public WebElement ClickViewAll() {
		return click_view_all;
	}
	// Element 35
	@FindBy(xpath="//*[@src=\"../../css/images/closeDark.png\"]") // Used custom 'xpath' locator to identify close button of search box
	WebElement click_close;
	public WebElement CloseSearch() {
		return click_close;
	}

	//Story: Validate Home Page Headphone Category\\

	// Element 36
	@FindBy(xpath="//*[@id=\"headphonesImg\"]") // Used custom 'xpath' locator to identify Headphones category Image.
	WebElement hover_headphone;
	public WebElement HoverHeadphone() {
		return hover_headphone;
	}
	// Element 37
	@FindBy(xpath="//*[@id=\"headphonesLink\"]") // Used custom 'xpath' locator to identify Headphones category Shop Now Button.
	WebElement click_headphone_shop_now;
	public WebElement HeadphoneShopNow() {
		return click_headphone_shop_now;
	}

	//Story: Validate Shopping Cart\\

	// Element 38
	@FindBy(xpath="//*[text()='HP Chromebook 14 G1(ENERGY STAR)']") // Used custom 'xpath' locator with Text() function to identify specific product
	WebElement click_product;
	public WebElement ClickChromebook() {
		return click_product;
	}
	// Element 39
	@FindBy(xpath="//*[@ng-show=\"!firstImageToShow\"]/*[1]") // Used custom 'xpath' locator to identify BLUE color
	WebElement click_blue;
	public WebElement ColorBlack() {
		return click_blue;
	}
	// Element 40
	@FindBy(xpath="//*[@name=\"quantity\"]") //Used custom 'xpath' locator to identify quantity input box
	WebElement type_quantity;
	public WebElement Quantity() {
		return type_quantity;
	}
	// Element 41
	@FindBy(xpath="//*[@name=\"save_to_cart\"]") //Used custom 'xpath' locator to identify Add To Cart Button
	WebElement click_addtocart;
	public WebElement AddToCart() {
		return click_addtocart;
	}
	// Element 42
	@FindBy(xpath="//*[@id=\"menuCart\"]") //Used custom 'xpath' locator to identify Cart Button from top menu bar
	WebElement click_view_cart;
	public WebElement ViewCart() {
		return click_view_cart;
	}
	// Element 43
	@FindBy(xpath="//*[@class=\"actions\"]//*[text()='REMOVE']") //Used custom 'xpath' locator with text() function to identify REMOVE button
	WebElement click_remove_cart;
	public WebElement RemoveCart() {
		return click_remove_cart;
	}
	// Element 44
	@FindBy(xpath="//*[@class=\"a-button ng-scope\"]") //Used custom 'xpath' locator to identify CONTINUE SHOPPING button
	WebElement click_continue_shopping;
	public WebElement ContinueShopping() {
		return click_continue_shopping;
	}
}