#Author: Abu Saeed M Sayem AKA Kaspar Moon
#Author Email: kasparmoonva@gmail.com
#Author Website: www.kasparmoon.us
#Story: Validate Contact Us
#Story number - TW02
#Product Website: www.advantageonlineshopping.com
#Feature: Validate Contact Us
#Scenario: Positive Test
#Drafted on October 1, 2021
@contact
Feature: Validate Contact Us
  To validate contact us form user needs to visit AdvantageDemo Website
  and click on Contact Us button then user will see contact form bottom
  of the page. User needs to fill-up the form and click of the Send button.
  User will see message sent notification.

  @contactusforproduct
  Scenario Outline: Validate Contact Us Form
    Given User will visit AdvantageDemo website
    When User click on contact us button
    And User will select product category
    And User will select a product
    And User type "<email>" address
    And User type "<subject>" message
    Then User click on send button
    And User see the notification

    Examples: 
      | email                  | subject                                                   |
      | kasparmoonva@gmail.com | This is a test message subject for AdvantageDemo website. |

  @contactuswithoutproduct
  Scenario Outline: Validate Contact Us Form
    Given User should open AdvantageDemo website
    When User click contact button
    And User should type "<email>" address
    And User should type "<subject>" message
    Then User should click the send button
    And User will see notification

    Examples: 
      | email                  | subject                                                   |
      | kasparmoonva@gmail.com | This is a test message subject for AdvantageDemo website. |
