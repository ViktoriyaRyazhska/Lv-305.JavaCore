package hw5_4;
import java.util.Scanner;
public class hw5_4 {
	public static void main(String[] args) {

		int[] array = new int[10];
		int i = 0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		for (int x: array) 
		{
			System.out.print("Enter " + (i + 1) + " element: ");
			array[i] = scan.nextInt();
			sum += array[i];
			if (array[i] < 0) 
			{
				System.out.println("Entered a negative number!!!");
				System.out.println("Sum of all positive numbers = " + (sum - array[i]) + ".");
				break;
			} else 
			{
				i++;
			}
		}
	}

}