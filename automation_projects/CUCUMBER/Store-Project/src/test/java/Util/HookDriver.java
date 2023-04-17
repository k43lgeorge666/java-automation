package Util;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class HookDriver
{
    public static WebDriver driver;
    @Before
    public static void createDriver()
    {
        System.setProperty("webdriver.firefox.driver",
                System.getProperty("user.dir") + "/src/main/resources/Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        //this is the implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
