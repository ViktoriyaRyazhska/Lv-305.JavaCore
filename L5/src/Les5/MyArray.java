package Les5;


public class MyArray {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub // // int num = 0; // while (num <= 5) {
		 * // System.out.println(number); // number++; // } // //for (i = 0; i<= 5; i++)
		 * {System.out.print(num); //}
		 * 
		 * //Scanner sc = new Scanner(System.in); //int n = 0; //for (int i = 0; i < 5;
		 * i++) { // System.out.println("Input number"); // n =
		 * Integer.parseInt(sc.nextLine()); // if (n < 0){ // n = i; // break; // } //}
		 * //System.out.println(n); //sc.close(); // // Scanner sc = new
		 * Scanner(System.in); // int sum = 0; // int n; // for (int i = 0; i < 5; i++)
		 * { // System.out.println("Input number"); // n =
		 * Integer.parseInt(sc.nextLine()); // if (n < 0){ // n = i; // continue; // }
		 * // sum += n; // } // System.out.println(sum); // sc.close();
		 */

		// 1
		int[] temper = { -10, 20, -5, 17, -3, 5, -7, 11, 9, 13 };
		int max = temper[0];
		int imax = 0;
		int i = 0;
		while (i < temper.length) {
			if (temper[i] > max) {
				max = temper[i];
				imax = i;
			}
			i++;
		}
		System.out.print("Maximum = " + max);
		System.out.println(" is in " + (imax + 1) + " place");

		// 2
		int sum = 0;
		for (i = 0; i < temper.length; i++) {
			if (temper[i] > 0) {
				sum += temper[i];
			}
		}
		System.out.println("Sum of positive= " + sum);

		// 3
		int ineg = 0;
		i = 0;
		System.out.print("Mounts of negatives are ");
		while (i < temper.length) {
			if (temper[i] < 0) {
				ineg = i;
				System.out.print(ineg + ", ");
			}
			i++;
		}

		System.out.println();
		// 4
		i = 0;
		int neg = 0;
		int pos = 0;
		int zer = 0;
		while (i < temper.length) {
			if (temper[i] == 0) {
				zer++;
			} else {
				if (temper[i] > 0) {
					pos++;
				} else {
					neg++;
				}
			}
			i++;
		}
		System.out.print("Count pos is " + pos + " Count neg is " + neg + " Count 0 is " + zer);

		
	}
}
