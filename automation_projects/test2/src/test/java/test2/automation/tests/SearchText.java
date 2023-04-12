package test2.automation.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import test2.automation.tasks.OpenTheApplication;
import test2.automation.tasks.Search;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;


@RunWith(SerenityRunner.class)
public class SearchText
{
    Actor george = Actor.named("george");
    @Managed(uniqueSession = true)
    public WebDriver hisBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void georgeCanBrowseTheWeb()
    {
        george.can(BrowseTheWeb.with(hisBrowser));
    }
    @Test
    public void search_results_should_show_the_search_text_in_the_title()
    {
        givenThat(george).wasAbleTo(openTheApplication);
        when(george).attemptsTo(Search.forTheText("BATMAN"));
        then(george).should(eventually(seeThat(TheWebPage.title(), containsString("BATMAN"))));
    }

}
