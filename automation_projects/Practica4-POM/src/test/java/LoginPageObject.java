import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject
{
    WebDriver driver;
    By username = By.name("username");
    By password = By.name("password");
    By Login_button = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    public String url;

    public LoginPageObject(WebDriver driver)
    {
        this.driver = driver;
    }
    public void Enter_username(String user)
    {
        driver.findElement(username).sendKeys(user);
    }
    public void Enter_password(String passwd)
    {
        driver.findElement(password).sendKeys(passwd);
    }
    public void Press_the_login_button()
    {
        driver.findElement(Login_button).click();
    }
    public void Get_current_url()
    {
        url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

}
