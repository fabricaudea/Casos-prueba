package co.edu.udea.fabrica.monitoreoSatelital.tasks;

import co.edu.udea.fabrica.monitoreoSatelital.interactions.ModifyBy;
import co.edu.udea.fabrica.monitoreoSatelital.utils.FleetUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EditThe implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(ModifyBy.plate(FleetUtil.DEFAULT_VEHICLE.getPlate(), FleetUtil.EDIT_VEHICLE));
	}

	public static EditThe vehicle(){
		return Tasks.instrumented(EditThe.class);
	}

}
