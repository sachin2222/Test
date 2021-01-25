package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".\\Feature\\Delete.feature"
        ,glue="DeleteAPISteps",
        format={"pretty", "html:REPORTS/delete.html","json:REPORTS/delete.json"},
        dryRun = false,
        strict = true,
        monochrome = true

)

public class DeleteAPIRunner {
}
