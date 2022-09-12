package qa.volotea.com.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Origin {
    public static final Target CLICK_ORIGIN_BUTTON = Target
            .the("Select the origin button")
            .located(By.xpath("//label[contains(.,'Origen')]"));
    public static final Target CHECK_ORIGIN_SCREEN = Target
            .the("Check being redirected to origin screen")
            .located(By.xpath("//h2[@class='v7-body-text v7-body-text--lg || v7-u-color-dark']"));
    public static final Target CLICK_TO_TYPE_ORIGIN = Target
            .the("Click to type the origin point")
            .located(By.id("origin"));
    public static final Target CLICK_TO_TYPE_DESTINATION = Target
            .the("Click to type the origin point")
            .located(By.id("destination"));
    public static final Target CLICK_TO_SELECT_ORIGIN = Target
            .the("Click to type the origin point")
            .located(By.xpath("//h3[contains(.,'Barcelona')]"));
    public static final Target CLICK_TO_SELECT_DESTINATION = Target
            .the("Click to type the origin point")
            .located(By.xpath("//h3[contains(.,'Estrasburgo')]"));
    public static final Target CHECK_DEPARTURE_DAY_SCREEN = Target
            .the("Check being redirected to departure day screen")
            .located(By.xpath("//li[contains(.,'lun')]"));
}
