//Enter a sentence that contains the words between more than one space. 
//Convert all spaces, consecutive, one.
//For example, if we introduce the sentence 
//"I    am      learning     Java   Core», we have to get the "I'm learning Java Core»


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task2 {

	public static void main(String[] args) {
		 String string = "I    am      learning     Java   Core";
	        Pattern pattern = Pattern.compile("\\s{2,}");
	        Matcher matcher = pattern.matcher(string);
	        String string2 = matcher.replaceAll(" ");
	        System.out.println(string + ",   will become:   " + string2);
	        

	}

}
