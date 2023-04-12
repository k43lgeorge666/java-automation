package StepDefinitions.UpdateAccount;

import PageObjects.UpdateAccount.UpdatePhoneServices;
import Util.HookDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpdatePhoneSteps
{
    UpdatePhoneServices update = new UpdatePhoneServices(HookDriver.driver);
    @Given("^user open the web Page$")
    public void user_open_the_webapp()
    {
        update.User_opens_the_web_app("https://opencart.abstracta.us/");
    }
    @When("^the user login into the web application$")
    public void user_login_in_the_webapp()
    {
        update.user_login_in_webpage("george@gmail.com","Admin@123");
    }
    @And("^the user selects the Edit Account option$")
    public void user_selects_Edit_Account_option()
    {
        update.Select_the_Edit_Account_option();
    }
    @And("^the user write the new phone number$")
    public void user_write_the_new_phone()
    {
        update.Update_the_phone_number();
    }
    @Then("^the phone number from the account should be updated$")
    public void the_message_from_the_update_is_displayed()
    {
        update.Review_the_update_message("Success: Your account has been successfully updated.");
    }
}
