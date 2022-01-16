package org.coding;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//resources//feature",
		glue="org.coding",
		tags={"@accountcreation"},
		monochrome=true,
		dryRun=true,
		plugin={"html:target","json:target/reports.json"}		
		)

public class TestRunner {

}
