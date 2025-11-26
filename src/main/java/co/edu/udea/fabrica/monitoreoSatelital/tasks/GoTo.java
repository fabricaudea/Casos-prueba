package co.edu.udea.fabrica.monitoreoSatelital.tasks;

import co.edu.udea.fabrica.monitoreoSatelital.interactions.ClickOn;
import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GoTo implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(ClickOn.the(FleetPage.ADD_VEHICLE_BOTTOM));
	}

	public static GoTo registration(){
		return Tasks.instrumented(GoTo.class);
	}

}
