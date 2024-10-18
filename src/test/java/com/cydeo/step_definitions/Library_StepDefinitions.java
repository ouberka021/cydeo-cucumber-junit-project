package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {

    @Given("user is on the login page of the library application")
    public void user_is_on_the_login_page_of_the_library_application() {
        System.out.println("user is on the login page of the library application");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enter library username");
    }
    @When("user enters correct password")
    public void user_enters_correct_password() {
        System.out.println("user enter library password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user sees the dashboard");
    }



}
