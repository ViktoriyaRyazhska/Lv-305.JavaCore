//Enter in the console sentence of five words. 
//display the longest word in the sentence
//determine the number of its letters
//bring the second word in reverse order



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter sentence of five words");

		String[] string = br.readLine().split(" ");
		String rts = " ";
		for (int i = 0; i < string.length; i++) {
			if (string[i].length() > rts.length()) {
				rts = string[i];
			}
		}
		
		StringBuilder sb = new StringBuilder(string[1]);
		
		
		System.out.println("The longest word is: " + rts);
		System.out.println("Number of characters of the longest word is: " + rts.length());
		System.out.println("Second word is reversed :) " + sb.reverse());

		
		
		
	}

}
