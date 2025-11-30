package co.edu.udea.fabrica.monitoreoSatelital.interactions;

import co.edu.udea.fabrica.monitoreoSatelital.models.Vehicle;
import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import co.edu.udea.fabrica.monitoreoSatelital.utils.FleetUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ModifyBy implements Interaction {

	private String plate;
	private Vehicle vehicle;

	public ModifyBy(String plate, Vehicle vehicle){
		this.plate = plate;
		this.vehicle = vehicle;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(FleetPage.EDIT_VEHICLE_BOTTOM_BY_PLATE.of(plate)));
		FleetUtil.waitTime(1000);
		actor.attemptsTo(Enter.theValue(vehicle.getModel()).into(FleetPage.INPUT_MODEL));
		FleetUtil.waitTime(1000);
		actor.attemptsTo(Clear.field(FleetPage.INPUT_CAPACITY));
		FleetUtil.waitTime(1000);
		actor.attemptsTo(Enter.theValue(vehicle.getCapcity()).into(FleetPage.INPUT_CAPACITY));
		FleetUtil.waitTime(1000);
		actor.attemptsTo(Click.on(FleetPage.SAVE_CHANGES_BOTTOM));
	}

	public static ModifyBy plate(String plate, Vehicle vehicle){
		return Tasks.instrumented(ModifyBy.class, plate, vehicle);
	}

	
}
