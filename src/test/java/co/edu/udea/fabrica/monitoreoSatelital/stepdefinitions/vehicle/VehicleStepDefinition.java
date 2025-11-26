package co.edu.udea.fabrica.monitoreoSatelital.stepdefinitions.vehicle;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.edu.udea.fabrica.monitoreoSatelital.questions.IsDefaultVehicle;
import co.edu.udea.fabrica.monitoreoSatelital.questions.IsNewVehicle;
import co.edu.udea.fabrica.monitoreoSatelital.tasks.AddThe;
import co.edu.udea.fabrica.monitoreoSatelital.tasks.GoTo;
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

	// view vehicles
	@When("I view the fleet")
	public void iViewTheFleet() {
		FleetUtil.waitTime();
	}

	@Then("I can see all the vehicles from the fleet")
	public void iCanSeeAllTheVehiclesFromTheFleet() {
		GivenWhenThen.then(user).should(GivenWhenThen.seeThat(IsDefaultVehicle.present(), Matchers.containsString(FleetUtil.DEFAULT_VEHICLE.getPlate())));
	}

	// Add vehicle

	@When("I start the registration of a Vehicle")
	public void iStartTheRegistrationOfAVehicle() {
		user.attemptsTo(GoTo.registration());
		FleetUtil.waitTime();
	}

	@When("I enter the required vehicle information")
	public void iEnterTheRequiredVehicleInformation() {
		user.attemptsTo(AddThe.vehicle());
		FleetUtil.waitTime(10000);
	}

	@Then("I see that the vehicle was successfully added to the fleet")
	public void iSeeThatTheVehicleWasSuccessfullyAddedToTheFleet() {
		GivenWhenThen.then(user).should(GivenWhenThen.seeThat(IsNewVehicle.present(), Matchers.containsString(FleetUtil.NEW_VEHICLE.getPlate())));
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

}
