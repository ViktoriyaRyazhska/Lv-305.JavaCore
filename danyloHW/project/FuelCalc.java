package l777;

import java.io.IOException;
import java.util.Scanner;

public class FuelCalc extends Main {
	void calc() throws ArithmeticException, IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("--- Stage 1 Fuel Fare Calculator ---");

		System.out.println("Enter distance km");
		double distance = sc.nextDouble();

		System.out.println("Enter fuel consuption l/100 km");
		double fuelConsumption = sc.nextDouble();

		System.out.println("Enter price of fuel");
		double fuelPrice = sc.nextDouble();

		double fare = (((fuelConsumption * distance) / 100) * fuelPrice);
		System.out.println(" --- Fuel fare simulator --- ");
		System.out.println("distance " + distance + " km with fuel consuption " + fuelConsumption + " l/100km");
		System.out.println("will cost: " + fare + " UAH");

	}
}
