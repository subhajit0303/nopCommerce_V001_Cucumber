package stepDefinitions;

import PageObjects.AddCustomerPOM;
import PageObjects.LoginPagePOM;
import PageObjects.SearchCustomerPOM;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BaseClass {

    public WebDriver driver;
    public LoginPagePOM loginPg;
    public AddCustomerPOM addCustomer;
    public SearchCustomerPOM searchCustomer;
    public static Logger logger;
    public Properties prop;

    public static String randomString()
    {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return generatedString;
    }
}
