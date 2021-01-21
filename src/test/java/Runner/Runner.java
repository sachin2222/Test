package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".\\Feature\\AddPlace.feature"
        ,glue="StepsDef_Paramertized",
        format={"pretty", "html:REPORTS/cucumber.html","json:REPORTS/cucumber.json"},
        dryRun = false

)

public class Runner {



}
