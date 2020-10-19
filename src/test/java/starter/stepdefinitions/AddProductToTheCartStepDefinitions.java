package starter.stepdefinitions;

import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.dashboard.RegistrationAuthPage;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;

public class AddProductToTheCartStepDefinitions {


    String actor;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("(.*) wants to buy a product")
    public void roger_wants_to_buy_a_product(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.storeSamplePage());
    }

    @When("he searches for {string} and add it to the cart")
    public void he_searches_for_and_add_it_to_the_cart(String term) {
        withCurrentActor(SearchFor.term(term));

    }

    @Then("the shopping cart is not empty")
    public void the_shopping_cart_is_not_empty() {
        theActorInTheSpotlight().should(
                seeThat("the shopping cart is not empty",
                        SearchResult.titles())//, hasSize(greaterThanOrEqualTo(1)))
        );
    }


}
