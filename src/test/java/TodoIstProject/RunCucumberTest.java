package TodoIstProject;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",features = "src/test/resources/TodoIstProject"
        ,glue = {"src/test/java/TodoIstProject/StepDefinitions.java"})
public class RunCucumberTest {
}
