package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		int month_days[ ]  = {31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31} ;
		int month=Integer.parseInt(br.readLine());
		System.out.println("Amount of days in this month:"+month_days[month-1]);
		
		

	}

}
