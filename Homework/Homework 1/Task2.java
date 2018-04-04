package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(
	    		new InputStreamReader(System.in));

	    	System.out.println("What is your name?");
	    	String name = br.readLine();
	    	System.out.println("Where are you live, "+ name);
	    	String adress = br.readLine();

	    	System.out.println("Hello " + name);  
	    	System.out.println("You live in " + adress);


	}

}
