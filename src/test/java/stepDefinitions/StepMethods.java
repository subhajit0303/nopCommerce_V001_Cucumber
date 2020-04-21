package stepDefinitions;

import PageObjects.AddCustomerPOM;
import PageObjects.LoginPagePOM;
import PageObjects.SearchCustomerPOM;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StepMethods extends BaseClass {

    @Before
    public void Setup() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        prop.load(fis);

        logger = Logger.getLogger("nopCommerce");
        PropertyConfigurator.configure("log4j.properties");

        if(prop.getProperty("browser").equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver",prop.getProperty("chromepath"));
            driver = new ChromeDriver();
        }
        else if(prop.getProperty("browser").equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxpath"));
            driver = new FirefoxDriver();
        }
        else if(prop.getProperty("browser").equalsIgnoreCase("IE"))
        {
            System.setProperty("webdriver.ie.driver",prop.getProperty("iepath"));
            driver = new InternetExplorerDriver();
        }
        else
        {
            System.out.println("Browser not defined");
        }

    }


    @Given("User launched chrome browser")
    public void user_launched_chrome_browser()
    {
        logger.info("*********Launching Browser**********");
        loginPg = new LoginPagePOM(driver);
        driver.manage().window().maximize();

    }

    @When("User opens URL {string}")
    public void user_opens_URL(String urlName)
    {
        logger.info("**********Opening URL************");
        driver.get(urlName);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_Email_as_and_Password_as(String email, String password) {
        logger.info("************Entering Login Details************");
        loginPg.setUserName(email);
        loginPg.setPassword(password);

    }

    @When("Clicks on Login button")
    public void clicks_on_Login_button() throws InterruptedException {
        logger.info("************Loggin In************");
        loginPg.clickLogin();
        Thread.sleep(5000);
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String pageTitle) {

        if(driver.getPageSource().contains("Login was unsuccessful."))
        {
            driver.close();
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertEquals(pageTitle, driver.getTitle());
        }

    }

    @When("Clicks on Logout button")
    public void clicks_on_Logout_button()
    {
        logger.info("************Logging Out************");
        loginPg.clickLogout();
    }


    @Then("Close browser")
    public void close_browser()
    {
        logger.info("************Closing Browser************");
        driver.quit();
    }



    //Customers feature steps definition

    @Then("User can view dashboard")
    public void user_can_view_dashboard() {
        addCustomer = new AddCustomerPOM(driver);
        Assert.assertEquals("Dashboard / nopCommerce administration", addCustomer.getPageTitle());
    }

    @When("User clicks on Customer menu")
    public void user_clicks_on_Customer_menu() throws InterruptedException {
        addCustomer.clickCustomerMenu();
    }

    @When("Click on Customer menu item")
    public void click_on_Customer_menu_item() throws InterruptedException {
        addCustomer.clickCustomerMenuItem();
    }

    @When("Click on Add New Button")
    public void click_on_Add_New_Button()
    {
        logger.info("************Adding New Customer************");
        addCustomer.clickAddNewButton();
    }

    @Then("User can view Add New Customer page")
    public void user_can_view_Add_New_Customer_page() {
        Assert.assertEquals("Add a new customer / nopCommerce administration", addCustomer.getPageTitle());
    }

    @When("User enters customer info")
    public void user_enters_customer_info() throws InterruptedException {
        logger.info("************Entering Customer Details************");
        String email = randomString()+"@gmail.com";
        addCustomer.setCustomerEmail(email);
        addCustomer.setCustomerPassword("test123");
        addCustomer.setFirstName("Subhajit");
        addCustomer.setLastName("Mitra");
        addCustomer.setGender("Male");
        addCustomer.setDateOfBirth("04/11/1990");
        addCustomer.setCompanyName("QATesters");
        addCustomer.setCustomerRole("Guest");
        Thread.sleep(3000);
        addCustomer.setManagerOfVendor("Vendor 2");
        addCustomer.enterAdminComment("Test Add Customer");

    }

    @When("User clicks on Save button")
    public void user_clicks_on_Save_button() throws InterruptedException {
        addCustomer.clickSave();
        Thread.sleep(3000);
    }

    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String msg) {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));

    }



    //Search customer with email-id step definition

    @When("Enter Customer Email")
    public void enter_Customer_Email() {
        logger.info("************Search Customer Details with Email************");
        searchCustomer = new SearchCustomerPOM(driver);
        searchCustomer.setSearchEmailAddress("victoria_victoria@nopCommerce.com");
    }

    @When("User click on Search button")
    public void user_click_on_Search_button() {
        searchCustomer.clickSearchButton();

    }

    @Then("User should find email in search result table")
    public void user_should_find_email_in_search_result_table() {
        boolean status = searchCustomer.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
        Assert.assertEquals(true, status);
    }

}
