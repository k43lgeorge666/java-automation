package PageObjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class TestCode extends PageObject
{
    @FindBy(xpath = "//strong[contains(text(),'george')]")
    public WebElementFacade usernametext;
    public void EnterEmailAndPassword()
    {
        $(By.id("menu-item-50")).click();
        $(By.id("username")).type("george@gmail.com");
        $(By.id("password")).type("eDPSH2ZKjWvEyYE");
        $(By.name("login")).click();
    }
    public void VerifyDashboard()
    {
        Assert.assertEquals(usernametext.getText(), "george");
    }
}
