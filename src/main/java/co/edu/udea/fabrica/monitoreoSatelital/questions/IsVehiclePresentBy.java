package co.edu.udea.fabrica.monitoreoSatelital.questions;

import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class IsVehiclePresentBy implements Question<Boolean> {

	private String plate;

	public IsVehiclePresentBy(String plate){
		this.plate = plate;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return !BrowseTheWeb.as(actor).findAll(FleetPage.ROW_BY_PLATE.of(plate)).isEmpty();
	}

	public static IsVehiclePresentBy plate(String plate){
		return new IsVehiclePresentBy(plate);
	}
}