package hw3_1c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw3_1c {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of HTTP Error. Make your choice: 201, 404, 408:");
		
		switch (Integer.parseInt(br.readLine()))
		{
		case 201:
			System.out.println("HTTPErr201.Webpage Created: you are lucky!!!");
			break;
			
		case 404:
			System.out.println("HTTPErr404.Not found: lucky another time!!!");
			break;
			
		case 408:
			System.out.println("HTTPErr408.Request Timeout: bye, bye...");
			break;

		default:
			System.out.println("This is not an error");
			break;
		}
	}
}