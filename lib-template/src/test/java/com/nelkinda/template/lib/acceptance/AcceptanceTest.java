package com.nelkinda.template.lib.acceptance; // TODO change

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "../features",
        tags = "not(@wip) and not(@future)",
        glue = "com.nelkinda.template.lib.acceptance"
)
@RunWith(io.cucumber.junit.Cucumber.class)
public class AcceptanceTest {
}
