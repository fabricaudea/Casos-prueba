package co.edu.udea.fabrica.monitoreoSatelital.utils;

import co.edu.udea.fabrica.monitoreoSatelital.models.User;

public class FleetUtil {

    private final static long DEFAULT_WAITTIME = 2000;
		public final static User ADMIN = new User("admin@demo.com", "Admin123");
		public final static User OPERADOR = new User("operador@demo.com", "Operador123");

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
