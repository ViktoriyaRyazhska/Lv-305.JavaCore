//Implement a pattern for US currency: the first symbol "$", 
//then any number of digits, dot and two digits after the dot. 
//Enter the text from the console that contains several occurrences of US currency. 
//Display all occurrences on the screen.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) throws IOException {
		System.out
				.println("Enter the text from the console that contains several occurrences of US currency($0.00000)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = new String[5];
		for (int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
		}
		for (int i = 0; i < str.length; i++) {
			Pattern pattern = Pattern.compile("\\$(\\d+)(\\.\\d{2})?");
			Matcher matcher = pattern.matcher(str[i]);
			while (matcher.find()) {
				System.out.println(str[i].substring(matcher.start(), matcher.end()));
			}
		}
	}
}