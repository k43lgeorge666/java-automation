package PageObjects.Buy;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class BuyJacketPageObjects
{
    public BuyJacketPageObjects (WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@href=\"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/\"]")
    private WebElement Sign_In_tab;
    @FindBy(id="email")
    private WebElement email_field;
    @FindBy(id="pass")
    private WebElement password_field;
    @FindBy(id="send2")
    private WebElement Sign_In_button;
    @FindBy(id="ui-id-5")
    private WebElement Men_option_tab;
    @FindBy(id="ui-id-17")
    private WebElement men_tops_tab;
    @FindBy(id="ui-id-19")
    private WebElement men_jackets;
    @FindBy(xpath="//*[@src=\"https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/2a213d0c937b30e310c8ee797a880cef/m/j/mj08-gray_main_1.jpg\"]")
    private WebElement Select_jacket;
    @FindBy(id="option-label-size-143-item-170")
    private WebElement Jacket_size;
    @FindBy(id="option-label-color-93-item-53")
    private WebElement Jacket_color;
    @FindBy(id="product-addtocart-button")
    private WebElement Add_to_cart_button;
    @FindBy(xpath="//*[@href=\"https://magento.softwaretestingboard.com/checkout/cart/\"]")
    private WebElement the_cart_icon;
    @FindBy(xpath="//*[@id=\"top-cart-btn-checkout\"]\n")
    private WebElement proceed_checkout_button;
    @FindBy(xpath="//*[@data-role=\"opc-continue\"]")
    private WebElement next_button;
    @FindBy(xpath="//*[@title=\"Place Order\"]")
    private WebElement place_order_button;
    @FindBy(xpath="/html/body/div[2]/main/div[1]/h1/span")
    private WebElement purchase_text;

}
