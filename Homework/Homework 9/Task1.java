//Create method div(), which calculates the dividing of two double numbers. 
//In main method input 2 double numbers and call this method. Catch all exceptions. 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Div {
	public static double div(double a, double b) throws IOException, ArithmeticException, NumberFormatException {
		if (b == 0)
			throw new ArithmeticException();
		return a / b;
	}
}

public class Task1 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please enter two numbers");

		try {
			double a = Double.parseDouble(bf.readLine());
			double b = Double.parseDouble(bf.readLine());

			double d = Div.div(a, b);
			System.out.println(d);
		} catch (ArithmeticException e) {
			System.out.println("Dividing by zero");
		} catch (NumberFormatException e) {
			System.out.println("Wrong format of entered numbers");
		} catch (IOException e) {
			System.out.println("Try later");
		} finally {
			System.out.println("It's all gonna be alright");
		}

	}
}
