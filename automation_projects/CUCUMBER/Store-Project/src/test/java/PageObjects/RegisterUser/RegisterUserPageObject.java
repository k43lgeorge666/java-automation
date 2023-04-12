package PageObjects.RegisterUser;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class RegisterUserPageObject
{
    public RegisterUserPageObject(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@title=\"My Account\"]")
    private WebElement My_Account_tab;
    @FindBy(xpath = "//*[@href=\"https://opencart.abstracta.us:443/index.php?route=account/register\"]")
    private WebElement Register_option;
    @FindBy(id="input-firstname")
    private WebElement Firstname;
    @FindBy(id="input-lastname")
    private WebElement Lastname;
    @FindBy(id="input-email")
    private WebElement Email;
    @FindBy(id="input-telephone")
    private WebElement Phone;
    @FindBy(id="input-password")
    private WebElement Password;
    @FindBy(id="input-confirm")
    private WebElement Conf_passwd;
    @FindBy(name="agree")
    private WebElement Privacy_check;
    @FindBy(xpath="//*[@value=\"Continue\"]")
    private WebElement Continue_button;
    @FindBy(xpath = "//p[.='Congratulations! Your new account has been successfully created!']")
    private WebElement successful_message;

}
