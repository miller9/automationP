package starter.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class LoginAuthPage implements Question<String> {

    public static Question<String> value(){
        return new LoginAuthPage();
    }

    @Override
    public String answeredBy(Actor actor){
        return BrowseTheWeb.as(actor).find(LoginOverview.MY_ACCOUNT).getText();
    }



}
