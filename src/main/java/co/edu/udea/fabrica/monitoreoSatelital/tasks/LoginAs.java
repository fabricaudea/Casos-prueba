package co.edu.udea.fabrica.monitoreoSatelital.tasks;

import co.edu.udea.fabrica.monitoreoSatelital.interactions.AuthenticateInto;
import co.edu.udea.fabrica.monitoreoSatelital.models.User;
import co.edu.udea.fabrica.monitoreoSatelital.utils.FleetUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LoginAs implements Task {

	private final User user;

	public LoginAs(User user) {
		this.user = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(AuthenticateInto.fleetGuard(user));
	}

	public static LoginAs Admin() {
		return Tasks.instrumented(LoginAs.class, FleetUtil.ADMIN);
	}

	public static LoginAs Operator() {
		return Tasks.instrumented(LoginAs.class, FleetUtil.OPERADOR);
	}

}
