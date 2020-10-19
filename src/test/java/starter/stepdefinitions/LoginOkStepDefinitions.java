package starter.stepdefinitions;

import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.dashboard.LoginAuthPage;
import starter.dashboard.RegistrationAuthPage;
import starter.navigation.NavigateTo;
import starter.login.DoLogin;
import starter.registration.DoRegistration;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginOkStepDefinitions {

    String actor;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("(.*) has an active account")
    public void user_has_an_active_account(String name) {
        this.actor = name;
    }

    @When("he sends his valid credentials")
    public void he_sends_his_valid_credentials() {
        theActorCalled(actor).attemptsTo(
                (NavigateTo.storeSamplePage()),
                DoLogin.withCredentials("testOne@automation.com", "12345")
        );
    }

    @Then("he should have access to manage his account")
    public void he_should_have_access_to_manage_his_account() {
        theActorInTheSpotlight().should(
          seeThat("MY ACCOUNT", new LoginAuthPage(), equalTo("MY ACCOUNT"))
        );
    }
}
