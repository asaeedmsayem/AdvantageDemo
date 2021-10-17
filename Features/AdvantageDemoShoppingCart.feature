#Author: Abu Saeed M Sayem AKA Kaspar Moon
#Author Email: kasparmoonva@gmail.com
#Author Website: www.kasparmoon.us
#Story: Validate Shopping Cart
#Story number - TW04
#Product Website: www.advantageonlineshopping.com
#Feature: Shoping Cart Validation
#Scenario: Positive Test
#Drafted on October 15, 2021
Feature: Validate shopping cart
  User should visit AdvantageDemo website and search a product
  into the search box and select a product then add that product
  to the shopping cart. User will visit the shopping cart and
  can see that product into the cart.

  @shoppingcart
  Scenario Outline: Shopping cart validation
    Given User will visits AdvantageDemo website
    When User search a "<product>" and select a product with "<quantity>" and add to cart
    Then User visit shopping cart
    And User should find a recently added product into the cart

    Examples: 
      | product    | quantity |
      | Chromebook |        2 |
