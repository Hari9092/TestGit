package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)

@CucumberOptions(features="featuresFiles", 				
                    glue = {"com.stepDefinitions","com.hooks"},
                    monochrome = true,
                    dryRun = true,
                    plugin = {"html:report/html-report"},
					tags= {"@LoginDataWithoutHeader"})
public class Runner {
}
