package br.com.automacao.abasteceai_java_douglas.acceptancetests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"br.com.automacao.abasteceai_java_douglas"},
        features = ".",
        format = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        tags = {"@complete"}
)
public class AllTests {
}