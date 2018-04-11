
public class Car {
	private String type;
	private int yearofprod = 0;
	private double engcap = 0;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearofprod() {
		return yearofprod;
	}

	public void setYearofprod(int yearofprod) {
		this.yearofprod = yearofprod;
	}

	public double getEngcap() {
		return engcap;
	}

	public void setEngcap(double engcap) {
		this.engcap = engcap;
	}

	public Car(String type, int yearofprod, double engcap) {
		this.type = type;
		this.yearofprod = yearofprod;
		this.engcap = engcap;
	}

	public static void sortCars(Car[] car1234) {
		Car tmp;
		for (int i = 0; i < car1234.length - 1; i++) {
			for (int j = i + 1; j < car1234.length; j++) {
				if (car1234[i].getYearofprod() < car1234[j].getYearofprod()) {
					tmp = car1234[i];
					car1234[i] = car1234[j];
					car1234[j] = tmp;
				}
			}
		}

	}

	@Override
	public String toString() {
		return type + " " + yearofprod + " " + engcap;
	}

}
