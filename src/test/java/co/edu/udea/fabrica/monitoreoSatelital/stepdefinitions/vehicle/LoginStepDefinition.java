package co.edu.udea.fabrica.monitoreoSatelital.stepdefinitions.vehicle;

import org.openqa.selenium.WebDriver;

import co.edu.udea.fabrica.monitoreoSatelital.questions.TheUserRole;
import co.edu.udea.fabrica.monitoreoSatelital.tasks.LoginAs;
import co.edu.udea.fabrica.monitoreoSatelital.tasks.OpenThe;
import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import co.edu.udea.fabrica.monitoreoSatelital.utils.FleetUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class LoginStepDefinition {

	public final Actor user = Actor.named("user");

	@Managed(driver = "chrome")
	public WebDriver theDriver;

	@Before
	public void config() {
		user.can(BrowseTheWeb.with(theDriver));
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled("admin");
	}

	@Given("I am on the Fleetguard login page")
	public void iAmOnTheFleetguardLoginPage() {
		user.attemptsTo(OpenThe.fleetGuardPage(new FleetPage()));
		FleetUtil.waitTime();
	}

	@When("I enter my valid administrator credentials")
	public void iEnterMyValidAdministratorCredentials() {
		user.attemptsTo(LoginAs.Admin());
		FleetUtil.waitTime(10000);
	}

	@Then("I can access the Fleetguard platform")
	public void iCanAccessTheFleetguardPlatform() {
		GivenWhenThen.then(user).should(GivenWhenThen.seeThat(TheUserRole.displayed(), Matchers.containsString("Administrador")));
	}

}
