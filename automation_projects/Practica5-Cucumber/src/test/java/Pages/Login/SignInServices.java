package Pages.Login;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SignInServices
{
    private SignInPage signInPage;
    private WebDriver driver;
    public SignInServices(WebDriver driver)
    {
        this.driver = driver;
        signInPage = new SignInPage(driver);
    }
    public void User_opens_the_web_application(String url)
    {
        this.driver.get(url);
    }
    public void Click_on_Sign_In_option()
    {
        this.signInPage.getSign_In_tab().click();
    }
    public void Provide_credentials(String email, String password)
    {
        this.signInPage.getEmail_field().sendKeys(email);
        this.signInPage.getPassword_field().sendKeys(password);
        this.signInPage.getSign_in_button().click();
    }
    public void Verify_the_login_message_displayed(String message)
    {
        Assert.assertEquals(this.signInPage.getLogin_message().getText(),message);
    }
}
