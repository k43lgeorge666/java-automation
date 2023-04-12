package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import ui.MakeBuy_elements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Select_women_jackets implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(MoveMouse.to(MakeBuy_elements.WOMEN_TAB),
                MoveMouse.to(MakeBuy_elements.TOPS_SUBMENU),
                Click.on(MakeBuy_elements.JACKETS_OPTION));
    }
    public static Select_women_jackets to_make_a_buy()
    {
        return instrumented(Select_women_jackets.class);
    }
}
