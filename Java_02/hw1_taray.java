package yurychko;

import java.util.Scanner;


public class Flower {
	 
	public static void main(String[] args ) {
		Scanner br  = new Scanner(System.in);
// Flower 
		System.out.println("Enter the radius  flower bed : ");
		double radius = br.nextDouble();
		
		double area = Math.PI *(radius * radius);
		System.out.println("Area = " + area);
			
		double perimeter = Math.PI * 2*radius;
		System.out.println("Perimeter = " + perimeter);
// input name 
		
		Scanner flow = new Scanner(System.in); 		
	       System.out.println("What is your name?"); 
	    String name = flow.next();
	   	    System.out.println("Where are you live, "+ name);
	    String adress = flow.next(); 
	    	System.out.println(name + " live in "+ adress);

// call to country
	    	Scanner call = new Scanner(System.in);
			
			System.out.println( " input money  min C1 country: " );
			int c1 = call.nextInt(); 
			System.out.println("input money per min C2  country : ");
			int c2 =call.nextInt(); 
			System.out.println("input money per min C3 country:  "); 
			int c3 = call.nextInt();
			
		 
			 
			System.out.println("how long C1 : " );
			int t1 = call.nextInt();
			System.out.println ("how long C2 : " ); 
			int t2 = call.nextInt(); 
			System.out.println ("how long C2 : " ); 
			int t3 = call.nextInt(); 
			
			
			System.out.println("C1 call = " + c1 * t1 ); 
			System.out.println("C1 call = " + c2 * t2 ); 
			System.out.println("C1 call = " + c3 * t3 ); 
			System.out.println("All calls = " + (c1 * t1 + c2 * t2 + c3 *c2)); 
		
			
	}

	   
}
		
