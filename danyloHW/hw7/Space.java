package l9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Space {

	public static void main(String[] args) {
		
		String pattern = "[a-zA-Z]+";
		String text = "I    am      learning     Java8   Core";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + " ");
		}

	}

}
