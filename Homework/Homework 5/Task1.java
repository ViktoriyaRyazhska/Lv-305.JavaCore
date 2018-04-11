//Ask user to enter the number of month. Read the value and write the amount of days in this month (create array with amount days of each month).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		int month_days[ ]  = {31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31} ;
System.out.println("Please enter number of your month");
int month = Integer.parseInt(br.readLine());
month--;
System.out.println("There is " + month_days[month] + " in your month");

	}

}
