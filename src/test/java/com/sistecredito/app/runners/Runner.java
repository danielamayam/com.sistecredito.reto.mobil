package com.sistecredito.app.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/nuevo_registro.feature"}
        ,tags = "@registro"
        ,glue = {"com.sistecredito.app.stepdefinitions","com.sistecredito.app.conf"}
        ,plugin = {"pretty","json:target/cucumber-reports/cucumber.json"}
        ,snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
