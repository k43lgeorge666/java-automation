package org.example.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject
{
    WebDriver driver;
    @FindBy(name = "username")
    WebElement username;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement Login_button;
    public String url;

    public LoginPageObject(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void Enter_username(String user)
    {
        username.sendKeys(user);
    }
    public void Enter_password(String passwd)
    {
        password.sendKeys(passwd);
    }
    public void Press_the_login_button()
    {
        Login_button.click();
    }
    public void Get_current_url()
    {
        url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

}
