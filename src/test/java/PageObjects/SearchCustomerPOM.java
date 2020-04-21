package PageObjects;

import Utilities.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPOM {
    WebDriver driver;
    WaitHelper waitHelper;

    public SearchCustomerPOM(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    By txtSearchEmail = By.id("SearchEmail");
    By btnSearch = By.id("search-customers");
    By tblSearchResult = By.id("customers-grid");
    By tblSearchResultRow = By.xpath("//table[@id='customers-grid']/tbody/tr");
    By tblSearchResultCol = By.xpath("//table[@id='customers-grid']/tbody/tr/td");


    public void setSearchEmailAddress(String emailId)
    {
        driver.findElement(txtSearchEmail).clear();
        driver.findElement(txtSearchEmail).sendKeys(emailId);
    }

    public void clickSearchButton()
    {
        driver.findElement(btnSearch).click();
        waitHelper.waitForElement(driver.findElement(tblSearchResult),10);
    }

    public int getTableRows()
    {
        int rows = driver.findElements(tblSearchResultRow).size();
        return rows;
    }
    public int getTableCols()
    {
        int cols = driver.findElements(tblSearchResultCol).size();
        return cols;
    }

    public boolean searchCustomerByEmail(String emailId)
    {
        boolean flag = false;
        for(int i=1;i<=getTableRows();i++)
        {
            String searchedEmail = driver.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
            System.out.println(searchedEmail);

            if(searchedEmail.equals(emailId))
            {
                flag = true;
            }
        }
        return flag;
    }



}
