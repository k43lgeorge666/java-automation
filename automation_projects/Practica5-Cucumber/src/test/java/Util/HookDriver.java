package Util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class HookDriver
{
    public static WebDriver driver;
    @Before
    public static void createDrive()
    {
        System.setProperty("webdriver.firefox.driver",
                System.getProperty("user.dir") + "/src/main/resources/Drivers");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
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
