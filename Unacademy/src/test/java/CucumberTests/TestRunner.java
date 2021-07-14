package CucumberTests;


import org.junit.runner.RunWith;import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//feature file mapping and execution
@RunWith(Cucumber.class)
@CucumberOptions(
       features = "D:\\Wrkspcc\\testUnacademy\\Unacademy\\src\\test\\resources\\Feature\\about.feature",
       glue = {"stepdefinition"},
       dryRun = false,
       monochrome = true)

public class TestRunner {

}
