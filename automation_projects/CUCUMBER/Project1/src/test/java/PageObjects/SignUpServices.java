package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class SignUpServices
{
    private SignUpPageObject signUpPageObject;
    private WebDriver driver;
    public SignUpServices(WebDriver driver)
    {
        this.driver = driver;
        signUpPageObject = new SignUpPageObject(driver);
    }
    public void User_opens_the_webapp(String url)
    {
        this.driver.get(url);

    }
    public void Click_on_create_account_tab()
    {
        this.signUpPageObject.getCreate_an_account_tab().click();
    }
    public void Register_personal_information(String firstname, String Lastname)
    {
        this.signUpPageObject.getFirstname_field().sendKeys(firstname);
        this.signUpPageObject.getLastname_field().sendKeys(Lastname);
    }
    public void Register_Sign_In_information(String email, String passwd, String conf_passwd)
    {
        this.signUpPageObject.getEmail_field().sendKeys(email);
        this.signUpPageObject.getPassword_field().sendKeys(passwd);
        this.signUpPageObject.getConfirm_password_field().sendKeys(conf_passwd);
        this.signUpPageObject.getCreate_account_button().click();
    }
    public void Verify_the_message_displayed(String message)
    {
        Assert.assertEquals(this.signUpPageObject.getSuccessful_message().getText(),message);
    }
}
