package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.UserLogin;

public class TheUserDisplayed implements Question
{
    @Override
    public Object answeredBy(Actor actor)
    {
        return Text.of(UserLogin.USER_LABEL).viewedBy(actor).asString();
    }
    public static TheUserDisplayed displayed()
    {
        return new TheUserDisplayed();
    }
}
