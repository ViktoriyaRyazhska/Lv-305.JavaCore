package l9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiveWords {

	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
		System.out.println("enter 5 words");
		String s = bf.readLine();
		String [] word = s.split(" ");
		String str = " ";
		for (int i = 0; i<word.length; i++) {
			if (word[i].length()>=str.length()) {
				str = word[i];
			}
		}
		System.out.println(str);
		System.out.println(str.length());
		
		StringBuilder buffer = new StringBuilder(word [1]);
		buffer.reverse();
		System.out.println(buffer);
	}

}
