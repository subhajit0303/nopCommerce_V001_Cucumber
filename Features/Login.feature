Feature: Login to application
  @sanity
  Scenario: Successfully Login with Valid Credentials
    Given User launched chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Clicks on Login button
    Then Page title should be "Dashboard / nopCommerce administration"
    When Clicks on Logout button
    Then Page title should be "Your store. Login"
    And Close browser