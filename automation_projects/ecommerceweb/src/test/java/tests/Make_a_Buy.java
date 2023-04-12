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
import questions.TheMessageforABuyDisplayed;
import tasks.*;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

@RunWith(SerenityRunner.class)
public class Make_a_Buy
{
    private Actor george = Actor.named("george")
            .whoCan(Login.with("hacking123@gmail.com","nLjQXTt4Nzg8WF9"));
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void GeorgeCanBrowseTheWeb()
    {
        george.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
        hisBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void user_should_be_able_to_make_a_buy()
    {
        givenThat(george).wasAbleTo(Load.theApplicationPage());
        and(george).wasAbleTo(LoginAccount.with_valid_credentials());
        and(george).wasAbleTo(Select_women_jackets.to_make_a_buy());
        when(george).attemptsTo(AddProduct.to_the_cart());
        and(george).attemptsTo(Make_checkout.for_the_selected_product());
        then(george).should(seeThat(TheMessageforABuyDisplayed.displayed(), is("Thank you for your purchase!")));
    }
}
