package Pages.Login;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class SignInPage
{
    public SignInPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//div[@class='panel header']//a[contains(.,'Sign In')]")
    private WebElement Sign_In_tab;

    @FindBy(id="email")
    private WebElement email_field;
    @FindBy(id="pass")
    private WebElement password_field;

    @FindBy(id="send2")
    private WebElement Sign_in_button;

    @FindBy(xpath="//*[.='Welcome, Marcelo Rojas!']")
    private WebElement login_message;
}
