package StepDefinitions.SignUp;

import PageObjects.SignUp.SignUpServices;
import Util.HookDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpSteps
{
    SignUpServices signup = new SignUpServices(HookDriver.driver);

    @Given("^user open the web page$")
    public void user_open_the_webpage()
    {
        signup.User_opens_the_webapp("https://magento.softwaretestingboard.com/");
    }
    @When("^the user goes to the create account tab$")
    public void the_user_clicks_on_the_create_account_tab()
    {
        signup.Click_on_create_account_tab();
    }
    @And("^the user provides the required information$")
    public void the_user_provides_the_required_information() throws InterruptedException
    {
        signup.Register_personal_information("Luis","Gonzales");
        signup.Register_Sign_In_information("LuisGonzales@gmail.com","Admin@@@12345","Admin@@@12345");
        Thread.sleep(8000);
    }
    @Then("^the user should be notified that the account was created$")
    public void the_successful_message_should_be_displayed()
    {
        signup.Verify_the_message_displayed("Thank you for registering with Fake Online Clothing Store.");
    }

}
