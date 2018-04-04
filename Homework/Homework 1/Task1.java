package com.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter radius of your flower bad");
		double rad = Double.parseDouble(br.readLine());
		System.out.println("Perimeter = 2 · Ï · R" + rad * 2 * 3.14);
		System.out.println("Area = Ï r2" + 3.14 * (rad * rad));

	}

}
