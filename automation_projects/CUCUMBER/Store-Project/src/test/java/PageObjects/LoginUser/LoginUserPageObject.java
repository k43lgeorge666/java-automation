package PageObjects.LoginUser;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class LoginUserPageObject
{
    public LoginUserPageObject(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@title=\"My Account\"]")
    private WebElement My_Account_tab;
    @FindBy(xpath = "//*[@href=\"https://opencart.abstracta.us:443/index.php?route=account/login\"]")
    private WebElement Login_option;
    @FindBy(id = "input-email")
    private WebElement email;
    @FindBy(id = "input-password")
    private WebElement password;
    @FindBy(xpath = "//*[@value=\"Login\"]")
    private WebElement Login_button;
}
