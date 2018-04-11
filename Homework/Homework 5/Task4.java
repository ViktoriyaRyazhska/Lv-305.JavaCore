import java.util.Scanner;

//Organize entering integers until the first negative number. Count the product of all entered even numbers.

public class Task4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num[] = new int[10];
		int prod = 1;

		for (int i = 0; i < 10; i++) {
			System.out.println("Input number(max 10 numbers)");
			num[i] = scan.nextInt();

			if (num[i] > 0) {
				if (num[i] % 2 == 0) {
					prod = prod * num[i];
				}
			}

			if (num[i] < 0) {
				System.out.println("You entered negative number");
				System.out.println("Product of your entered even numbers is " + prod);
				break;
			}
		}
	}

}
