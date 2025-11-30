package co.edu.udea.fabrica.monitoreoSatelital.interactions;

import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import co.edu.udea.fabrica.monitoreoSatelital.utils.FleetUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmDeleteWith implements Interaction {

	private String plate;

	public ConfirmDeleteWith (String plate){
		this.plate = plate;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		FleetUtil.waitTime();
		actor.attemptsTo(Click.on(FleetPage.DELETE_VEHICLE_BOTTOM_BY_PLATE.of(plate)));
		FleetUtil.waitTime(1000);
		actor.attemptsTo(Click.on(FleetPage.CONFIRM_DELETION_BOTTOM));
	}

	public static ConfirmDeleteWith plate(String plate){
		return Tasks.instrumented(ConfirmDeleteWith.class, plate);
	}

}
