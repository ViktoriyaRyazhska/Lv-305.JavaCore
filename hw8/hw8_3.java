package hw8_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw8_3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first symbol <$>, and the number is in the format <$123.45>: ");

		String str1 = br.readLine();
		Pattern p1 = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		Matcher m1 = p1.matcher(str1);

		if (m1.matches()) {
			System.out.println("Your currensy is US dolar!");
			m1.reset();
			} 
		else {
			System.out.println("This is NOT US currency");
		}
	}
}
