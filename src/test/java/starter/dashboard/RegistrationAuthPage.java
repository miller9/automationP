package starter.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class RegistrationAuthPage implements Question<String> {

    public static Question<String> value(){
        return new RegistrationAuthPage();
    }

    @Override
    public String answeredBy(Actor actor){
        return BrowseTheWeb.as(actor).find(LoginOverview.CREATE_AN_ACCOUNT).getText();
    }



}
