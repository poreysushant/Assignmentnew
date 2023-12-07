package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\applicationtest\\search.feature"},
		
		glue= {"steps"},
		
		plugin= {"pretty"}
		
		)


public class SearchRunner extends AbstractTestNGCucumberTests
{

}
