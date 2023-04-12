package PageObjects.Login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginServices
{
    private LoginPageObject loginPageObject;
    private WebDriver driver;

    //private WebElement element1;
    public LoginServices(WebDriver driver)
    {
        this.driver = driver;
        loginPageObject = new LoginPageObject(driver);
    }
    public void user_opens_the_webapp(String url)
    {
        this.driver.get(url);
    }
    public void Click_on_Sign_In_tab()
    {
        this.loginPageObject.getSign_In_tab().click();
    }
    public void Provide_email_and_password(String email, String passwd)
    {
        /*WebDriverWait wait = new WebDriverWait(driver,20);
        element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));*/

        this.loginPageObject.getEmail_field().sendKeys(email);
        this.loginPageObject.getPassword_field().sendKeys(passwd);
        this.loginPageObject.getSign_In_button().click();

    }
    public void Verify_the_message_displayed(String message)
    {
        Assert.assertEquals(this.loginPageObject.getUsername_text().getText(),message);
    }
}
