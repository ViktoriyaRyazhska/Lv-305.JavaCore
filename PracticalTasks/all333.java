package all;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class all333 {
	public static void main(String[] args) throws IOException {
		int n0 = 1;
		int n1 = 1;
		int n2;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input number and generate Fibonacci : ");
		int count = Integer.parseInt(br.readLine());
		{

			System.out.print("Your Fibonacci series is: ");
			{
				for (int i = 0; i < count; i++) {
					n2 = n0 + n1;
					System.out.print(n2 + " ");
					n0 = n1;
					n1 = n2;
				}
				System.out.println();
			}
		}
	}
}