package Util;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HookDriver
{
    public static WebDriver driver;

    @Before
    public static void createDriver()
    {
        System.setProperty("webdriver.firefox.driver",
        System.getProperty("user.dir") + "/src/main/resources/Drivers");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @After
    public static void guitDriver()
    {
        if(driver!=null)
        {
            driver.quit();
        }
    }
}
