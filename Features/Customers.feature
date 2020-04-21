Feature: Customers

  Background:
    Given User launched chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Clicks on Login button
    Then User can view dashboard

  @sanity
  Scenario: Add a new Customer
    When User clicks on Customer menu
    And Click on Customer menu item
    And Click on Add New Button
    Then User can view Add New Customer page
    When User enters customer info
    And User clicks on Save button
    Then User can view confirmation message "The new customer has been added successfully."
    And Close browser

  @regression
  Scenario: Search Customer by Email ID
    When User clicks on Customer menu
    And Click on Customer menu item
    And Enter Customer Email
    When User click on Search button
    Then User should find email in search result table
    And Close browser