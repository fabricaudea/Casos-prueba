package co.edu.udea.fabrica.monitoreoSatelital.stepdefinitions.vehicle;

import co.edu.udea.fabrica.monitoreoSatelital.questions.AtributeValueBy;
import co.edu.udea.fabrica.monitoreoSatelital.questions.IsVehiclePresentBy;
import co.edu.udea.fabrica.monitoreoSatelital.tasks.AddThe;
import co.edu.udea.fabrica.monitoreoSatelital.tasks.DeleteThe;
import co.edu.udea.fabrica.monitoreoSatelital.tasks.EditThe;
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
import org.openqa.selenium.WebDriver;

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
		user.attemptsTo(
				OpenThe.fleetGuardPage(new FleetPage()),
				LoginAs.Admin());
	}

	// view vehicles
	@When("I view the fleet")
	public void iViewTheFleet() {
		FleetUtil.waitTime(8000);
	}

	@Then("I can see all the vehicles from the fleet")
	public void iCanSeeAllTheVehiclesFromTheFleet() {
		GivenWhenThen.then(user).should(
				GivenWhenThen.seeThat(
						IsVehiclePresentBy.plate(FleetUtil.DEFAULT_VEHICLE.getPlate()),
						Matchers.is(true)));
	}

	// Add vehicle

	@When("I correctly register a new vehicle")
	public void iCorrectlyRegisterANewVehicle() {
		FleetUtil.waitTime();
		user.attemptsTo(AddThe.vehicle());
	}

	@Then("I see that the vehicle was successfully added to the fleet")
	public void iSeeThatTheVehicleWasSuccessfullyAddedToTheFleet() {
		FleetUtil.waitTime();
		GivenWhenThen.then(user).should(
				GivenWhenThen.seeThat(
						IsVehiclePresentBy.plate(FleetUtil.NEW_VEHICLE.getPlate()),
						Matchers.is(true)));
	}

	// Modify vehicle
	@When("I correctly edit a fiel of an existing vehicle")
	public void iCorrectlyEditAFielOfAnExistingVehicle() {
		FleetUtil.waitTime();
		user.attemptsTo(EditThe.vehicle());
	}

	@Then("I see that the vehicle information was successfully updated")
	public void iSeeThatTheVehicleInformationWasSuccessfullyUpdated() {
		FleetUtil.waitTime();
		GivenWhenThen.then(user).should(
				GivenWhenThen.seeThat(
						AtributeValueBy.plate(FleetUtil.DEFAULT_VEHICLE.getPlate(), "Modelo"),
						Matchers.containsString(FleetUtil.EDIT_VEHICLE.getModel())));

		GivenWhenThen.then(user).should(
				GivenWhenThen.seeThat(
						AtributeValueBy.plate(FleetUtil.DEFAULT_VEHICLE.getPlate(), "Capacidad"),
						Matchers.containsString(FleetUtil.EDIT_VEHICLE.getCapcity())));
	}

	// remove vehicle
	@When("I remove a vehicle from the fleet")
	public void iRemoveAVehicleFromTheFleet() {
		user.attemptsTo(DeleteThe.vehicle());
		FleetUtil.waitTime();
	}

	@Then("I see that the vehicle was successfully removed")
	public void iSeeThatTheVehicleWasSuccessfullyRemoved() {
		FleetUtil.waitTime();
		GivenWhenThen.then(user).should(
				GivenWhenThen.seeThat(
						IsVehiclePresentBy.plate(FleetUtil.DEFAULT_VEHICLE.getPlate()),
						Matchers.is(false)));
	}
}
