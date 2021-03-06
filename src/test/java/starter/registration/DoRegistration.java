package starter.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import starter.login.LoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.login.LoginForm.EMAIL_CREATE_BUTTON;

public class DoRegistration implements Task {

    private final String email_create;

    public DoRegistration(String email) {
        this.email_create = email;
    }

    public static Performable withEmail(String email) {
        return instrumented(DoRegistration.class, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginForm.SIGN_IN),
                Enter.theValue(email_create).into(LoginForm.EMAIL_CREATE),
                MoveMouse.to(EMAIL_CREATE_BUTTON).andThen(actions -> actions.doubleClick() )
        );
    }
}