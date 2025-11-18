package co.edu.udea.fabrica.monitoreoSatelital.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/track/monitoring.feature",
        glue = "co.edu.udea.fabrica.monitoreoSatelital.stepdefinitions.track",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TrackRunner {}