package starter.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class RegistrationShoppingCart implements Question<String> {

    public static Question<String> value(){
        return new RegistrationShoppingCart();
    }

    @Override
    public String answeredBy(Actor actor){
        return BrowseTheWeb.as(actor).find(LoginOverview.REGISTERED_SHOPPING_CART).getText();
    }



}
