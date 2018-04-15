package HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 
{

	public static void main(String[] args) throws IOException
	{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s= new String[3];
		for (int i = 0; i < s.length; i++) {
			s[i]=br.readLine();
		}
		Pattern pattern = Pattern.compile("\\$(\\d*)(\\.\\d{2})");
		for (int i = 0; i < s.length; i++) {
			    Matcher m = pattern.matcher(s[i]);
			    if(m.matches())
			    {
			    	System.out.println("Matches the entire text string");
			    }
			    else
			    	System.out.println("Error");
			    }

		

	}

}
