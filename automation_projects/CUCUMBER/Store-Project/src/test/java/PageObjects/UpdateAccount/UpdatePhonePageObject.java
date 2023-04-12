package PageObjects.UpdateAccount;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class UpdatePhonePageObject
{
    public UpdatePhonePageObject(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[.='Edit Account']")
    private WebElement Edit_Account_option;
    @FindBy(id="input-telephone")
    private WebElement Phone_field;
    @FindBy(xpath="//*[@value='Continue']")
    private WebElement Continue_button;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
    private WebElement Update_message;
}
