package co.edu.udea.fabrica.monitoreoSatelital.questions;

import co.edu.udea.fabrica.monitoreoSatelital.userinterfaces.FleetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class ContentOf implements Question<String> {

	private Target target;

	public ContentOf(Target target){
		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).find(target).getText();
	}

	public static ContentOf role(){
		return new ContentOf(FleetPage.ROLE_TEXT);
	}

	public static ContentOf title(){
		return new ContentOf(FleetPage.TITLE_TEXT);
	}
	
	public static ContentOf plate(){
		return new ContentOf(FleetPage.PLATE_TEXT);
	}

	public static ContentOf historyTableTitle(){
		return new ContentOf(FleetPage.HISTORY_TABLE_TITLE_TEXT);
	}

}
