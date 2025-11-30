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
	public static final Target CONFIRM_CREATION_BOTTOM = Target.the("Bottom to confirm the creatrion of a vehicle").locatedBy("//button[contains(., 'Dar de Alta')]");
	public static final Target SAVE_CHANGES_BOTTOM = Target.the("Bottom to save the changes made to a vehicle").locatedBy("//button[contains(., 'Guardar Cambios')]");
	public static final Target CONFIRM_DELETION_BOTTOM = Target.the("Bottom to confirm the deletion of a vehicle").locatedBy("//button[contains(., 'Dar de baja')]");
	public static final Target MAP_PLATE_BOTTOM = Target.the("Bottom of an existing vehicle inside the map").locatedBy("//button[contains(., '"+FleetUtil.DEFAULT_VEHICLE.getPlate()+"')]");
	public static final Target DELETE_VEHICLE_BOTTOM_BY_PLATE = Target.the("Bottom to delete the vehicle with the specified plate").locatedBy("//tbody//tr[.//td[contains(., '{0}')]]//button[contains(@class, 'text-red-400')]");
	public static final Target EDIT_VEHICLE_BOTTOM_BY_PLATE = Target.the("Bottom to edit the vehicle with the specified plate").locatedBy("//tbody//tr[.//td[contains(., '{0}')]]//button[contains(@class, 'text-blue-400')]");
	public static final Target MONITORING_BOTTOM = Target.the("Bottom in the dashboard for going to the monitoring page").locatedBy("/html/body/div/aside/div/div[2]/div/div/nav/button[2]");
	public static final Target HISTORY_BOTTOM = Target.the("Bottom in the dashboard for going to the history page").locatedBy("/html/body/div/aside/div/div[2]/div/div/nav/button[3]");

	public static final Target ROLE_TEXT = Target.the("Span that indicates the role of the current user").locatedBy("/html/body/div/div/header/div/div/div[2]/span[1]");
	public static final Target TITLE_TEXT = Target.the("Title that indicates the current page").locatedBy("/html/body/div/div/main/div/div[1]/div[1]/h1");
	public static final Target PLATE_TEXT = Target.the("Element that indicates the role of the plate of the vehicle selected on the map").locatedBy("/html/body/div/div/main/div/div[4]/div[2]/div/div[2]/div[1]/div[1]/p");
	public static final Target HISTORY_TABLE_TITLE_TEXT = Target.the("Title from the table of history information").locatedBy("/html/body/div/div/main/div/div[4]/div[1]/div/div[2]/div/div[2]/h4");

	public static final Target ROW_BY_PLATE = Target.the("Row of the specified plate").locatedBy("//table//tbody//tr[td[1][contains(., '{0}')]]");
	public static final Target ATRIBUTE_BY_PLATE = Target.the("Atribute on the table of the specified vehicle using the plate").locatedBy("//tbody//tr[.//td[contains(., '{0}')]]/td[count(//table//thead//th[contains(., '{1}')]/preceding-sibling::th) + 1]");
}