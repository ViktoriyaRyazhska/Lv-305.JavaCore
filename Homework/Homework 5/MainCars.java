import java.util.Arrays;

public class MainCars {

	public static void main(String[] args) {
		Car[] car1234 = new Car[4];
		car1234[0] = new Car("Truck", 1989, 3.6);
		car1234[1] = new Car("Coupe", 2000, 2.7);
		car1234[2] = new Car("Sedan", 1995, 2.2);
		car1234[3] = new Car("Diesel", 2009, 3.0);

		System.out.println("Not ordered " + Arrays.toString(car1234));
		Car.sortCars(car1234);
		System.out.println("Ordered by year " + Arrays.toString(car1234));

	}

}
