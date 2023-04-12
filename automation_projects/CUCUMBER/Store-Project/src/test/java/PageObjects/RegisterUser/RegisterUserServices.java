package PageObjects.RegisterUser;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public class RegisterUserServices
{
    FakeValuesService fake = new FakeValuesService(new Locale("en-US"),new RandomService());
    Faker faker = Faker.instance(new Locale("en-US"));
    private RegisterUserPageObject registerUserPageObject;
    private WebDriver driver;
    private WebElement element1;

    public RegisterUserServices(WebDriver driver)
    {
        this.driver = driver;
        registerUserPageObject = new RegisterUserPageObject(driver);
    }
    public void User_opens_the_web_app(String url)
    {
        this.driver.get(url);
    }
    public void Click_on_My_Account_tab()
    {
        this.registerUserPageObject.getMy_Account_tab().click();
    }
    public void Select_the_register_option()
    {
        this.registerUserPageObject.getRegister_option().click();
    }
    public void Register_personal_information()
    {
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();
        String email = fake.bothify("????####@gmail.com");
        int phone = Integer.parseInt(fake.numerify("#######"));

        this.registerUserPageObject.getFirstname().sendKeys(firstname);
        this.registerUserPageObject.getLastname().sendKeys(lastname);
        this.registerUserPageObject.getEmail().sendKeys(email);
        this.registerUserPageObject.getPhone().sendKeys(Integer.toString(phone));
    }
    public void Register_Password()
    {
        String passwd = fake.bothify("??????#####");
        this.registerUserPageObject.getPassword().sendKeys(passwd);
        this.registerUserPageObject.getConf_passwd().sendKeys(passwd);
    }
    public void Continue_with_the_new_registration()
    {
        this.registerUserPageObject.getPrivacy_check().click();
        this.registerUserPageObject.getContinue_button().click();
    }
    public void Verify_the_message_displayed(String message)
    {
        //WebDriverWait wait = new WebDriverWait(driver,20);
        /*element1 = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//p[.='Congratulations! Your new account has been successfully created!']")));*/

        Assert.assertEquals(this.registerUserPageObject.getSuccessful_message().getText(),message);
    }
}
