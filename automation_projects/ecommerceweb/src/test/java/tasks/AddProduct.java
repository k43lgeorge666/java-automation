package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.MakeBuy_elements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProduct implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(MakeBuy_elements.SELECT_JACKET),
                Click.on(MakeBuy_elements.JACKET_SIZE),
                Click.on(MakeBuy_elements.JACKET_COLOR),
                Click.on(MakeBuy_elements.ADD_TO_CART));
    }
    public static AddProduct to_the_cart()
    {
        return instrumented(AddProduct.class);
    }
}
