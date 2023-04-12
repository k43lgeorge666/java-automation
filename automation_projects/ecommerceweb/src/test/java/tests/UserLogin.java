package tests;

import abilities.Login;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import questions.TheTextDisplayed;
import tasks.Load;
import tasks.LoginAccount;

import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class UserLogin
{
    private Actor george = Actor.named("george")
            .whoCan(Login.with("hacking123@gmail.com","nLjQXTt4Nzg8WF9"));

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void GeorgeCanBrowsetheWeb()
    {
        george.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
    }
    @Test
    public void user_should_be_able_to_login_successfully()
    {
        givenThat(george).wasAbleTo(Load.theApplicationPage());
        when(george).wasAbleTo(LoginAccount.with_valid_credentials());
        then(george).should(seeThat(TheTextDisplayed.displayed(), is("Welcome, george velasquez!")));
    }
}
