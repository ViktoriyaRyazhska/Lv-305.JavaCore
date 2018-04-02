package ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Month {

	public static void main(String[] args) throws IOException {
		
		//int month [] = {31, 28, 31, 30, 31, 30, 
			//	31, 31, 30, 31, 30, 31};
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//ArrayList<Integer> month = new ArrayList<Integer>();
		
		List<Integer> month = new ArrayList<>();
		Collections.addAll(month, 31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31);
		System.out.println("Set month number");
		System.out.print(month.get(Integer.parseInt(reader.readLine()) -1));
		System.out.println(" days");

	}

}
