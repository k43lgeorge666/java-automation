package StepDefinitions.Buy;
import PageObjects.Buy.BuyJacketServices;
import Util.HookDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuyJacketSteps
{
    BuyJacketServices buy = new BuyJacketServices(HookDriver.driver);
    @Given("^user open the web application$")
    public void user_open_the_webpage()
    {
        buy.user_opens_the_webapp("https://magento.softwaretestingboard.com/");
    }
    @When("^the user logs_in in the web page$")
    public void the_user_provides_credentials()
    {
        buy.Click_on_Sign_In_tab();
        buy.Provide_email_and_password("hacking123@gmail.com","nLjQXTt4Nzg8WF9");
    }
    @And("^the user goes to the jackets page$")
    public void the_user_goes_to_the_jackets_page()
    {
        buy.Click_on_men_jackets_option_tab();
    }
    @And("^the user selects a jacket from the page$")
    public void the_user_selects_a_jacket() throws InterruptedException
    {
        buy.Select_the_item_from__the_page();
        Thread.sleep(8000);
    }
    @And("^the user perform a checkout for the selected item$")
    public void the_user_perform_a_checkout() throws InterruptedException
    {
        buy.Perform_checkout();
        Thread.sleep(10000);
        buy.Finish_the_purchase();
        Thread.sleep(10000);
    }
    @Then("^the user should be notified that the buy was successful completed$")
    public void the_buy_is_completed_successfully()throws InterruptedException
    {
        Thread.sleep(10000);
        buy.Verify_the_purchase_message("Thank you for your purchase!");
    }
}
