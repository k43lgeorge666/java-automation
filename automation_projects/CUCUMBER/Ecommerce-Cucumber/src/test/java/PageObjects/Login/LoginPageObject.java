package PageObjects.Login;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class LoginPageObject
{
    public LoginPageObject(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//*[@href=\"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/\"]")
    private WebElement Sign_In_tab;
    @FindBy(id="email")
    private WebElement email_field;
    @FindBy(id="pass")
    private WebElement password_field;
    @FindBy(id="send2")
    private WebElement Sign_In_button;
    @FindBy(xpath="//*[@class=\"greet welcome\"]")
    private WebElement username_text;
}
