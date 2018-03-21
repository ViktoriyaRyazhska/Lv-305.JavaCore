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
		
	    	
			
	}

	   
}
		