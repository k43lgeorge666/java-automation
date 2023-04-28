package Tests.Login;

import Pages.Login.SignInServices;
import Util.HookDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInTest
{
    SignInServices login = new SignInServices(HookDriver.driver);
    @Given("^user open the web application$")
    public void user_open_the_webpage()
    {
        login.User_opens_the_web_application("https://magento.softwaretestingboard.com/");
    }
    @When("^the user goes to the Sign_In option$")
    public void user_click_the_sign_in_option()
    {
        login.Click_on_Sign_In_option();
    }
    @And("^the user provides the credentials$")
    public void user_provides_credentials()
    {
        login.Provide_credentials("Marce@gmail.com","75cxqAc4v7Qa8R8");
    }
    @Then("^the user account is logged successfully$")
    public void the_user_is_able_to_login_successfully()
    {
        login.Verify_the_login_message_displayed("Welcome, Marcelo Rojas!");
    }
}
