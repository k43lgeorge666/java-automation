package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class SignUpPageObject
{
    private WebDriver driver;
    public SignUpPageObject(WebDriver driver)
    {
        this.driver = driver;
    }
    private By firstNameTextbox = By.xpath("//input[@ng-model='FirstName']");
    private By lastName = By.xpath("//input[@ng-model='LastName']");
    private By emailAddress = By.xpath("//input[@ng-model='EmailAdress']");
    private By phone = By.xpath("//input[@ng-model='Phone']");
    private By genderMale = By.xpath("//input[@value='Male']");
    private By genderFemale = By.xpath("//input[@value='FeMale'");
    private By country = By.id("countries");
    private By dateOfBirthYear = By.id("yearbox");
    private By dateOfBirthMonth = By.xpath("//select[@ng-model='monthbox']");
    private By dateOfBirthDay = By.id("daybox");
    private By password = By.id("firstpassword");
    private By confirmPassword = By.id("secondpassword");
    private By submit = By.id("submitbtn");


    public void go(String url)
    {
        this.driver.get(url);
    }
    public void writeFirstName(String firstname)
    {
        this.driver.findElement(this.firstNameTextbox).sendKeys(firstname);
    }
    public void writeLastName(String lastname)
    {
        this.driver.findElement(this.lastName).sendKeys(lastname);
    }
    public void writemailAddress(String email)
    {
        this.driver.findElement(this.emailAddress).sendKeys(email);
    }
    public void PhoneNumber(String phone)
    {
        this.driver.findElement(this.phone).sendKeys(phone);
    }
    public void SelectMale()
    {
        this.driver.findElement(this.genderMale).click();
    }
    public void SelectFemale()
    {
        this.driver.findElement(this.genderFemale).click();
    }
    public void SelectCountry(String country)
    {
        new Select(this.driver.findElement(this.country)).selectByValue(country);
    }
    public void selectBirthDay(String day)
    {
        new Select(this.driver.findElement(this.dateOfBirthDay)).selectByValue(day);
    }
    public void selectBirthMonth(String month)
    {
        new Select(this.driver.findElement(this.dateOfBirthMonth)).selectByValue(month);
    }
    public void selectBirthYear(String year)
    {
        new Select(this.driver.findElement(this.dateOfBirthYear)).selectByValue(year);
    }
    public void writePassword(String password)
    {
        this.driver.findElement(this.password).sendKeys(password);
    }
    public void confirmPassword(String confirm_password)
    {
        this.driver.findElement(this.confirmPassword).sendKeys(confirm_password);
    }
    public void clickOnSubmit()
    {
        this.driver.findElement(submit).click();
    }

}
