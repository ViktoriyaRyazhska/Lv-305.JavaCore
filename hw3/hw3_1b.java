import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw3_1b {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Add first int: ");
		int a = Integer.parseInt(bufferedReader.readLine());

		System.out.println("Add second int: ");
		int b = Integer.parseInt(bufferedReader.readLine());

		System.out.println("Add third int: ");
		int c = Integer.parseInt(bufferedReader.readLine());

		if (a > b && a > c) {
			System.out.println(a + " is max.");
		} else {
			if (b > c) {
				System.out.println(b + " is max.");
			} else {
				System.out.println(c + " is max.");
			}
		}
		if (a < b && a < c) {
			System.out.println(a + " is min.");
		} else {
			if (b < c) {
				System.out.println(b + " is min.");
			} else {
				System.out.println(c + " is min.");
			}
		}
	}

}