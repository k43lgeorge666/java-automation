package StepDefinitions.LoginUser;

import PageObjects.LoginUser.LoginUserServices;
import Util.HookDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginUserSteps
{
    LoginUserServices login = new LoginUserServices(HookDriver.driver);
    @Given("^user open the web application$")
    public void user_opens_the_webapp()
    {
        login.User_opens_the_web_page("https://opencart.abstracta.us/");
    }
    @When("^the user selects My Account tab option$")
    public void user_selects_my_account_option()
    {
        login.Click_on_My_Account_tab();
    }
    @And("^the user selects the Login option$")
    public void user_selects_the_login_option()
    {
        login.Click_on_Login_option();
    }
    @And("^the user provides email and password$")
    public void user_provides_credentials()
    {
        login.Provide_email_and_password("george@gmail.com","Admin@123");
    }
    @Then("^the user should be logged successfully$")
    public void user_should_be_logged()
    {
        login.Verify_the_url_displayed("https://opencart.abstracta.us/index.php?route=account/account");
    }
}
