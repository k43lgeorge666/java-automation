package PageObjects.Buy;

import PageObjects.Login.LoginPageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BuyJacketServices
{
    private BuyJacketPageObjects buyJacketPageObjects;
    private WebDriver driver;

    public BuyJacketServices(WebDriver driver)
    {
        this.driver = driver;
        buyJacketPageObjects = new BuyJacketPageObjects(driver);
    }

    public void user_opens_the_webapp(String url)
    {
        this.driver.get(url);
    }
    public void Click_on_Sign_In_tab()
    {
        this.buyJacketPageObjects.getSign_In_tab().click();
    }
    public void Provide_email_and_password(String email, String passwd)
    {
        this.buyJacketPageObjects.getEmail_field().sendKeys(email);
        this.buyJacketPageObjects.getPassword_field().sendKeys(passwd);
        this.buyJacketPageObjects.getSign_In_button().click();
    }
    public void Click_on_men_jackets_option_tab()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(this.buyJacketPageObjects.getMen_option_tab()).perform();
        actions.moveToElement(this.buyJacketPageObjects.getMen_tops_tab()).perform();
        this.buyJacketPageObjects.getMen_jackets().click();
    }
    public void Select_the_item_from__the_page()
    {
        this.buyJacketPageObjects.getSelect_jacket().click();
        this.buyJacketPageObjects.getJacket_size().click();
        this.buyJacketPageObjects.getJacket_color().click();
        this.buyJacketPageObjects.getAdd_to_cart_button().click();
    }
    public void Perform_checkout()
    {
        this.buyJacketPageObjects.getThe_cart_icon().click();
        this.buyJacketPageObjects.getProceed_checkout_button().click();
    }
    public void Finish_the_purchase()
    {
        this.buyJacketPageObjects.getNext_button().click();
        this.buyJacketPageObjects.getPlace_order_button().click();
    }
    public void Verify_the_purchase_message(String message)
    {
        Assert.assertEquals(this.buyJacketPageObjects.getPurchase_text().getText(),message);
    }
}
