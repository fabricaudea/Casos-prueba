package co.edu.udea.fabrica.monitoreoSatelital.questions;

import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TheUserRole implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).find(FleetPage.ROLE_TEXT).getText();
	}

	public static TheUserRole displayed(){
		return new TheUserRole();
	}
}