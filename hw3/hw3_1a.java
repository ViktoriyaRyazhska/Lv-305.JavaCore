import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class hw3_1a {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Add first num:");
		float n1 = Float.parseFloat(bufferedReader.readLine());

		System.out.println("Add second num:");
		float n2 = Float.parseFloat(bufferedReader.readLine());

		System.out.println("Add third num:");
		float n3 = Float.parseFloat(bufferedReader.readLine());

		if ((n1 <= 5 && n1 >= -5) && (n2 <= 5 && n2 >= -5) && (n3 <= 5 && n3 >= -5)) {
			System.out.println("Num: " + n1 + ", " + n2 + " and " + n3 + " - are all belong to the range [-5, 5].");
		}
		else {
			System.out.println("Num: " + n1 + ", " + n2 + " and " + n3 + " are not all belong to the range [-5, 5].");
		}
	}
}