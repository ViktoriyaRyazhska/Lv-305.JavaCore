import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculate_n {
	
		System.out.println("Please enter your number");
		
			int factorial = 1;
			int n = Integer.parseInt(br.readLine());
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			System.out.println("Factorial of " + n + " is: " + factorial);
		

	}
}
