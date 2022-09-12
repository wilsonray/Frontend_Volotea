package qa.volotea.com.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Passengers {

    public static final Target ACCEPT_COOKIES = Target
            .the("Select the button to Sign in")
            .located(By.id("onetrust-accept-btn-handler"));
    public static final Target CLICK_PASSENGERS_BUTTON = Target
            .the("Select the button to Sign in")
            .located(By.id("input-text_sf-passenger"));
    public static final Target CHECK_PSNGER_SCREEN = Target
            .the("Check that passengers screen appeared")
            .located(By.xpath("//li[1]//h3[@class='v7-passenger__title || v7-main-title v7-main-title--md']"));
    public static final Target CLICK_ADULT_PLUS_BUTTON = Target
            .the("Add one adult passenger")
            .located(By.xpath("//li[1]//span[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer']"));
    public static final Target CLICK_ADULT_MINUS_BUTTON = Target
            .the("Substract one adult passenger")
            .located(By.xpath("//li[1]//span[@class='ng-star-inserted v7-btn-circle v7-btn-circle--sm']"));
    public static final Target CLICK_CHILDREN_PLUS_BUTTON = Target
            .the("Add one adult passenger")
            .located(By.xpath("//li[2]//span[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer']"));
    public static final Target CLICK_CHILDREN_MINUS_BUTTON = Target
            .the("Substract one adult passenger")
            .located(By.xpath("//li[2]//span[@class='ng-star-inserted v7-btn-circle v7-btn-circle--sm']"));
    public static final Target CLICK_BABIES_PLUS_BUTTON = Target
            .the("Add one adult passenger")
            .located(By.xpath("//li[3]//span[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer']"));
    public static final Target CLICK_BABIES_MINUS_BUTTON = Target
            .the("Substract one adult passenger")
            .located(By.xpath("//li[3]//span[@class='ng-star-inserted v7-btn-circle v7-btn-circle--sm']"));
    public static final Target CHECK_CAN_BOOK_GROUP = Target
            .the("Check user name to validate login")
            .located(By.xpath("//span[@class='v7-rounded__text v7-rounded__text--xs']"));

}
