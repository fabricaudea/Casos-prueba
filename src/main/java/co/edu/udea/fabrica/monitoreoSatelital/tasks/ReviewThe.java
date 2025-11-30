package co.edu.udea.fabrica.monitoreoSatelital.tasks;

import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ReviewThe implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(FleetPage.MAP_PLATE_BOTTOM));
	}

	public static ReviewThe vehicle(){
		return Tasks.instrumented(ReviewThe.class);
	}
	
}
