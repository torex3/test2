package com.serene.tests.features.steps;
import com.mashape.unirest.http.exceptions.UnirestException;
import cucumber.api.java.en.Given;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.Properties;

@RunWith(SerenityRunner.class)

public class StepsDefinition_FRA {

    Properties properties = new Properties();


    @Steps

    APISteps_FRA API;

    @Given("^utworzenie$")
    public void utworzenie_p() throws IOException, UnirestException {

        API.utworzenie();

    }



}
