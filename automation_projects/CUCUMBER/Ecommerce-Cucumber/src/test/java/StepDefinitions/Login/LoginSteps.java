package StepDefinitions.Login;

import PageObjects.Buy.BuyJacketServices;
import PageObjects.Login.LoginServices;
import Util.HookDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps
{
    LoginServices login = new LoginServices(HookDriver.driver);
    @Given("^user open the webapp$")
    public void user_open_the_webpage()
    {
        login.user_opens_the_webapp("https://magento.softwaretestingboard.com/");
    }
    @When("^the user goes to Sign In tab$")
    public void the_user_goes_to_the_Sign_In_tab()
    {
        login.Click_on_Sign_In_tab();
    }
    @And("^the user provides email and password$")
    public void the_user_provides_credentials()throws InterruptedException
    {
        login.Provide_email_and_password("hacking123@gmail.com","nLjQXTt4Nzg8WF9");
        Thread.sleep(8000);
    }
    @Then("^the user should be logged successfully$")
    public void the_username_text_should_be_displayed()
    {
        login.Verify_the_message_displayed("Default welcome msg!");
    }
}
