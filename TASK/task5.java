import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5 {
	
	int calcFactorial ()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of factorial ");
		int n = Integer.parseInt(br.readLine());
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	public static void main(String[] args) {
	}
	}

