package co.edu.udea.fabrica.monitoreoSatelital.userinterfaces;

import co.edu.udea.fabrica.monitoreoSatelital.utils.FleetUtil;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FleetPage extends PageObject {
	public static final Target INPUT_USERNAME = Target.the("Text box for username").locatedBy("//*[@id=':r0:-form-item']");
	public static final Target INPUT_PASSWORD = Target.the("Text box for password").locatedBy("//*[@id=':r1:-form-item']");
	public static final Target INPUT_PLATE = Target.the("Text box for vehicle's plate").locatedBy("//input[@placeholder='Ej. ABC123']");
	public static final Target INPUT_MODEL = Target.the("Text box for vehicle's model").locatedBy("//input[@placeholder='Ej. Toyota Coaster']");
	public static final Target INPUT_CAPACITY = Target.the("Text box for vehicle's capacity").locatedBy("//input[@placeholder='Ej. 32']");
	public static final Target LOGIN_BOTTOM = Target.the("Bottom to attemp logining").locatedBy("/html/body/div/div/div[2]/div[2]/form/button");
	public static final Target ADD_VEHICLE_BOTTOM = Target.the("Bottom to attemp adding a vehicle").locatedBy("/html/body/div/div/main/div/div[1]/div[2]/button");
	public static final Target CONFRIM_VEHICLE_CREATION_BOTTOM = Target.the("Bottom to attemp creating a vehicle").locatedBy("//button[contains(., 'Dar de Alta')]");
	public static final Target ROLE_TEXT = Target.the("Span that indicates the role of the current user").locatedBy("/html/body/div/div/header/div/div/div[2]/span[1]");
	public static final Target DEFAULT_ENTRY = Target.the("Row of a default the table of vehicles").locatedBy("//table//tbody//tr[td[1][contains(., '"+FleetUtil.DEFAULT_VEHICLE.getPlate()+"')]]");
	public static final Target NEW_ENTRY = Target.the("Row of a new table of vehicles").locatedBy("//table//tbody//tr[td[1][contains(., '"+FleetUtil.NEW_VEHICLE.getPlate()+"')]]");
}