package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.UserAccount.UserAccountElements;

public class TheTextDisplayed implements Question
{
    @Override
    public Object answeredBy(Actor actor)
    {
        return Text.of(UserAccountElements.USERNAME_TEXT).viewedBy(actor).asString();
    }
    public static TheTextDisplayed displayed()
    {
        return new TheTextDisplayed();
    }
}
