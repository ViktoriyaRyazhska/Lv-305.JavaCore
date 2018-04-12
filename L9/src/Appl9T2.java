import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl9T2 {
	   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		   try {

			   System.out.println("Input color and type, size");
			   String col = reader.readLine();
			   String type = reader.readLine();
			   int n = Integer.parseInt(reader.readLine());
			   
		      Plants pl = new Plants(type, col, n);
			   
//		       String color = reader.readLine();
//		       int size = Integer.parseInt(reader.readLine());
		      System.out.println(pl);
		   } catch (ColorException | TypeException e) {
		      System.err.println(e.getMessage() + "\n");
		      //e.printStackTrace();
		   }
		   
		   
		  
		}

}
