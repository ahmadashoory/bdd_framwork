Feature: Items checkout functionality

  @checkout
  Scenario: Test ItemsCheckout
    Given user is in homepage
    When user clicks MyAccount
    And user clicks Login
    And user enters email 'sadatsayedibrahim@gmail.com'
    And user enters password 'test123'
    And user clicks loginButton
    Then user move to Cameras
    And user user moves to SonyItem and clicks it
    Then user adds an item to cart
    And user clicks checkout at the bottom of the page
    Then user insert first name
    Then user insert last name
    And user insert the country
    And user insert the address
    Then user insert city
    And user insert state
    And user insert Zipcode
    And user insert the phone
    Then user place the ordrs
    Then user logs out
