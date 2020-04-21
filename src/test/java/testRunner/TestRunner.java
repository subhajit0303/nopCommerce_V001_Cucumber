package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//To run all feature files - provide the path till the package only
//To run specific feature files - separate by comma - eg. {"feature file1 path","feature file2 path"}
//To run all step definition files - provide the path till the package only
//tags={"@sanity,@regression"} - denotes tags with either sanity/regression scenarios both would run (OR condition)
//tags={"@sanity","@regression"} - denotes tags with both sanity&regression scenarios both would run (AND condition)

@RunWith(Cucumber.class)
@CucumberOptions(
                features = ".//Features/",
                glue = "stepDefinitions",
                dryRun = false,
                plugin = {"pretty", "html:test-output"},
                tags={"@sanity"}
                )

public class TestRunner {
}
