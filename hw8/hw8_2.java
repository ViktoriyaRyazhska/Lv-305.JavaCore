package hw8_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class hw8_2 {

	public static void main(String[] args) throws IOException { 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence: 'I am learning Java Core'");
		String sentense = br.readLine();
		System.out.println(sentense.trim().replace("I am", "I'm"));
	}	
}