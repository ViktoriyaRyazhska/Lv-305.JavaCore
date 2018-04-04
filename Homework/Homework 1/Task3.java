package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(
	    		new InputStreamReader(System.in));

	    	System.out.println("Enter first country name");
	    	String name1 = br.readLine();
	    	System.out.println("How much per minute in $?");
	    	double min1 = Double.parseDouble(br.readLine());
	    	System.out.println("Call duration");
	    	double dur1 = Double.parseDouble(br.readLine());

	    	System.out.println("Enter second country name");
	    	String name2 = br.readLine();
	    	System.out.println("How much per minute in $?");
	    	double min2 = Double.parseDouble(br.readLine());
	    	System.out.println("Call duration");
	    	double dur2 = Double.parseDouble(br.readLine());
	    	
	    	System.out.println("Enter third country name");
	    	String name3 = br.readLine();
	    	System.out.println("How much per minute in $?");
	    	double min3 = Double.parseDouble(br.readLine());
	    	System.out.println("Call duration");
	    	double dur3 = Double.parseDouble(br.readLine());
	    	
	    	System.out.println("Your call cost to " + name1 + " is" + " " + min1*dur1 + "$");  
	    	System.out.println("Your call cost to " + name2 + " is" + " " + min2*dur2 + "$");
	    	System.out.println("Your call cost to " + name3 + " is" + " " + min3*dur3 + "$");
	    	System.out.println("Your total cost per calls to " + name1 + ", " + name2 + ", " + name3 + " is" + " " + ((min1*dur1)+(min2*dur2)+(min3*dur3)) + "$");
	}

}
