package com.pack.POMTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"feature"},
		glue= {"com.cg.step"},
		tags= {"@execute"}
	)  

public class LoginTest {}
