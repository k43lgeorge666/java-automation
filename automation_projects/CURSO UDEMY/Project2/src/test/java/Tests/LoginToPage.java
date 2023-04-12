package Tests;

import PageObjects.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
public class LoginToPage
{
    @Steps
    HomePage homePage;
    @Managed
    WebDriver driver;
    @Test
    public void LoginPage()
    {
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //homePage.VerifyTitle();
        homePage.EnterCredentials();
        homePage.VerifyDashboard();
    }

}
