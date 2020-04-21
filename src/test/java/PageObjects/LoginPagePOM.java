package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
    WebDriver driver;

    public LoginPagePOM(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id="Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath="//input[@value='Log in']")
    @CacheLookup
    WebElement loginButton;

    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement logoutLink;

    public void setUserName(String uname)
    {
        txtEmail.clear();
        txtEmail.sendKeys(uname);
    }

    public void setPassword(String pswd)
    {
        txtPassword.clear();
        txtPassword.sendKeys(pswd);
    }

    public void clickLogin()
    {
        loginButton.click();
    }

    public void clickLogout()
    {
        logoutLink.click();
    }


}
