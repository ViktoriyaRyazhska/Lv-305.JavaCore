package ll;

import java.util.Scanner;

public class IntegerCount {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter your numbers");
			n = sc.nextInt();
			if (n < 0) {
				n = i;
				break;
			}
				
		}
		System.out.println(n);
		sc.close();
	
		
	}
		
}
	


