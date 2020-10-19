package starter.stepdefinitions;

import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.dashboard.RegistrationAuthPage;
import starter.dashboard.RegistrationShoppingCart;
import starter.navigation.NavigateTo;
import starter.registration.DoRegistration;
import starter.registration.FillingRegistration;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class RegistrationCompletedStepDefinitions {

    String actor;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("(.*) wants to complete registration")
    public void user_wants_to_complete_registration(String name) { this.actor = name; }


    @When("he has access to the form")
    public void he_has_access_to_the_form() {
        theActorCalled(actor).attemptsTo(
                (NavigateTo.storeSamplePage()),
                DoRegistration.withEmail("otro_usuario@automation.com"),
                FillingRegistration.withCredentials("otro_usuario@automation.com",
                        "1","roger", "waters", "roger_pass", "2", "true", " true",
                        "CHOUCAIR","cra 10", "calle 20", "Montgomery", "Alabama", "12345",
                        "United States","cero","347-5683290", "696-5431278")
        );
    }

    @Then("he completes registration")
    public void he_completes_registration() {
        theActorInTheSpotlight().should(
                seeThat("SHOPPING-CART SUMMARY", new RegistrationShoppingCart(), equalTo("SHOPPING-CART SUMMARY"))
        );
    }
}
