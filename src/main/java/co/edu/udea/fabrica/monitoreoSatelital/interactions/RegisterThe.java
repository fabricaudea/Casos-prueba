package co.edu.udea.fabrica.monitoreoSatelital.interactions;

import co.edu.udea.fabrica.monitoreoSatelital.models.Vehicle;
import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import co.edu.udea.fabrica.monitoreoSatelital.utils.FleetUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterThe implements Interaction {

	private Vehicle vehicle;

	public RegisterThe (Vehicle vehicle){
		this.vehicle = vehicle;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(vehicle.getPlate()).into(FleetPage.INPUT_PLATE));
		FleetUtil.waitTime(1000);
		actor.attemptsTo(Enter.theValue(vehicle.getModel()).into(FleetPage.INPUT_MODEL));
		FleetUtil.waitTime(1000);
		actor.attemptsTo(Enter.theValue(vehicle.getCapcity()).into(FleetPage.INPUT_CAPACITY));
		FleetUtil.waitTime(1000);
		actor.attemptsTo(Click.on(FleetPage.CONFRIM_VEHICLE_CREATION_BOTTOM));
	}

	public static RegisterThe vehicle (Vehicle vehicle){
		return Tasks.instrumented(RegisterThe.class, vehicle);
	}

}
