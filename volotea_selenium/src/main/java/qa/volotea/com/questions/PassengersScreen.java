package qa.volotea.com.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static qa.volotea.com.userinterfaces.Passengers.CHECK_PSNGER_SCREEN;


public class PassengersScreen implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CHECK_PSNGER_SCREEN), WebElementStateMatchers.isVisible()));
        return Text.of(CHECK_PSNGER_SCREEN).viewedBy(actor).asString();
    }
    public static PassengersScreen message(){
        return new PassengersScreen();
    }
}
