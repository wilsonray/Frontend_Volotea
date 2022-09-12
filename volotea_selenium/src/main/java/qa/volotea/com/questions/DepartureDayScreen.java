package qa.volotea.com.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static qa.volotea.com.userinterfaces.Origin.CHECK_DEPARTURE_DAY_SCREEN;

public class DepartureDayScreen implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CHECK_DEPARTURE_DAY_SCREEN), WebElementStateMatchers.isVisible()));
        return Text.of(CHECK_DEPARTURE_DAY_SCREEN).viewedBy(actor).asString();
    }
    public static DepartureDayScreen message(){
        return new DepartureDayScreen();
    }
}
