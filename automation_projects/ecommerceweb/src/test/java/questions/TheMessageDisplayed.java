package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.UserAccount.UserAccountElements;

public class TheMessageDisplayed implements Question
{
    @Override
    public Object answeredBy(Actor actor)
    {
        return Text.of(UserAccountElements.SUCCESS_MESSAGE).viewedBy(actor).asString();
    }
    public static TheMessageDisplayed displayed()
    {
        return new TheMessageDisplayed();
    }
}
