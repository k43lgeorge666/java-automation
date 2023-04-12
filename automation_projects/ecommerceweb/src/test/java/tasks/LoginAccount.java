package tasks;

import abilities.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.seleniumhq.jetty9.server.Authentication;
import ui.UserAccount.UserAccountElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginAccount implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(UserAccountElements.SIGN_IN_OPTION),
                Enter.theValue(Login.as(actor).getEmail())
                        .into(UserAccountElements.EMAIL_LOGIN_FIELD),
                Enter.theValue(Login.as(actor).getPassword())
                        .into(UserAccountElements.PASSWORD_LOGIN_FIELD),
                Click.on(UserAccountElements.SIGN_IN_BUTTON));
    }
    public static LoginAccount with_valid_credentials()
    {
        return instrumented(LoginAccount.class);
    }

}
