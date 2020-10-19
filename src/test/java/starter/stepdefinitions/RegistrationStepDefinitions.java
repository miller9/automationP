package starter.stepdefinitions;

import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.dashboard.RegistrationAuthPage;
import starter.navigation.NavigateTo;
import starter.registration.DoRegistration;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class RegistrationStepDefinitions {

    String actor;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("(.*) is not registered")
    public void user_is_not_registered(String name) {
        this.actor = name;
    }

    @When("he writes his email to register")
    public void he_writes_his_email_to_register() {
        theActorCalled(actor).attemptsTo(
                (NavigateTo.storeSamplePage()),
                DoRegistration.withEmail("alguien@automation.com")
                //FillingRegistration.withCredentials("1","roger", "waters", "roger_pass", "algo@otra_cosa.com")
        );
    }

    @Then("he should have access to the form")
    public void he_should_have_access_to_the_form() {
        theActorInTheSpotlight().should(
          seeThat("CREATE AN ACCOUNT", new RegistrationAuthPage(), equalTo("CREATE AN ACCOUNT"))
        );
    }
}
