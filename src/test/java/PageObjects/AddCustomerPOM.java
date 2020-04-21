package PageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPOM {

    WebDriver driver;
    WaitHelper waitHelper;

    public AddCustomerPOM(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        waitHelper = new WaitHelper(driver);
    }

    By lnkCustomers_menu = By.xpath("//span[text()='Customers']");
    By lnkCustomers_menuItem = By.xpath("//span[@class='menu-item-title' and text()='Customers']");

    By btnAddNew = By.xpath("//i[@class='fa fa-plus-square']");

    By txtEmail = By.id("Email");
    By txtPassword = By.id("Password");
    By txtFirstName = By.id("FirstName");
    By txtLastName = By.id("LastName");
    By txtCompanyName = By.id("Company");
    By rdBtnGenderMale = By.id("Gender_Male");
    By rdBtnGenderFemale = By.id("Gender_Female");
    By txtDateOfBirth = By.id("DateOfBirth");
    By selectManagerOfVendor = By.id("VendorId");
    By txtAdminComment = By.id("AdminComment");

    By txtCustomerRole = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
    By listItemAdministrators = By.xpath("//li[contains(text(),'Administrators')]");
    By listItemGuests = By.xpath("//li[contains(text(),'Guests')]");
    By listItemVendors = By.xpath("//li[contains(text(),'Vendors')]");
    By listItemRegistered = By.xpath("//li[contains(text(),'Registered')]");

    By btnSave = By.xpath("//button[@name='save']");


    public String getPageTitle()  {
        return driver.getTitle();
    }

    public void clickCustomerMenu() throws InterruptedException {
        driver.findElement(lnkCustomers_menu).click();
    }

    public void clickCustomerMenuItem() throws InterruptedException
    {
        waitHelper.waitForElement(driver.findElement(lnkCustomers_menuItem),5);
        driver.findElement(lnkCustomers_menuItem).click();
    }

    public void clickAddNewButton()
    {
        driver.findElement(btnAddNew).click();
    }

    public void setCustomerEmail(String email)
    {
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void setCustomerPassword(String password)
    {
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void setCustomerRole(String role) throws InterruptedException {
        if(!role.equals("Vendor"))
        {
            driver.findElement(By.xpath("//*[@id='SelectedCustomerRoleIds_taglist']//span[text()='delete']")).click();
        }

        driver.findElement(txtCustomerRole).click();
        WebElement listItem;
        Thread.sleep(3000);

        if(role.equals("Administrators"))
        {
            listItem = driver.findElement(listItemAdministrators);
        }
        else if(role.equals("Guests"))
        {
            listItem = driver.findElement(listItemGuests);
        }
        else if(role.equals("Registered"))
        {
            listItem = driver.findElement(listItemRegistered);
        }
        else if(role.equals("Vendors"))
        {
            listItem = driver.findElement(listItemVendors);
        }
        else
        {
            listItem = driver.findElement(listItemGuests);
        }

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",listItem);
    }

    public void setManagerOfVendor(String value)
    {
        Select s = new Select(driver.findElement(selectManagerOfVendor));
        s.selectByVisibleText(value);
    }

    public void setGender(String gender)
    {
        if(gender.equals("Male"))
        {
            driver.findElement(rdBtnGenderMale).click();
        }
        else if(gender.equals("Female"))
        {
            driver.findElement(rdBtnGenderFemale).click();
        }
        else
        {
            driver.findElement(rdBtnGenderMale).click();
        }
    }

    public void setFirstName(String fname)
    {
        driver.findElement(txtFirstName).sendKeys(fname);
    }

    public void setLastName(String lname)
    {
        driver.findElement(txtLastName).sendKeys(lname);
    }

    public void setCompanyName(String cmpName)
    {
        driver.findElement(txtCompanyName).sendKeys(cmpName);
    }

    public void setDateOfBirth(String dob)
    {
        driver.findElement(txtDateOfBirth).sendKeys(dob);
    }

    public void enterAdminComment(String comment)
    {
        driver.findElement(txtAdminComment).sendKeys(comment);
    }

    public void clickSave()
    {
        driver.findElement(btnSave).click();
    }

}
