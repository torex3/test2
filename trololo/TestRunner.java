package com.serene.tests.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = {"classpath:features/jakis.Feature"},
               tags = { "@regression" }

)
public class TestRunner {
	
}
