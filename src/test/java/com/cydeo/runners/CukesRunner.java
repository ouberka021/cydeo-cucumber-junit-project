package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
   features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = true,
        tags = "@loginStoreManager",
       // tags = "@admin or @student" or tag
        // tags = "@admin and @student" and tag
        // tags = "@admin and not @student" and not tag

publish = true

)

public class CukesRunner { }
