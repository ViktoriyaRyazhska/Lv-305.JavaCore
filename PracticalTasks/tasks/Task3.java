/**
 * 
 */
import java.io.IOException;
import java.util.Scanner;

public class Task3 {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);

		System.out.println("Input USD rate");
		double usdRate = Double.parseDouble(sc.nextLine());

		System.out.println("Input UAH Sum");
		double uhySum = Double.parseDouble(sc.nextLine());

		
		int usdSum = (int) (uhySum / usdRate);

		System.out.print("You can buy " + usdSum + " USD");
		double uhyChange = uhySum - (usdSum * usdRate);

		System.out.print(" and change is " + uhyChange + " UAH");

		

		

	}
}
