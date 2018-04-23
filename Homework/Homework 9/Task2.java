import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Write a method readNumber(int start, int end), that read from console integer number
//and return it, if it is in the range [start...end]. 
//If an invalid number or non-number text is read, the method should throw an exception. 
//Using this method write a method main(), that has to enter 10 numbers:
//	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
class Number {
	public int readNumber(int start, int end) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your number");

		int a = Integer.parseInt(br.readLine());
		if (a < start && a > end)
			throw new ArithmeticException();
		else
			return a;

	}
}

public class Task2 {

	public static void main(String[] args) {
		Number num = new Number();
		int b;

		try {
			for (int i = 0; i < 5; i++) {
				b = num.readNumber(1, 100);
				System.out.println(b);
			}
		} catch (ArithmeticException e) {
			System.out.println("You are not in the range of 1 - 100");
		} catch (NumberFormatException e) {
			System.out.println("Wrong format");
			;
		} catch (IOException e) {
			System.out.println("Try later");
		} finally {
			System.out.println("Please try again");
		}

	}

}
