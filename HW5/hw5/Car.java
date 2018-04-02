package hw5;

public class Car {
	private int productionYear;
	private String type;
	private double engineCapacity;
	
	
	public Car() {}
	public Car(int productionYear, String type, double engineCapacity) {
		this.productionYear = productionYear;
		this.type = type;
		this.engineCapacity = engineCapacity;
	}
	public int getProductionYear() {
		return productionYear;
	}
	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Type of car is " + this.getType() + ", production year is " + this.getProductionYear() + ", engine capaciti " + this.getEngineCapacity();
	}
	
}
