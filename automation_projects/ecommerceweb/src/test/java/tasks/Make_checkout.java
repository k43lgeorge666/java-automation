package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import ui.MakeBuy_elements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Make_checkout implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(MakeBuy_elements.BUY_CART_ICON),
        Click.on(MakeBuy_elements.PROCEED_TO_CHECKOUT),
        Click.on(MakeBuy_elements.NEXT_BUTTON),
        Wait.until(WebElementQuestion.the(MakeBuy_elements.PLACE_ORDER), WebElementStateMatchers.isEnabled())
        .forNoLongerThan(30).seconds(),
                Click.on(MakeBuy_elements.PLACE_ORDER));
}
    public static Make_checkout for_the_selected_product()
    {
        return instrumented(Make_checkout.class);
    }
}
