package Stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/features"},
		glue={"Stepdefinition", "AppHooks"},
		dryRun= false,
		monochrome = true,
		plugin = {"pretty"
	}
		)

public class RunnerTest {

}
