Feature: Adding to shopping cart

  Scenario: Searching for a product and adding it to shopping cart
    Given user wants to buy a product
    When he searches for "t-shirts" and add it to the cart
    Then the shopping cart is not empty

