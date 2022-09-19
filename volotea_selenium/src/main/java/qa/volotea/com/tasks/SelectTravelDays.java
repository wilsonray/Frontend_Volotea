package qa.volotea.com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import qa.volotea.com.interactions.ScrollDown;
import qa.volotea.com.interactions.WaitInteraction;
import qa.volotea.com.models.TravelDaysData;

import static qa.volotea.com.userinterfaces.SelectTravelDays.*;

public class SelectTravelDays implements Task {

    private TravelDaysData travelDaysData;
    public SelectTravelDays(TravelDaysData travelDaysData){
        this.travelDaysData=travelDaysData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ScrollDown.on(1), WaitInteraction.waitFor(1), Click.on(SELECT_DEPARTURE_DAY));
        actor.attemptsTo(ScrollDown.on(1),WaitInteraction.waitFor(5), Click.on(SELECT_RETURN_DAY));
        actor.attemptsTo(Click.on(SEARCH_FLIGHTS),WaitInteraction.waitFor(10));

    }

    public static SelectTravelDays withData(TravelDaysData travelDaysData){
        return new SelectTravelDays(travelDaysData);
    }
}
