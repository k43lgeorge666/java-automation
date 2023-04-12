import PageObjects.SignUpPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.RandomNumberGenerator;

public class StepDefinitions
{
    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() throws Throwable
    {
        System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir") + "/src/main/resources/drivers");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        SignUpPageObject signUpPageObject = new SignUpPageObject(driver);

        signUpPageObject.go("https://demo.automationtesting.in/Register.html");
        signUpPageObject.writeFirstName("Pepito");
        signUpPageObject.writeLastName("Perez");
        signUpPageObject.writemailAddress("Perez@gmail.com");
        signUpPageObject.SelectMale();
        signUpPageObject.SelectCountry("Australia");
        signUpPageObject.selectBirthDay("10");
        signUpPageObject.selectBirthMonth("February");
        signUpPageObject.selectBirthYear("1988");
        signUpPageObject.PhoneNumber(RandomNumberGenerator.get());
        signUpPageObject.writePassword("ABC123@@@admin");
        signUpPageObject.confirmPassword("ABC123@@@admin");

        signUpPageObject.clickOnSubmit();

        Thread.sleep(4000);
        driver.quit();
    }
    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() throws Throwable
    {

    }
    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() throws Throwable
    {

    }
}
