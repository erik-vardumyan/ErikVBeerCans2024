package com.examples.cucumber.MyStepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyStepdefs {
    @Given("I have {int} beer cans")
    public void i_have_beer_cans(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
     //   throw new cucumber.api.PendingException();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);

        // Adding first comment

    }

    @Given("I have drunk {int} beer cans")
    public void i_have_drunk_beer_cans(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    //    throw new cucumber.api.PendingException();
    }

    @When("I go to my fridge")
    public void i_go_to_my_fridge() {
        // Write code here that turns the phrase above into concrete actions
    //    throw new cucumber.api.PendingException();
    }

    @Then("I should have {int} beer cans")
    public void i_should_have_beer_cans(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    //    throw new cucumber.api.PendingException();
    }

/*
     My change to run a pipeline
    change on 090122
     Second againgit add .

     Last Change 03/13/2023

 */


}
