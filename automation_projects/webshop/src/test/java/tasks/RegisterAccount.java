package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.CreateAccount;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterAccount implements Task
{
    private String email;
    private String password;

    public RegisterAccount(String email, String password)
    {
        this.email = email;
        this.password = password;
    }
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(CreateAccount.MY_ACCOUNT_TAB),
                Enter.theValue(email).into(CreateAccount.EMAIL_ADDRESS_FIELD),
                Enter.theValue(password).into(CreateAccount.PASSWORD_FIELD),
                Click.on(CreateAccount.REGISTER_BUTTON));
    }
    public static RegisterAccount For_a_new_user(String email, String password)
    {
        return instrumented(RegisterAccount.class,email,password);
    }
}
