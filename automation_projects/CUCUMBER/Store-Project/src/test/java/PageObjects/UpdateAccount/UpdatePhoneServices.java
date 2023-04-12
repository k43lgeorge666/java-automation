package PageObjects.UpdateAccount;

import PageObjects.LoginUser.LoginUserPageObject;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class UpdatePhoneServices
{
    private LoginUserPageObject loginUserPageObject;
    private UpdatePhonePageObject updatePhonePageObject;
    private WebDriver driver;
    FakeValuesService fake = new FakeValuesService(new Locale("en-US"),new RandomService());

    public UpdatePhoneServices(WebDriver driver)
    {
        this.driver = driver;
        loginUserPageObject = new LoginUserPageObject(driver);
        updatePhonePageObject = new UpdatePhonePageObject(driver);
    }
    public void User_opens_the_web_app(String url)
    {
        this.driver.get(url);
    }
    public void user_login_in_webpage(String email, String password)
    {
        this.loginUserPageObject.getMy_Account_tab().click();
        this.loginUserPageObject.getLogin_option().click();
        this.loginUserPageObject.getEmail().sendKeys(email);
        this.loginUserPageObject.getPassword().sendKeys(password);
        this.loginUserPageObject.getLogin_button().click();
    }
    public void Select_the_Edit_Account_option()
    {
        this.updatePhonePageObject.getEdit_Account_option().click();
    }
    public void Update_the_phone_number()
    {
        int phone = Integer.parseInt(fake.numerify("########"));

        this.updatePhonePageObject.getPhone_field().clear();
        this.updatePhonePageObject.getPhone_field().sendKeys(Integer.toString(phone));
        this.updatePhonePageObject.getContinue_button().click();
    }
    public void Review_the_update_message(String message)
    {
        Assert.assertEquals(this.updatePhonePageObject.getUpdate_message().getText(),message);
    }

}
