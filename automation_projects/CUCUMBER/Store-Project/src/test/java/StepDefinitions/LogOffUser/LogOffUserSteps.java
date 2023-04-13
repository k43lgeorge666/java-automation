package StepDefinitions.LogOffUser;

import PageObjects.LogOffUser.LogOffUserServices;
import Util.HookDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogOffUserSteps
{
    LogOffUserServices logoff = new LogOffUserServices(HookDriver.driver);

    @Given("^user open the webapp$")
    public void user_open_the_webpage()
    {
        logoff.User_open_the_web_page("https://opencart.abstracta.us/");
    }
    @When("^the user login in the web application$")
    public void User_login_in_the_web_application()
    {
        logoff.Click_on_My_Account_tab();
        logoff.User_provides_credentials("george@gmail.com","Admin@123");
    }
    @And("^the user selects the Logout option$")
    public void User_click_on_the_Logout_option()
    {
        logoff.Click_on_Logout_option();
    }
    @Then("^the user should be logout successfully$")
    public void User_is_logged_out_successfully()
    {
        logoff.Verify_the_user_logout_message("You have been logged off your account. It is now safe to leave the computer.");
    }
}
