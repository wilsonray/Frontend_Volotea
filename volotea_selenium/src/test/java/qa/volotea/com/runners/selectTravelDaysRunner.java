package qa.volotea.com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/selectTravelDays.feature"
        , glue = "qa.volotea.com.stepdefinitions"
        , snippets = SnippetType.CAMELCASE)
public class selectTravelDaysRunner {
}
