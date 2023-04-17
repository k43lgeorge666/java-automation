import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class PruebaTest
{
    //private static FirefoxDriver driver;
    private static ChromeDriver driver;
    WebElement message;
    @BeforeClass
    public static void openBrowser()
    {
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void perform_testing()
    {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@title='Buscar']")).sendKeys("cantidad de paises");
        driver.findElement(By.xpath("//*[@title='Buscar']")).sendKeys(Keys.ENTER);
        message = driver.findElement(By.xpath("//div[@class='V3FYCf']//b[.='195']"));
        Assert.assertTrue(message.getText().contains("195"));
    }
    @AfterClass
    public static void closeBrowser()
    {
        driver.quit();
    }
}
