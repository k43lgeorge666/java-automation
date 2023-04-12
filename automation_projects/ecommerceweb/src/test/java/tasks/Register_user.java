package tasks;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.seleniumhq.jetty9.server.Authentication;
import ui.UserAccount.UserAccountElements;

import java.util.Locale;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Register_user implements Task
{
    String firstname, lastname;

    public Register_user(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        FakeValuesService fake = new FakeValuesService(new Locale("en-US"),new RandomService());
        String email = fake.bothify("????####@gmail.com");

        actor.attemptsTo(Enter.theValue(firstname).into(UserAccountElements.FIRST_NAME_FIELD),
                        Enter.theValue(lastname).into(UserAccountElements.LAST_NAME_FIELD),
                        Enter.theValue(email).into(UserAccountElements.EMAIL_FIELD),
                        Enter.theValue("nLjQXTt4Nzg8WF9").into(UserAccountElements.PASSWORD_FIELD),
                        Enter.theValue("nLjQXTt4Nzg8WF9").into(UserAccountElements.PASSWORD_CONFIRMATION_FIELD),
                        Click.on(UserAccountElements.CREATE_AN_ACCOUNT_BUTTON));
    }
    public static Register_user in_the_web_page(String firstname, String lastname)
    {
        return instrumented(Register_user.class, firstname,lastname);
    }
}
