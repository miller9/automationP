package starter.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;

import static starter.login.LoginForm.DAYS;

public class RegistrationCompleted implements Question<String> {

    public static Question<String> value(){
        return new RegistrationCompleted();
    }

    @Override
    public String answeredBy(Actor actor){

//        String day = SelectedVisibleTextValue.of(DAYS).value();
//         String day = SelectedVisibleTextValue.of(DAYS).onTheScreenOf(actor).value();

        return BrowseTheWeb.as(actor).find(LoginOverview.SELECT_DAY).getText();

    }



}
