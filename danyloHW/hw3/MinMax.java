package ll;

public class MinMax {

	public static void main (String[] args) {
		
				
		int [] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int max = array[0], min = array[0];
        
        for (int i = 0; i<array.length; i++) {
        	if (max<array[i])
        		max = array[i];
        	if (min<array[i])
        		min = array[i];
        	
        	System.out.println("Maximum " + max);
        	System.out.println("Minimum " + min);
        	
        	
        }
        	
        		
        }
			
   
	}
	

//Solve the next tasks:
//read 3 float numbers and check: are they all belong to the range [-5,5];
//read 3 integer numbers and write max and min of them