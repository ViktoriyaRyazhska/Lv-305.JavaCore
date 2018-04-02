package hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1)
		int[] mountharr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Input number of mounth: ");
		int num;
		num = Integer.parseInt(br.readLine());
		System.out.println("this month have " + mountharr[num - 1] + " days");

		// 2)
		int[] arr = new int[10];

		for (int j = 0; j < 10; j++) {
			System.out.println("Input arr[" + (j + 1) + "] :");
			arr[j] = Integer.parseInt(br.readLine());
		}
		int product = 1;
		int sum = 0;
		boolean temp = true;
		for (int j = 0; j < 5; j++) {
			if (arr[j] <= 0) {
				temp = false;
			}
		}
		if (temp) {
			for (int j = 0; j < 5; j++) {
				sum += arr[j];
			}
		} else {
			for (int j = 5; j < 10; j++) {
				product *= arr[j];
			}
		}
		System.out.println("product = " + product);
		System.out.println("sum = " + sum);

		// 3)

		int[] arr1 = new int[5];
		for (int j = 0; j < 5; j++) {
			arr1[j] = Integer.parseInt(br.readLine());
		}

		int second = 0;
		int isec = 0;
		for (int j = 0; j < 5; j++) {
			if (arr1[j] >= 0) {
				second++;
				if (second == 2) {
					isec = j;
				}
			}
		}
		System.out.println("index of second positive = " + (isec + 1));

		int min = arr1[0];
		int jmin = 0;
		for (int j = 1; j < 5; j++) {
			if (arr1[j] < min) {
				min = arr1[j];
				jmin = j;
			}
		}
		System.out.println("minimum = " + min + " minimum position = " + (jmin + 1));

		// 4)
		int[] posArr = new int[20];
		int prod = 1;
		int i = 0;
		posArr[i] = Integer.parseInt(br.readLine());
		if (posArr[i] > 0) {

			while (posArr[i] > 0) {
				prod *= posArr[i];
				++i;
				posArr[i] = Integer.parseInt(br.readLine());
			}
			System.out.println("product = " + prod);
		} else {
			System.out.println("you entered negative number");
		}

		// 5)
		Car[] carArr = new Car[4];
		carArr[0] = new Car(2014, "sedan", 3.0);
		carArr[1] = new Car(2017, "universal", 2.0);
		carArr[2] = new Car(2003, "crossover", 5.5);
		carArr[3] = new Car(2014, "coupe", 2.7);
		System.out.println("Input year of car: ");
		int year = Integer.parseInt(br.readLine());

		for (int d = 0; d < carArr.length; d++) {
			if (carArr[d].getProductionYear() == year) {
				System.out.println(carArr[d].toString());
			}
		}
		System.out.println(" ");
		Car tmp;
		for (int d = 0; d < carArr.length - 1; d++) {
			for (int j = d + 1; j < carArr.length; j++) {
				if (carArr[d].getProductionYear() > carArr[j].getProductionYear()) {
					tmp = carArr[d];
					carArr[d] = carArr[j];
					carArr[j] = tmp;
				}
			}
		}

		for (int d = 0; d < carArr.length; d++) {
			System.out.println(carArr[d].toString());
		}

	}

}
