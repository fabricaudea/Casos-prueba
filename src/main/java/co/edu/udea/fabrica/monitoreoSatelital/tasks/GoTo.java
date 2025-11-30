package co.edu.udea.fabrica.monitoreoSatelital.tasks;

import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoTo implements Task {

	private Target target;

	public GoTo(Target target){
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Click.on(target));
	}

	public static GoTo fleetMap(){
		return Tasks.instrumented(GoTo.class, FleetPage.MONITORING_BOTTOM);
	}

	public static GoTo fleetHistory(){
		return Tasks.instrumented(GoTo.class, FleetPage.HISTORY_BOTTOM);
	}

	
}
