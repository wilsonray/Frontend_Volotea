package qa.volotea.com.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import qa.volotea.com.questions.CanBookGroup;
import qa.volotea.com.questions.PassengersScreen;
import qa.volotea.com.tasks.OpenBrowser;
import qa.volotea.com.tasks.SelectPassengers;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class passengersStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Wilson Ray Villanueva");
    }
    //Background
    @Given("^that the user is in the Volotea page$")
    public void thatTheUserIsInTheVoloteaPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^he accepts cookies and clicks the passengers number button$")
    public void heClicksThePassengersNumberButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(new SelectPassengers(0));
    }

    @Then("^the user goes to passengers screen$")
    public void theUserGoesToPassengersScreen() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PassengersScreen.message(), org.hamcrest.CoreMatchers.is("ADULTOS")));
    }

    //Scenario: Testing + and - buttons
    @When("^he clicks the \\+ and - buttons$")
    public void he_clicks_the_and_buttons() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectPassengers.withData(1));
        OnStage.theActorInTheSpotlight().attemptsTo(SelectPassengers.withData(2));
    }

    @Then("^the user sees the number of passengers vary by one$")
    public void the_user_sees_the_number_of_passengers_vary_by_one() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PassengersScreen.message(), org.hamcrest.CoreMatchers.is("ADULTOS")));
    }

    //Scenario Outline: Testing multiple number of passengers inputs
    @When("^the user clicks the \\+ button to add passengers according to: '(\\d+)', '(\\d+)', '(\\d+)'$")
    public void the_user_clicks_the_button_to_add_passengers_according_to(int adultos, int children, int babies) {
        for (int i=1;i<adultos;i++){
            OnStage.theActorInTheSpotlight().attemptsTo(SelectPassengers.withData(1));
        }
        for (int i=0;i<children;i++){
            OnStage.theActorInTheSpotlight().attemptsTo(SelectPassengers.withData(3));
        }
        for (int i=0;i<babies;i++){
            OnStage.theActorInTheSpotlight().attemptsTo(SelectPassengers.withData(5));
        }
    }
    @Then("^the user sees '(\\d+)', '(\\d+)', '(\\d+)' passengers selected$")
    public void the_user_sees_passengers_selected(int adultos, int children, int babies) {
        int total = adultos + children;
        if (total > 9){
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CanBookGroup.message(), org.hamcrest.Matchers.is("Reservas de grupos")));
            System.out.println("Group booking button is enabled");
        }
        else{
            System.out.println("Group booking button is disabled");
        }
    }

}
