package tests;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import questions.TheMessageDisplayed;
import tasks.Click_create_an_account;
import tasks.Load;
import tasks.Register_user;
import static net.serenitybdd.screenplay.GivenWhenThen.and;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;


@RunWith(SerenityRunner.class)
public class RegisterUser
{
    Actor george = new Actor("george");
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void GeorgeCanBrowsetheWeb()
    {
        george.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
    }
    @Test
    public void user_should_be_registered_successfully()
    {
        givenThat(george).wasAbleTo(Load.theApplicationPage());
        and(george).wasAbleTo(Click_create_an_account.to_register_a_new_user());
        when(george).attemptsTo(Register_user.in_the_web_page("john","connor"));
        then(george).should(seeThat(TheMessageDisplayed.displayed(),
                is("Thank you for registering with Fake Online Clothing Store.")));
    }
}
