
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		int secondpos = 0;
		int isecondpos = 0;

		int num[] = new int[5];
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter 5 Numbers : ");
		for (int i = 0; i < 5; i++) {
			num[i] = scan.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			if (num[i] > 0) {
				secondpos++;
				if (secondpos == 2) {
					isecondpos = i;
				}

			}
		}
		System.out.println("Position of second positive number " + (isecondpos + 1));

		int num1[] = {3, 7, -3, 4, 10, 11, -7, -2, 1, 9};
		int min = num1[0];
		int jmin = 0;
		int j = 0; {
		while (j < num1.length) {
			if (num1[j] < min) {
				min = num1[j];
				jmin = j;

			}
			j++;
		}
			System.out.println("Minimum = " + min);
			System.out.println(" is in " + (jmin + 1) + " place");
		}

	}
}
