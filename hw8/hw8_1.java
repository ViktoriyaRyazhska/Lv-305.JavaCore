package hw8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw8_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter in the console sentence of five words: ");
		String strings = br.readLine();
		String[] words = strings.split(" ");
		int max = 0;
		String maxWord = null;

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > max) {
				max = words[i].length();
				maxWord = words[i];
			}
		}
		System.out.println("The longest word in the sentence is: " + maxWord + ".");
		System.out.println("The number of letters is: " + maxWord.length() + ".");

		String result = new StringBuilder(words[1]).reverse().toString();
		System.out.println("The second word in reverse order is: " + result);
	}
}
