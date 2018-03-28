package l4;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class Country {
	
	
	
	
	
	public static void main(String[] args) throws IOException {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter duration of the 1c :");
		double time = sc.nextDouble();
		System.out.println("Enter price :");
		double price = sc.nextDouble();
		System.out.println("Enter duration of the 2c :");
		double time2 = sc.nextDouble();
		System.out.println("Enter price :");
		double price2 = sc.nextDouble();
        System.out.println("duration of the 3c :");
        double time3 = sc.nextDouble();
        System.out.println("Enter price :");
        double price3 = sc.nextDouble();
        
        double answer = time*price;
        double answer2 = time2*price2; 
        double answer3 = time3*price3;
        double answer4 = answer + answer2 + answer3;
        
        System.out.println("1st cost :" + answer);
        System.out.println("2st cost :" + answer2);
        System.out.println("3st cost :" + answer3);
        System.out.println("Total price :" + answer4);
		
		
			
				
/*Phone calls from three different countries are ñ1, ñ2 and ñ3 standard units per minute. 
 * Talks continued t1, t2 and t3 minutes. 
 * How much computer will count for each call separately and all talk together? 
 * Input all source data from console, make calculations and output to the screen.
 * System.out.println("Enter duration of the 1c :");
		double time = sc.nextDouble();
		System.out.println("Enter price :");
		double price = sc.nextDouble();
		System.out.println("Enter duration of the 2c :");
		double time2 = sc.nextDouble();
		System.out.println("Enter price :");
		double price2 = sc.nextDouble();
//		System.out.println("duration of the 3c :"); */


	}
	
}
