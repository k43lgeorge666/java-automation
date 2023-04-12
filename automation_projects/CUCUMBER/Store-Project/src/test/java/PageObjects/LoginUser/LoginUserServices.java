package PageObjects.LoginUser;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginUserServices
{
    private LoginUserPageObject loginUserPageObject;
    private WebDriver driver;
    protected String URL;
    public LoginUserServices(WebDriver driver)
    {
        this.driver = driver;
        loginUserPageObject = new LoginUserPageObject(driver);
    }
    public void User_opens_the_web_page(String url)
    {
        this.driver.get(url);
    }
    public void Click_on_My_Account_tab()
    {
        this.loginUserPageObject.getMy_Account_tab().click();
    }
    public void Click_on_Login_option()
    {
        this.loginUserPageObject.getLogin_option().click();
    }
    public void Provide_email_and_password(String email, String password)
    {
        this.loginUserPageObject.getEmail().sendKeys(email);
        this.loginUserPageObject.getPassword().sendKeys(password);
        this.loginUserPageObject.getLogin_button().click();
    }
    public void Verify_the_url_displayed(String url)
    {
        this.URL = url;
        url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://opencart.abstracta.us/index.php?route=account/account");
    }
}
