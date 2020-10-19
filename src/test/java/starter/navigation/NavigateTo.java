package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable storeSamplePage() {
        return Task.where("{0} opens the Automation Practice home page",
                Open.browserOn().the(AutomationHomePage.class)
        );
    }
}