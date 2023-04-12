package test2.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import test2.automation.ui.SearchBox;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class Search implements Task
{
    private final String searchTerm;

    protected Search(String searchTerm)
    {
        this.searchTerm = searchTerm;
    }
    @Step("Search for a text in google")
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Enter.theValue(searchTerm)
                .into(SearchBox.SEARCH_FIELD)
                .thenHit(ENTER));
    }
    public static Search forTheText(String searchTerm)
    {
        return instrumented(Search.class, searchTerm);
    }

}
