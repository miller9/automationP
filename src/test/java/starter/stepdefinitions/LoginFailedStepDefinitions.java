package starter.stepdefinitions;

import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.dashboard.LoginErrorPage;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginFailedStepDefinitions {

    String actor;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("(.*) hasn't an active account")
    public void user_hasn_t_an_active_account(String name) {
        this.actor = name;
    }

    @When("he sends his credentials")
    public void he_sends_his_credentials() {
        theActorCalled(actor).attemptsTo(
                (NavigateTo.storeSamplePage()),
                DoLogin.withCredentials("roger@practice.com", "roger_password")
        );
    }

    @Then("he should not have access to the platform")
    public void he_should_not_have_access_to_the_platform() {


        theActorInTheSpotlight().should(
          seeThat("AUTHENTICATION", new LoginErrorPage(), equalTo("AUTHENTICATION")
        );



    }

}
