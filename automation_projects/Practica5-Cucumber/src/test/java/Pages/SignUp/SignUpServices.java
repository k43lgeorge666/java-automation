package Pages.SignUp;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class SignUpServices
{
    FakeValuesService fake = new FakeValuesService(new Locale("en-US"), new RandomService());
    Faker faker = Faker.instance(new Locale("en-US"));
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
    public void Register_personal_information()
    {
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();

        this.signUpPage.getFirstname_field().sendKeys(firstname);
        this.signUpPage.getLastname_field().sendKeys(lastname);
    }
    public void Register_Sign_In_Information()
    {
        String email = fake.bothify("????####@gmail.com");
        String passwd = fake.bothify("??????######!!@");

        this.signUpPage.getEmail_field().sendKeys(email);
        this.signUpPage.getPassword_field().sendKeys(passwd);
        this.signUpPage.getConfirm_password_field().sendKeys(passwd);
        this.signUpPage.getCreate_account_button().click();
    }
    public void Verify_the_message_displayed(String message)
    {
        Assert.assertEquals(this.signUpPage.getSuccessful_message().getText(),message);
    }
}
