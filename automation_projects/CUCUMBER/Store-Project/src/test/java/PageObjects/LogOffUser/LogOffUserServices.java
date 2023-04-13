package PageObjects.LogOffUser;

import PageObjects.LoginUser.LoginUserPageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LogOffUserServices
{
    private LogOffUserPageObject logOffUserPageObject;
    private LoginUserPageObject loginUserPageObject;
    private WebDriver driver;

    public LogOffUserServices(WebDriver driver)
    {
        this.driver = driver;
        logOffUserPageObject = new LogOffUserPageObject(driver);
        loginUserPageObject = new LoginUserPageObject(driver);
    }
    public void User_open_the_web_page(String url)
    {
        this.driver.get(url);
    }
    public void Click_on_My_Account_tab()
    {
        this.loginUserPageObject.getMy_Account_tab().click();
        this.loginUserPageObject.getLogin_option().click();
    }
    public void User_provides_credentials(String email, String password)
    {
        this.loginUserPageObject.getEmail().sendKeys(email);
        this.loginUserPageObject.getPassword().sendKeys(password);
        this.loginUserPageObject.getLogin_button().click();
    }
    public void Click_on_Logout_option()
    {
        this.loginUserPageObject.getMy_Account_tab().click();
        this.logOffUserPageObject.getLogout_option().click();
    }
    public void Verify_the_user_logout_message(String message)
    {
        Assert.assertEquals(this.logOffUserPageObject.getLogout_message().getText(),message);
    }
}
