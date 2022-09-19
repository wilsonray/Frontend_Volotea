package qa.volotea.com.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectTravelDays {
    public static final Target SELECT_DEPARTURE_DAY = Target
            .the("Select departure day")
            .locatedBy("//sf-calendar-month[@id='vol-month-9']/div/sf-calendar-day[29]");
    public static final Target SELECT_RETURN_DAY = Target
            .the("Select return day")
            .locatedBy("//sf-calendar-month[@id='vol-month-11']/div/sf-calendar-day[22]");
    public static  final Target SEARCH_FLIGHTS = Target
            .the("Search flights")
            .located(By.xpath("//span[contains(.,'Buscar vuelos')]"));
}
