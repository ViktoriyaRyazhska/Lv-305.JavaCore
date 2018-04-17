package l11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw2 {
	
	public int readNumber(int start, int end) throws ArithmeticException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Set integer number");
		int a = Integer.parseInt(br.readLine());
		
		if(a<start||a>end) throw new ArithmeticException();
		else
		
		return a;
	}

	public static void main(String[] args) {
		
      Hw2 h = new Hw2();
      int n;
      try {
    	  for (int i = 0; i < 10; i++) {
    		  n = h.readNumber(1, 10);
    		  System.out.println(n);
    	  }
      }
      catch (ArithmeticException e) {
    	  System.out.println("number isn't in the range");
      }
      catch (IOException e) {
    	  System.out.println("Wrong type");
      }
      catch (Exception e) {
    	  System.out.println("error");
      }
	}

}
