package co.edu.udea.fabrica.monitoreoSatelital.tasks;

import co.edu.udea.fabrica.monitoreoSatelital.interactions.ConfirmDeleteWith;
import co.edu.udea.fabrica.monitoreoSatelital.utils.FleetUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class DeleteThe implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            ConfirmDeleteWith.plate(FleetUtil.DEFAULT_VEHICLE.getPlate())
        );
    }

    public static DeleteThe vehicle() {
        return Tasks.instrumented(DeleteThe.class);
    }
}
