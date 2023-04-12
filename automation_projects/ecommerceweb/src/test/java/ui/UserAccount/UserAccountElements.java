package ui.UserAccount;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserAccountElements {
    //REGISTER NEW USER
    public static Target CREATE_ACCOUNT_OPTION = Target.the("The create an account tab")
            .located(By.xpath("//*[@href=\"https://magento.softwaretestingboard.com/customer/account/create/\"]"));

    public static Target FIRST_NAME_FIELD = Target.the("The firstname field")
            .located(By.id("firstname"));
    public static Target LAST_NAME_FIELD = Target.the("The lastname field")
            .located(By.id("lastname"));
    public static Target EMAIL_FIELD = Target.the("The email address field")
            .located(By.id("email_address"));
    public static Target PASSWORD_FIELD = Target.the("The password field")
            .located(By.id("password"));
    public static Target PASSWORD_CONFIRMATION_FIELD = Target.the("The password confirmation field")
            .located(By.id("password-confirmation"));
    public static Target CREATE_AN_ACCOUNT_BUTTON = Target.the("The create an account button")
            .located(By.xpath("//*[@class=\"action submit primary\"]"));

    //VERIFY THE SUCCESSFUL MESSAGE AFTER REGISTERING A NEW USER

    public static Target SUCCESS_MESSAGE = Target.the("The success message")
            .located(By.xpath("//*[@class=\"message-success success message\"]\n"));


    //LOGIN A REGISTERED USER
    public static Target SIGN_IN_OPTION = Target.the("The Sign In option tab")
            .located(By.xpath("//*[@href=\"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/\"]"));

    public static Target EMAIL_LOGIN_FIELD = Target.the("The email field from login")
            .located(By.name("login[username]"));
    public static Target PASSWORD_LOGIN_FIELD = Target.the("The password field from login")
            .located(By.name("login[password]"));
    public static Target SIGN_IN_BUTTON = Target.the("The sign_in button")
            .located(By.id("send2"));

    //VERIFY THE SUCCESSFUL LOGIN FOR A REGISTERED USER
    public static Target USERNAME_TEXT = Target.the("The username text")
            .located(By.xpath(" //*[@class=\"logged-in\"]"));


}