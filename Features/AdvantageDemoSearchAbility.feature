#Author: Abu Saeed M Sayem AKA Kaspar Moon
#Author Email: kasparmoonva@gmail.com
#Author Website: www.kasparmoon.us
#Story: Validate Product Search Ability
#Story number - TW05
#Product Website: www.advantageonlineshopping.com
#Feature: Product Search Ability
#Scenario: Positive Test
#Drafted on October 1, 2021
@productsearch
Feature: Product Search Ability
  User should visit AdvantageDemo Website then click on the search icon
  type product name into the box and click on the search icon again then click to close search box. Next step
  is to click on the search icon again, type another product name, click on view all text, close search box.

  @searchmouse
  Scenario Outline: Search Mouse
    Given User visits AdvantageDemo website
    When User click on the search icon
    And Type "<mouse>" name
    And Click on search icon
    Then Click on search on close button
    And User will see search result

    Examples: 
      | mouse          |
      | wireless mouse |

  @searchlaptop
  Scenario Outline: Search Mouse
    Given User goes to AdvantageDemo website
    When User click search icon
    And Type "<laptop name>" in the search box
    And Click on the view all button
    Then Click to close search box
    And User will see laptop search result

    Examples: 
      | laptop name |
      | laptop      |
