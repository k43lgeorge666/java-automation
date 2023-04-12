package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.MakeBuy_elements;

public class TheMessageforABuyDisplayed implements Question
{
    @Override
    public Object answeredBy(Actor actor)
    {
        return Text.of(MakeBuy_elements.BUY_MESSAGE).viewedBy(actor).asString();
    }
    public static TheMessageforABuyDisplayed displayed()
    {
        return new TheMessageforABuyDisplayed();
    }

}
