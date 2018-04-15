import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Appl {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
//		1)
		double a,b;
		System.out.println("Input two float numbers: ");
		try {
			a = Double.parseDouble(br.readLine());
			b = Double.parseDouble(br.readLine());
			System.out.println(div(a,b));
		} catch(NumberFormatException | IOException | ArithmeticException e){
			System.out.println(e.getMessage() + "\n");
		} 	
//		2)
		List<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			try {
				num.add(readNumber(1, 100));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(num.toString());
	}

	public static double div(double a, double b) {
		return a / b;
	}

	public static Integer readNumber(int start, int end) throws NumberFormatException, IOException, MyException {
		Integer a = Integer.parseInt(br.readLine());
		if (a > 1 && a < 100) {
			return a;
		}
		else {
			throw new MyException("value is out of range");
		}
	}
}
