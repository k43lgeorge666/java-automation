import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestNG_test
{
    private WebDriver driver;
    WebElement message;
    @BeforeClass
    public void testSetup()
    {
        //System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test(priority = 2)
    public void Verify_number_of_countries_in_the_world()
    {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@title='Buscar']")).sendKeys("cantidad de paises");
        driver.findElement(By.xpath("//*[@title='Buscar']")).sendKeys(Keys.ENTER);
        message = driver.findElement(By.xpath("//div[@class='V3FYCf']//b[.='195']"));
        Assert.assertTrue(message.getText().contains("195"));
    }
    @Test(priority = 1)
    public void Verify_number_of_countries_in_america()
    {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@title='Buscar']")).sendKeys("cantidad de paises en america");
        driver.findElement(By.xpath("//*[@title='Buscar']")).sendKeys(Keys.ENTER);
        message = driver.findElement(By.xpath("//span[@class='ILfuVd']//b[.='35 países']"));
        Assert.assertTrue(message.getText().contains("35 países"));
    }
    @AfterClass
    public void closeBrowser()
    {
        driver.quit();
    }
}
