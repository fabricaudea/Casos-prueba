package co.edu.udea.fabrica.monitoreoSatelital.stepdefinitions.vehicle;

import org.openqa.selenium.WebDriver;

import co.edu.udea.fabrica.monitoreoSatelital.tasks.LoginAs;
import co.edu.udea.fabrica.monitoreoSatelital.tasks.OpenThe;
import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class VehicleStepDefinition {
	public final Actor user = Actor.named("admin");

	@Managed(driver = "chrome", uniqueSession = false)
	public WebDriver theDriver;

	@Before
	public void config() {
		user.can(BrowseTheWeb.with(theDriver));
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled("admin");
	}

	@Given("I am logged into Fleetguard as an administrator")
	public void iAmLoggedIntoFleetguardAsAnAdministrator() {
		user.attemptsTo(OpenThe.fleetGuardPage(new FleetPage()), LoginAs.Admin());
	}

	// Add vehicle

	@When("I start the registration of a Vehicle")
	public void iStartTheRegistrationOfAVehicle() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I enter the required vehicle information")
	public void iEnterTheRequiredVehicleInformation() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I see that the vehicle was successfully added to the fleet")
	public void iSeeThatTheVehicleWasSuccessfullyAddedToTheFleet() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	// Modify vehicle
	@When("I start modifying a vehicle from the fleet")
	public void iStartModifyingAVehicleFromTheFleet() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I update its information")
	public void iUpdateItsInformation() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I see that the vehicle information was successfully updated")
	public void iSeeThatTheVehicleInformationWasSuccessfullyUpdated() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	// remove vehicle
	@When("I remove a vehicle from the fleet")
	public void iRemoveAVehicleFromTheFleet() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I see that the vehicle was successfully removed")
	public void iSeeThatTheVehicleWasSuccessfullyRemoved() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	// view vehicles
	@When("I view the fleet")
	public void iViewTheFleet() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I can see all the vehicles from the fleet")
	public void iCanSeeAllTheVehiclesFromTheFleet() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
