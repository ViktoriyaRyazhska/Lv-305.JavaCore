package l11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw {
	
	public double div() throws IOException, ArithmeticException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input first double number");
		double a = Double.parseDouble(bf.readLine());
		System.out.println("Input second double number");
		double b = Double.parseDouble(bf.readLine());
		
		if (b == 0) throw new ArithmeticException();
		return a/b;
	}

	public static void main(String[] args) {
		
		Hw x = new Hw();
		
		try {
			double d = x.div();
			System.out.println(d);
		}
		catch (ArithmeticException e) {
			System.out.println("Error: division by zero");
		}
        catch (IOException e) {
        	System.out.println("Error: wrong type");
        }
		catch (Exception e) {
			System.out.println("Error");
		}
		finally {
			System.out.println("Don't worry)");
		}
	}

}
