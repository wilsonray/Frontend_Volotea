package qa.volotea.com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import qa.volotea.com.models.DestinationData;
import qa.volotea.com.models.OriginData;

import static qa.volotea.com.userinterfaces.Origin.*;


public class SelectOrigin implements Task {

    private int numero;
    public SelectOrigin(int numero){
        this.numero=numero;
    }

    private OriginData oData;
    public SelectOrigin(OriginData oData, int numero){
        this.oData = oData;
        this.numero=numero;
    }
    private DestinationData dData;
    public SelectOrigin(DestinationData dData, int numero){
        this.dData = dData;
        this.numero=numero;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch(numero) {
            case 0: //Background - Going to origin screen
                actor.attemptsTo(Click.on(CLICK_ORIGIN_BUTTON));
                break;
            case 1: //Select origin by typing
                actor.attemptsTo(Click.on(CLICK_TO_TYPE_ORIGIN));
                actor.attemptsTo(Enter.theValue(oData.getOrigin()).into(CLICK_TO_TYPE_ORIGIN));
                break;
            case 2: //Select destination by typing
                actor.attemptsTo(Click.on(CLICK_TO_TYPE_DESTINATION));
                actor.attemptsTo(Enter.theValue(dData.getDestination()).into(CLICK_TO_TYPE_DESTINATION).thenHit(Keys.ENTER));
                actor.attemptsTo(Click.on(CLICK_TO_SELECT_DESTINATION));
                break;
            case 3: //Select origin by clicking
                actor.attemptsTo(Click.on(CLICK_TO_TYPE_ORIGIN));
                actor.attemptsTo(Click.on(CLICK_TO_SELECT_ORIGIN));
                break;
            case 4: //Select destination by clicking
                actor.attemptsTo(Click.on(CLICK_TO_TYPE_DESTINATION));
                actor.attemptsTo(Click.on(CLICK_TO_SELECT_DESTINATION));
                break;
        }
    }

    public static SelectOrigin withCaseNumber(int numero){
        return new SelectOrigin(numero);
    }
    public static SelectOrigin withOriginData(OriginData oData, int numero){
        return new SelectOrigin(oData, numero);
    }
    public static SelectOrigin withDestinationData(DestinationData dData, int numero){
        return new SelectOrigin(dData, numero);
    }
}
