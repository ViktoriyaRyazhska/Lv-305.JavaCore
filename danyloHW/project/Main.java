package l777;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException, IOException {
		Scanner scan = new Scanner(System.in);

		FuelCalc distance = new FuelCalc();
		Taxi taxi = new Taxi();

		try {
			System.out.println("please choose programm:");
			System.out.println("1. calculation of fuel consumption");
			System.out.println("2. calculation of taxi fare");

			while (true) {
				int a = scan.nextInt();
				switch (a) {
				case 1:
					distance.calc();
					break;
				case 2:
					taxi.calculator();
					break;
				default:

					System.out.println("Please enter 1 or 2");

				}
			}

		} catch (ArithmeticException e) {
			System.out.println("Error: numbers less, or equels to zero");
		} catch (IOException e) {
			System.out.println("Error: wrong type");
		} catch (InputMismatchException e) {
			System.out.println("Error: please set only double numbers");
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		} finally {
			System.out.println("See you soon!");

		}
	}

}
