package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".\\Feature\\AddPlace.feature"
        , glue = "StepsPlaceAPI",
        format = {"pretty", "html:REPORTS/cucumber.html", "json:REPORTS/cucumber.json"},
        dryRun = false,
        strict = true

)

public class PlaceAPIRunner {


}
