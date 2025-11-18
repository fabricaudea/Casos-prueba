package co.edu.udea.fabrica.monitoreoSatelital.stepdefinitions.track;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class MonitoringStepDefinition {

	public final Actor user = Actor.named("user");

	@Managed(driver = "chrome")
	public WebDriver theDriver;

	@Before
	public void config() {
		user.can(BrowseTheWeb.with(theDriver));
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled("admin");
	}

	// view all vehicles position
	@When("I go to the fleet map")
	public void iGoToTheFleetMap() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I can see all vehicles position on the map")
	public void iCanSeeAllVehiclesPositionOnTheMap() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}


	// review information about a vehicle
	@Given("I am logged into fleetguard as an operator")
	public void iAmLoggedIntoFleetguardAsAnOperator() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("I view the fleet map")
	public void iViewTheFleetMap() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I select a specific vehicle")
	public void iSelectASpecificVehicle() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I can see it's information")
	public void iCanSeeItSInformation() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}


	// see position history of a vehicle
	@When("I go to the fleet history")
	public void iGoToTheFleetHistory() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I select the history of a vehicle")
	public void iSelectTheHistoryOfAVehicle() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I can see it's positions history")
	public void iCanSeeItSPositionsHistory() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
