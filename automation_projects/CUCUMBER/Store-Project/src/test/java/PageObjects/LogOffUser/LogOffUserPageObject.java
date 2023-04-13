package PageObjects.LogOffUser;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class LogOffUserPageObject
{
    public LogOffUserPageObject(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[.='Logout']")
    private WebElement Logout_option;
    @FindBy(xpath="//*[.='You have been logged off your account. It is now safe to leave the computer.']")
    private WebElement Logout_message;
}
