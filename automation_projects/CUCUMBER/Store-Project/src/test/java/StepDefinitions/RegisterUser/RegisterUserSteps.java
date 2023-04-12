package StepDefinitions.RegisterUser;

import PageObjects.RegisterUser.RegisterUserServices;
import Util.HookDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterUserSteps
{
    RegisterUserServices register = new RegisterUserServices(HookDriver.driver);
    @Given("^user open the web page$")
    public void user_opens_the_web_app()
    {
        register.User_opens_the_web_app("https://opencart.abstracta.us/");
    }
    @When("^the user goes to my account tab$")
    public void user_goes_to_my_account_tab()
    {
        register.Click_on_My_Account_tab();
    }
    @And("^the user selects the Register option$")
    public void user_selects_the_register_option()
    {
        register.Select_the_register_option();
    }
    @And("^the user provides the required information$")
    public void the_user_provides_the_required_information()
    {
        register.Register_personal_information();
        register.Register_Password();
        register.Continue_with_the_new_registration();
    }
    @Then("^the user should be notified that the account was created$")
    public void the_successful_message_should_be_displayed()
    {
        register.Verify_the_message_displayed("Congratulations! Your new account has been successfully created!");
    }
}
