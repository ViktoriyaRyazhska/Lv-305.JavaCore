import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ht1_1 {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введіть радіус: ");
			double p = 3.14159265;
			double r = Double.parseDouble(br.readLine());
			double P = 2 * (p * r);
			double S = p * (r * r);
		System.out.println("Периметр = " + P);
		System.out.println("Площа = " + S);
	}
}
