package com.inportia.JavaFirstMaven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\test\\java\\cucumbertest",
		glue="stepdef",
	
		tags={"@tag"},
		monochrome=true,
		dryRun=false
		)
public class runner {
	

}
