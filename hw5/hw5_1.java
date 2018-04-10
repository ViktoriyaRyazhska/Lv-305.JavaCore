package hw5;
import java.util.Scanner;

public class hw5_1 {
	static int arr[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month number: ");
		int number = scan.nextInt();
		System.out.println("You input " + number + " month a year.");
		System.out.println("The numbers of days this month is: " + arr[number - 1]+".");

	}
}