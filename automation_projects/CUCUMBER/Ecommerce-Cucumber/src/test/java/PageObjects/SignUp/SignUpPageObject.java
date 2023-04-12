package PageObjects.SignUp;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class SignUpPageObject
{
    public SignUpPageObject(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@href=\"https://magento.softwaretestingboard.com/customer/account/create/\"]")
    private WebElement Create_an_account_tab;
    @FindBy(id ="firstname")
    private WebElement firstname_field;
    @FindBy(id="lastname")
    private WebElement lastname_field;
    @FindBy(id="email_address")
    private WebElement email_field;
    @FindBy(id="password")
    private WebElement password_field;
    @FindBy(id="password-confirmation")
    private WebElement confirm_password_field;
    @FindBy(xpath = "//*[@title=\"Create an Account\"]")
    private WebElement create_account_button;
    @FindBy(xpath = "//div[contains(text(),'Thank you for registering with Fake Online Clothing Store.')]")
    private WebElement successful_message;
}
