#Author: Abu Saeed M Sayem AKA Kaspar Moon
#Author Email: kasparmoonva@gmail.com
#Author Website: www.kasparmoon.us
#Story: Membership Validation
#Story number - TW01
#Product Website: www.advantageonlineshopping.com
#Feature: Membership Validation for AdvantageDemo
#Scenario: Positive Test
#Drafted on October 16, 2021
@membership
Feature: Membership Validation for AdvantageDemo
  Goal of this feature is to Membership Validation for AdvantageDemo website.
  To do so, we will create three different test cases for signup,
  sign in, and account deletion.
  User will visit AdvantageDemo website then create an account first then
  sign into that account and at last user will delete that account.

  @createaccount
  Scenario Outline: Create an Account
    Given Visit AdvantageDemo website
    And User will click on the user icon
    When User click on create a new account text and redirect to registration page
    And User should type "<Username>", "<Email>", "<Password>", and "<Confirm Password>"
    And User will also type "<First Name>", "<Last Name>", and "<Phone Number>"
    And User also select country and type "<City>", "<Address>", "<State>", and "<Postal Code>"
    And User will agree with terms conditions
    Then User should click on the register button
    And User will redirect to the homepage

    Examples: 
      | Username   | Email                | Password | Confirm Password | First Name | Last Name | Phone Number | City   | Address       | State    | Postal Code |
      | kasparmoon | kaspar@kasparmoon.us | Km123456 | Km123456         | Kaspar     | Moon      |   4503402345 | Albany | 5 Central Ave | New York |       12301 |

  @accountsignin
  Scenario Outline: Sign in to the existing account
    Given AdvantageDemo website visit by user
    And Click on user icon by user
    When Type "<Username>" and "<Password>" by user
    And Click on sign in button
    And User can see username beside user icon
    Then User will click on the username
    And Click on the sign out option
    And User will sign out

    Examples: 
      | Username   | Password |
      | kasparmoon | Km123456 |

  @deleteaccount
  Scenario Outline: Sign in to the existing account and delete that account
    Given AdvantageDemo visits by user
    And User just click on user icon
    When User just type "<Username>" and "<Password>"
    And User just click on sign in
    And User will just click on username and my account option
    Then User just will redirect to account page and click on delete account button
    And User can see homepage

    Examples: 
      | Username   | Password |
      | kasparmoon | Km123456 |
