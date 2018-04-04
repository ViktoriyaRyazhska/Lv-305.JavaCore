package hw5;

import java.util.Scanner;

public class Birds extends Bird {

	public static void main(String[] args) {
		String Bird[]  = new String[4];
		Bird[0] = "Eagle";
		Bird[1] = "Chicken";
		Bird[2] = "Penguin";
		Bird[3] = "Swallow";
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		for (int i = 0; i < Bird.length; i++) {
			System.out.println("Input number");
			n = Integer.parseInt(sc.nextLine());
			
		if (n == 1) {
			Birds.fly();
		} else {
		} if (n == 0) {
			Birds.fly();
		} else {
		} if (n == 2) {
			Birds.fly();
		} else {
		} if (n == 3) {
			Birds.fly();
		} else {
		}
		
		}

	}

	@Override
	static
	void fly() {
		
	}

	
	}


