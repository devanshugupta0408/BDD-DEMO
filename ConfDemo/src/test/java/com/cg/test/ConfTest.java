package com.cg.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format= {"pretty","html:target/reports"},
		features= {"feature"},
		glue= {"com.cg.stepdef"},
		tags= {"@execute"}
	)  
public class ConfTest {

}
