package starter.cart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import starter.login.LoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.cart.Cart.ADD_CART_BUTTON;
import static starter.login.LoginForm.EMAIL_CREATE_BUTTON;

public class AddToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(ADD_CART_BUTTON),
                Click.on(ADD_CART_BUTTON)  //<span>Add to cart</span>
        );
    }
}