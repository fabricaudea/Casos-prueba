package co.edu.udea.fabrica.monitoreoSatelital.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/vehicle/vehicle.feature",
        glue = "co.edu.udea.fabrica.monitoreoSatelital.stepdefinitions.vehicle",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class VehicleRunner {}