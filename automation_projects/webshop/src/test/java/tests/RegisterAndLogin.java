package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import questions.TheUserDisplayed;
import tasks.Load;
import tasks.RegisterAccount;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;
@RunWith(SerenityRunner.class)
public class RegisterAndLogin
{
    private Actor george = Actor.named("george");

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void georgeCanBrowseTheWeb()
    {
        george.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
    }
    @Test
    public void New_user_should_be_registered()
    {
        givenThat(george).wasAbleTo(Load.TheApplicationPage());
        when(george).attemptsTo(RegisterAccount.For_a_new_user("hackero@gmail.com",
                "nLjQXTt4Nzg8WF9"));
        then(george).should(seeThat(TheUserDisplayed.displayed(), is ("hackero")));
    }
}
