package co.edu.udea.fabrica.monitoreoSatelital.models;

public class Vehicle {

	private String plate;
	private String model;
	private String capcity;
	private String status;

	public Vehicle (String plate, String model, String capacity, String status){
		this.plate = plate;
		this.model = model;
		this.capcity = capacity;
		this.status = status;
	}

	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCapcity() {
		return capcity;
	}
	public void setCapcity(String capcity) {
		this.capcity = capcity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
