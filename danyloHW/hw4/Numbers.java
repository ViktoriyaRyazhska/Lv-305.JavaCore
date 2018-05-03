package ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Numbers {

	public static void main(String[] args) throws IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Integer> list = new ArrayList<>();
	System.out.println("Set 5 numbers");
	  for (int i = 0; i < 5; i++) {
		  list.add(Integer.parseInt(reader.readLine()));
		  
	  }
	  int secondNum = -1;
	  for (int i =0; i<list.size(); i++) {
		  if (list.get(i)>=0) secondNum++;
		  if (secondNum == 1) {
			  System.out.print("Position of second positive num :");
			  System.out.println(i + 1);
			  break;
		  }
	  }
	    
		int min = Integer.MAX_VALUE;
		int imin = 0;
		for (int i = 0; i<list.size(); i++) {
			if (list.get(i)<min) {
				min = list.get(i);
				imin = i;
				continue;
			}
			System.out.println("Minimum value" + min);
			System.out.println("Position" + (imin + 1));
			
		}
			}
		
		
	}	


/* Enter 5 integer numbers. Find 
 *
position of second positive number;
minimum and its position in the array.
 */