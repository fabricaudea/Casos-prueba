package co.edu.udea.fabrica.monitoreoSatelital.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FleetPage extends PageObject {
	public static final Target INPUT_USERNAME = Target.the("Text box for username").locatedBy("//*[@id=':r0:-form-item']");
	public static final Target INPUT_PASSWORD = Target.the("Text box for password").locatedBy("//*[@id=':r1:-form-item']");
	public static final Target LOGIN_BOTTOM = Target.the("Bottom to attemp logining").locatedBy("/html/body/div/div/div[2]/div[2]/form/button");
	public static final Target ROLE_TEXT = Target.the("Span that indicates the role of the current user").locatedBy("/html/body/div/div/header/div/div/div[2]/span[1]");
}