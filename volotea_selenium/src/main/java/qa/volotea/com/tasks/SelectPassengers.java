package qa.volotea.com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static qa.volotea.com.userinterfaces.Passengers.*;

public class SelectPassengers implements Task {
    private int numero;
    public SelectPassengers(int numero){
        this.numero=numero;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch(numero) {
            case 0: //Background - Going to passengers screen
                actor.attemptsTo(Click.on(ACCEPT_COOKIES));
                actor.attemptsTo(Click.on(CLICK_PASSENGERS_BUTTON));
                break;
            case 1: //Press adult plus button
                actor.attemptsTo(Click.on(CLICK_ADULT_PLUS_BUTTON));
                break;
            case 2: //Press adult minus button
                actor.attemptsTo(Click.on(CLICK_ADULT_MINUS_BUTTON));
                break;
            case 3: //Press children plus button
                actor.attemptsTo(Click.on(CLICK_CHILDREN_PLUS_BUTTON));
                break;
            case 4: //Press children minus button
                actor.attemptsTo(Click.on(CLICK_CHILDREN_MINUS_BUTTON));
                break;
            case 5: //Press babies plus button
                actor.attemptsTo(Click.on(CLICK_BABIES_PLUS_BUTTON));
                break;
            case 6: //Press babies minus button
                actor.attemptsTo(Click.on(CLICK_BABIES_MINUS_BUTTON));
                break;
            default:
                System.out.println("ok");
                break;
        }
    }
    public static SelectPassengers withData(int numero){
        return new SelectPassengers(numero);
    }
}
