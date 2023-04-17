import org.example.pages.LoginPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPageTest
{
    WebDriver driver;
    LoginPageObject loginPageObject;

    @BeforeTest
    public void Setup()
    {
        //System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Test(priority = 1)
    public void Provide_credentials()
    {
        loginPageObject = new LoginPageObject(driver);
        loginPageObject.Enter_username("Admin");
        loginPageObject.Enter_password("admin123");
        loginPageObject.Press_the_login_button();
        loginPageObject.Get_current_url();
    }
    @AfterTest
    public void CloseBrowser()
    {
        driver.quit();
    }
}
