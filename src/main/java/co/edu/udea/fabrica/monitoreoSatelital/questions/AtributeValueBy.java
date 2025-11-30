package co.edu.udea.fabrica.monitoreoSatelital.questions;

import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class AtributeValueBy implements Question<String> {

	private String plate;
	private String atribute;

	public AtributeValueBy(String plate, String atribute){
		this.plate = plate;
		this.atribute = atribute;
	}

	@Override
	public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).find(FleetPage.ATRIBUTE_BY_PLATE.of(plate, atribute)).getText();
	}

	public static AtributeValueBy plate(String plate, String atribute){
		return new AtributeValueBy(plate, atribute);
	}

	
}
