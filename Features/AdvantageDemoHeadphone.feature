#Author: Abu Saeed M Sayem AKA Kaspar Moon
#Author Email: kasparmoonva@gmail.com
#Author Website: www.kasparmoon.us
#Story: Validate Home Page Headphone Category
#Story number - TW03
#Product Website: www.advantageonlineshopping.com
#Feature: Headphone Category Validation
#Scenario: Positive Test
#Drafted on October 1, 2021
@headphone
Feature: Headphone Category Validation
  User should visit AdvantageDemo Website then mouse hover on homepage Headphone Category picture.
  A Shop Now button will appare then user needs to click on Shop Now button and user will redirect
  to the headphone category page.

  @getheadphonecategory
  Scenario: Headphone Category Validation
    Given User should visit AdvantageDemo website
    And Mouse hover on category picture
    When Click on Shop Now button
    Then User redirect to headphone category page
