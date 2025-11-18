package co.edu.udea.fabrica.monitoreoSatelital.interactions;

import co.edu.udea.fabrica.monitoreoSatelital.models.User;
import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import co.edu.udea.fabrica.monitoreoSatelital.utils.FleetUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AuthenticateInto implements Interaction {

	private final User user;

	public AuthenticateInto(User user){
		this.user = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(user.getUserName()).into(FleetPage.INPUT_USERNAME));
		actor.attemptsTo(Enter.theValue(user.getPassword()).into(FleetPage.INPUT_PASSWORD));
		FleetUtil.waitTime();
		actor.attemptsTo(Click.on(FleetPage.LOGIN_BOTTOM));
	}

	public static AuthenticateInto fleetGuard(User user){
		return Tasks.instrumented(AuthenticateInto.class, user);
	}
	
}