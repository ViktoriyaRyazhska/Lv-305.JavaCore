import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str1 = "Loren ipsem";
		String str2 = "kjdhcgfre;lg";
		String str3 = "Loren ipsem met doloren";

		//1
		boolean res = str3.contains(str1);
		System.out.println(res);
		
		//2
		System.out.println(str3.contains(str1));

		//3
		if (str3.contains(str1)) {
			System.out.println("Contain");
		}
		boolean res2 = str3.contains(str2);
		System.out.println(res2);

		// Enter the two variables of type String. Determine whether the first variable
		// substring second.
		// For example, if you typed «IT» and «IT Academy» you must receive true.

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter surname, name and patronymic");
		String[] strings = bufferedReader.readLine().split(" ");
		String surname = strings[0];
		String name = strings[1];
		String patr = strings[2];
		System.out.println( surname + name.charAt(0) + patr.charAt(0));
		// Enter surname, name and patronymic on the console as a variable of type
		// String.
		// Output on the console:
		// surnames and initials
		// name
		// name, middle name and last name
		
//		System.out.println("Enter 5 names");System.out.println("Enter surname, name and patronymic");
//		String[] usname = bufferedReader.readLine().split(" ");
		
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String usname = bufferedReader.readLine();
		Pattern pattern = Pattern.compile("^[A-Z](\\w){2,14}");
		
		Matcher matcher = pattern.matcher(usname);
		if (matcher.matches()) {
			System.out.println(usname + " matches pattern");}
		else {System.out.println(usname + " doesn't matches pattern");}
			
            
	     
		
		
		
		// The user name can be 3 to 15 characters of the Latin alphabet, numbers, and
		// underscores.
		// Using regular expressions implement checking the user name for validity.
		// Input five names in the main method . Output a message to the console of
		// the validation of each of the entered names.

	}

	}



