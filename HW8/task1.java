package HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String[] s;
		s=br.readLine().split(" ");
        String  long_word = s[0];
        for (int i = 1; i < s.length; i++)
        {
			if(long_word.length()<s[i].length())
			{
			    long_word=s[i];
			}
		}
        System.out.println("The longest word:"+long_word);
        System.out.println("Number of letters in the longest word: f"+long_word.length());
        StringBuilder r =new StringBuilder(s[1]);
        System.out.println(r.reverse());
				
		
			}
		
		
		
	}

