package Pages.SignUp;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SignUpServices
{
    private SignUpPage signUpPage;
    private WebDriver driver;
    public SignUpServices(WebDriver driver)
    {
        this.driver = driver;
        signUpPage = new SignUpPage(driver);
    }
    public void User_opens_the_webapp(String url)
    {
        this.driver.get(url);
    }
    public void Click_on_create_account_tab()
    {
        this.signUpPage.getCreate_an_account_tab().click();
    }
    public void Register_personal_information(String firstname, String lastname)
    {
        this.signUpPage.getFirstname_field().sendKeys(firstname);
        this.signUpPage.getLastname_field().sendKeys(lastname);
    }
    public void Register_Sign_In_Information(String email, String passwd, String conf_passwd)
    {
        this.signUpPage.getEmail_field().sendKeys(email);
        this.signUpPage.getPassword_field().sendKeys(passwd);
        this.signUpPage.getConfirm_password_field().sendKeys(conf_passwd);
        this.signUpPage.getCreate_account_button().click();
    }
    public void Verify_the_message_displayed(String message)
    {
        Assert.assertEquals(this.signUpPage.getSuccessful_message().getText(),message);
    }
}
