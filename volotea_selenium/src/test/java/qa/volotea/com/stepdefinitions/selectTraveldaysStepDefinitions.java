package qa.volotea.com.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import qa.volotea.com.models.TravelDaysData;
import qa.volotea.com.tasks.SelectTravelDays;

import java.util.List;

public class selectTraveldaysStepDefinitions {
    @When("^the user clicks the departure day$")
    public void the_user_clicks_the_departure_day(List<TravelDaysData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTravelDays.withData(data.get(0)));
    }

    @Then("^he should see the day he selected and the calendar to select the return day$")
    public void he_should_see_the_day_he_selected_and_the_calendar_to_select_the_return_day() {

    }
}
