package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "step",
//        plugin = "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        tags = "@Test"
)
public class runAll {

}
