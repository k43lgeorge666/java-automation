package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccount
{
    public static Target MY_ACCOUNT_TAB = Target.the("My Account page")
            .located(By.id("menu-item-50"));
    public static Target EMAIL_ADDRESS_FIELD = Target.the("The email address field")
            .located(By.id("reg_email"));
    public static Target PASSWORD_FIELD = Target.the("The password field")
            .located(By.id("reg_password"));
    public static Target REGISTER_BUTTON = Target.the("The register user button")
            .located(By.name("register"));

}
