package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import ui.StoreMainPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Load implements Task
{
    private StoreMainPage storeMainPage;

    public static final Load theApplicationPage()
    {
        return instrumented(Load.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.browserOn().the(storeMainPage));
    }
}
