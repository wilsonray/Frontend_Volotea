package qa.volotea.com.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static qa.volotea.com.userinterfaces.Passengers.CHECK_CAN_BOOK_GROUP;

public class CanBookGroup implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CHECK_CAN_BOOK_GROUP), WebElementStateMatchers.isVisible()));
        return Text.of(CHECK_CAN_BOOK_GROUP).viewedBy(actor).asString();
    }
    public static CanBookGroup message(){
        return new CanBookGroup();
    }
}
