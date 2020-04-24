package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json",
		"html:target/html/html-report",
"junit:target/junit/junit-report"}
//tags = {"@Smoke, ~@Sanity"}
)
public class RunCukesTest {
}
