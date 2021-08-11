package e2e.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = {"src/test/resources/features/"},
        plugin = {"json:reports/reports/cucumberRunner.json", "html:reports/reports/report.html", "html:reports/reports/html", "pretty"},
//        tags = ("@Tag1 or @Tag2"),
        glue = {"e2e.glue", "e2e.config"}
)
public class RunnerTest {
}
