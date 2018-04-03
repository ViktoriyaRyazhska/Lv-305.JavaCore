import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ht1_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int c1 = 2;
		int c2 = 4;
		int c3 = 8;
			
		System.out.println("Enter duration of the first call :");
		int t1 = Integer.parseInt(reader.readLine());
		int x1 = c1 * t1;
		
		System.out.println("Enter duration of the second call ");
		int t2 = Integer.parseInt(reader.readLine());
		int x2 = c2 * t2;
		
		System.out.println("Enter duration of the third call ");
		int t3 = Integer.parseInt(reader.readLine());
		int x3 = c3 * t3;

		int x4 = (x1 + x2 + x3);

		System.out.println("First call cost: " + x1 + ";");
		System.out.println("Second call cost: " + x2 + ";");
		System.out.println("Third call cost: " + x3 + ";");
		System.out.println("Total price is: " + x4 + ";");
	}
}