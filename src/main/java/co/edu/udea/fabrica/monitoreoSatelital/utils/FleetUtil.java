package co.edu.udea.fabrica.monitoreoSatelital.utils;

import co.edu.udea.fabrica.monitoreoSatelital.models.User;
import co.edu.udea.fabrica.monitoreoSatelital.models.Vehicle;

public class FleetUtil {

    private final static long DEFAULT_WAITTIME = 2000;
		public final static User ADMIN = new User("admin@demo.com", "Admin123");
		public final static User OPERADOR = new User("operador@demo.com", "Operador123");
		public final static Vehicle DEFAULT_VEHICLE = new Vehicle("ABC123", "Chevrolet Burstón NGR", "40", "Activo");
		public final static Vehicle NEW_VEHICLE = new Vehicle("XYZ123", "toyota", "3", "Activo");
		public final static Vehicle EDIT_VEHICLE = new Vehicle("TES123", "test", "1", "Activo");

    public static void waitTime() {
        waitTime(DEFAULT_WAITTIME);
    }

    public static void waitTime(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}
