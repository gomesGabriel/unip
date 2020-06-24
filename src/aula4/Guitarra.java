package aula4;

public class Guitarra {
	private String serialNumber;
	private double price;
	private String builder;
	private String model;
	private String type;
	
	public Guitarra(String serialNumber, double price, String builder, String model, String type) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
	}
	
	public String getSerialNumber() {
		return this.serialNumber;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getBuilder() {
		return this.builder;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getType() {
		return this.type;
	}
	
}
