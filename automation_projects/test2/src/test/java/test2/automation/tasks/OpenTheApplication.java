package test2.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import test2.automation.ui.GoogleSearchPage;

public class OpenTheApplication implements Task
{
    GoogleSearchPage googleSearchPage;
    @Step("Open the application")
    public <T extends Actor> void performAs (T actor)
    {
        actor.attemptsTo(Open.browserOn().the(googleSearchPage));
    }
}
