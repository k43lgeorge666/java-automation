package Tests.SignUp;
import Pages.SignUp.SignUpServices;
import Util.HookDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SignUpTest
{
    SignUpServices signup = new SignUpServices(HookDriver.driver);
    @Given("^user open the web page$")
    public void user_open_the_web_page()
    {
        signup.User_opens_the_webapp("https://magento.softwaretestingboard.com/");
    }
    @When("^the user goes to the create account tab$")
    public void user_clicks_on_the_create_account_tab()
    {
        signup.Click_on_create_account_tab();
    }
    @And("^the user provides the required information$")
    public void user_provides_the_required_information()
    {
        signup.Register_personal_information();
        signup.Register_Sign_In_Information();
    }
    @Then("^the user should be notified that the account was created$")
    public void the_successful_message_is_displayed()
    {
        signup.Verify_the_message_displayed("Thank you for registering with Main Website Store.");
    }
}
