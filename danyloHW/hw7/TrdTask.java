package l9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrdTask {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       
		System.out.println("set price $ x.xx");
		String pattern = "\\$(\\d+)(\\.(\\d{2}))";
		String text = bf.readLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		while (m.find()) {
			System.out.println(text.substring(m.start(), m.end()));
		}
	}

}
//Implement a pattern for US currency: the first symbol "$", 
//then any number of digits, dot and two digits after the dot. 
//Enter the text from the console that contains several occurrences of 
//US currency. Display all occurrences on the screen.

//String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w+";
//String text = "my.mail @ua.ua";
