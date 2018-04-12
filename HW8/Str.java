import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
//		1)
		System.out.println("Input five words: ");
		String[] str = br.readLine().split(" ");
		if(str.length == 5) {
			String max = str[0];
			int i = 0;
			while (i < str.length) {
				if (str[i].length() > max.length()) {
					max = str[i];
				}
				i++;
			}
			System.out.println(max);
			System.out.println(max.length());
			StringBuilder rev = new StringBuilder(str[1]);
			System.out.println(rev.reverse());
			
		}
//     		2)	
		String tabStr = "I    am      learning     Java   Core";
		System.out.println(tabStr.replaceAll(" {2,}"," "));
//		3)
		String dig = "$21425.4242";
		String pat = "\\$(\\d*)(\\.\\d{2})";
		Pattern p1 = Pattern.compile(pat);
		Matcher m1 = p1.matcher(dig);
		while(m1.find()) {
			System.out.print(dig.substring(m1.start(), m1.end()));
		}
		

	}

}
