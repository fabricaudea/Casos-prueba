package co.edu.udea.fabrica.monitoreoSatelital.stepdefinitions.track;

import org.openqa.selenium.WebDriver;

import co.edu.udea.fabrica.monitoreoSatelital.questions.ContentOf;
import co.edu.udea.fabrica.monitoreoSatelital.tasks.GoTo;
import co.edu.udea.fabrica.monitoreoSatelital.tasks.LoginAs;
import co.edu.udea.fabrica.monitoreoSatelital.tasks.OpenThe;
import co.edu.udea.fabrica.monitoreoSatelital.tasks.ReviewThe;
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

public class MonitoringStepDefinition {

	public final Actor user = Actor.named("operator");

	@Managed(driver = "chrome", uniqueSession = false)
	public WebDriver theDriver;

	@Before
	public void config() {
		user.can(BrowseTheWeb.with(theDriver));
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled("operator");
	}

	@Given("I am logged into fleetguard as an operator")
	public void iAmLoggedIntoFleetguardAsAnOperator() {
		user.attemptsTo(OpenThe.fleetGuardPage(new FleetPage()), LoginAs.Operator());
	}


	// view all vehicles position
	@When("I go to the fleet map")
	public void iGoToTheFleetMap() {
		FleetUtil.waitTime();
		user.attemptsTo(GoTo.fleetMap());
		FleetUtil.waitTime();
	}

	@Then("I can see all vehicles position on the map")
	public void iCanSeeAllVehiclesPositionOnTheMap() {
		FleetUtil.waitTime();
		GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ContentOf.title(), Matchers.containsString("Monitoreo")));
	}


	// review information about a vehicle
	@Given("I view the fleet map")
	public void iViewTheFleetMap() {
		user.attemptsTo(GoTo.fleetMap());
		FleetUtil.waitTime();
	}

	@When("I select a specific vehicle")
	public void iSelectASpecificVehicle() {
		user.attemptsTo(ReviewThe.vehicle());
		FleetUtil.waitTime();
	}

	@Then("I can see it's information")
	public void iCanSeeItSInformation() {
		GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ContentOf.plate(), Matchers.containsString(FleetUtil.DEFAULT_VEHICLE.getPlate())));
	}

	// see position history of a vehicle
	@When("I go to the fleet history")
	public void iGoToTheFleetHistory() {
		user.attemptsTo(GoTo.fleetHistory());
		FleetUtil.waitTime();
	}

	@When("I select the history of a vehicle")
	public void iSelectTheHistoryOfAVehicle() {
		user.attemptsTo(ReviewThe.vehicle());
		FleetUtil.waitTime();
	}

	@Then("I can see it's positions history")
	public void iCanSeeItSPositionsHistory() {
		GivenWhenThen.then(user).should(GivenWhenThen.seeThat(ContentOf.historyTableTitle(), Matchers.containsString("Ruta")));
	}

}
