package qa.volotea.com.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import qa.volotea.com.models.DestinationData;
import qa.volotea.com.models.OriginData;
import qa.volotea.com.questions.DepartureDayScreen;
import qa.volotea.com.questions.OriginScreen;
import qa.volotea.com.tasks.SelectOrigin;

public class originStepDefinitions {

    //Background
    @When("^he clicks the origin button$")
    public void he_clicks_the_origin_button() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOrigin.withCaseNumber(0));
    }
    @Then("^the user goes to origin screen$")
    public void the_user_goes_to_origin_screen() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(OriginScreen.message(), org.hamcrest.CoreMatchers.is("¿ Desde dónde viajas ?")));
    }
    @When("^he types ([^\"]*) as the origin and ([^\"]*) as the destination$")
    public void he_types_origin_and_the_destination(OriginData oData, DestinationData dData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOrigin.withOriginData(oData, 1));
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOrigin.withDestinationData(dData, 2));
    }
    @Then("^the user sees the origin and destiny he selected$")
    public void the_user_sees_the_origin_and_destiny_he_selected() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(DepartureDayScreen.message(), org.hamcrest.CoreMatchers.is("LUN")));
    }
    @When("^he clicks ([^\"]*) as the origin and ([^\"]*) as the destination$")
    public void he_clicks_origin_and_the_destination(OriginData oData, DestinationData dData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOrigin.withOriginData(oData, 3));
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOrigin.withDestinationData(dData, 4));
    }
}
