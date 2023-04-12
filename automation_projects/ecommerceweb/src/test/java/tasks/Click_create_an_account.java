package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.UserAccount.UserAccountElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Click_create_an_account implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(UserAccountElements.CREATE_ACCOUNT_OPTION));
    }
    public static Click_create_an_account to_register_a_new_user()
    {
        return instrumented(Click_create_an_account.class);
    }
}
