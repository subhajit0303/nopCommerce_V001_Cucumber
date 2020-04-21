$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customers.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launched chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.user_launched_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.user_can_view_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a new Customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User clicks on Customer menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.user_clicks_on_Customer_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customer menu item",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.click_on_Customer_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add New Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.click_on_Add_New_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Add New Customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.user_can_view_Add_New_Customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters customer info",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.user_enters_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.user_clicks_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.user_can_view_confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login to application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successfully Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launched chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.user_launched_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on Logout button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.clicks_on_Logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepMethods.close_browser()"
});
formatter.result({
  "status": "passed"
});
});