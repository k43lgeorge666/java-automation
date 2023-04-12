package Util;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HookDriver
{
    public static WebDriver driver;
    //protected WebDriverWait wait = new WebDriverWait(driver,20);
    @Before
    public static void createDriver()
    {
        System.setProperty("webdriver.firefox.driver",
                System.getProperty("user.dir") + "/src/main/resources/Drivers");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }
    @After
    public static void quitDriver()
    {
        if(driver!=null)
        {
            driver.quit();
        }
    }
}
