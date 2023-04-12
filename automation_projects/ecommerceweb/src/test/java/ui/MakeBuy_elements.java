package ui;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
public class MakeBuy_elements
{
    public static Target WOMEN_TAB = Target.the("The Women tab in the page")
        .located(By.id("ui-id-4"));
    public static Target TOPS_SUBMENU = Target.the("The Tops submenu")
            .located(By.id("ui-id-9"));
    public static Target JACKETS_OPTION = Target.the("The Jackets option from the menu")
            .located(By.id("ui-id-11"));

    //SELECTING A JACKET WEB ELEMENTS AND ADDING TO THE BUY CART

    public static Target SELECT_JACKET = Target.the("The Jacket selected from the web page")
            .located(By.xpath("//*[@src=\"https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/2a213d0c937b30e310c8ee797a880cef/w/j/wj06-purple_main_1.jpg\"]"));

    public static Target JACKET_SIZE = Target.the("The jacket's size")
            .located(By.id("option-label-size-143-item-168"));
    public static Target JACKET_COLOR = Target.the("The jacket's color")
            .located(By.id("option-label-color-93-item-53"));
    public static Target ADD_TO_CART = Target.the("The add to cart option")
            .located(By.id("product-addtocart-button"));

    //PROCEED TO CHECKOUT ELEMENTS

    public static Target BUY_CART_ICON = Target.the("The buy cart icon option")
            .located(By.xpath("//*[@href=\"https://magento.softwaretestingboard.com/checkout/cart/\"]\n"));
    public static Target PROCEED_TO_CHECKOUT = Target.the("The proceed to checkout button")
            .located(By.xpath("//*[@id=\"top-cart-btn-checkout\"]\n"));
    public static Target NEXT_BUTTON = Target.the("The next button")
            .located(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div\n" +
                    "\n" +
                    "\n"));
    public static Target PLACE_ORDER = Target.the("The place order button")
            .located(By.xpath("//*[@class=\"action primary checkout\"]"));

    //THE MESSAGE DISPLAYED AFTER A BUY
    public static Target BUY_MESSAGE = Target.the("The successful buy message")
            .located(By.xpath("//*[@class=\"page-title\"]\n"));







}
