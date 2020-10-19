package starter.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {

    private final String email;
    private final String password;

    public DoLogin(String email, String passwd) {
        this.email = email;
        this.password = passwd;
    }

    public static Performable withCredentials(String email, String passwd) {
        return instrumented(DoLogin.class, email, passwd);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginForm.SIGN_IN),
                Enter.theValue(email).into(LoginForm.USERNAME_FIELD),
                Enter.theValue(password).into(LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.LOGIN_BUTTON)
                //Switch.toAlert()
                // MoveMouse.to(PROFILE_BUTTON).andThen( Actions::doubleClick() )

        );
    }
}