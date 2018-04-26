import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task3 {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);

		

		System.out.println("Input USD rate");
		double usdRate = Double.parseDouble(sc.nextLine());

		System.out.println("Input UHY Sum");
		double uhySum = Double.parseDouble(sc.nextLine());
		
//		int usdSum = Integer.parseUnsignedInt(uhySum / usdRate);
		int usdSum = (int) (uhySum / usdRate);
		
		System.out.print("You can buy " + usdSum + " USD");
		 double uhyChange = uhySum - (usdSum * usdRate);
		 
			System.out.print(" and change is " + uhyChange + " UAH");
		 
		
		//double uhyChange = %(usd)
		
		

		// 3. Input cost of dollar and sum of money in gryvna. Calculate how many
		// dollars user can buy and change.

	}
}
