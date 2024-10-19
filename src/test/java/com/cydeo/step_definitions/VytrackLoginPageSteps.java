package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.configurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VytrackLoginPageSteps {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(configurationReader.getProperty("vyTrackUrl"));
    }
    @When("user enters the driver information")
    public void user_enters_the_driver_information() {
        VytrackLoginPage vytrackLoginPage=new VytrackLoginPage();
        vytrackLoginPage.
                login(configurationReader.getProperty("driver_username"),
                        configurationReader.getProperty("driver_password"));

    }

    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {

        VytrackLoginPage vytrackLoginPage=new VytrackLoginPage();
        vytrackLoginPage.
                login(configurationReader.getProperty("sales_manager_username"),
                        configurationReader.getProperty("sales_manager_password"));

    }

    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {

        VytrackLoginPage vytrackLoginPage=new VytrackLoginPage();
        vytrackLoginPage.
                login(configurationReader.getProperty("store_manager_username"),
                        configurationReader.getProperty("store_manager_password"));


    }

    @When("user enters the {string} information")
    public void user_enters_the_information(String userType) {
        VytrackLoginPage vytrackLoginPage=new VytrackLoginPage();
        vytrackLoginPage.login(userType.replace(" ","_"));
    }


    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

        DashboardPage dashboardPage=new DashboardPage();

        BrowserUtils.waitForTitleContains("Dashboard");
        Assert.assertTrue(dashboardPage.userProfile.isDisplayed());
    }
    }
