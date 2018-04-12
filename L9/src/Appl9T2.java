
public class Appl9T2 {

	public static void main(String[] args) {
		   try {
		      Plants pl = new Plants("rose", "blue", 5);
		      System.out.println(pl);
		   } catch (ColorException | TypeException e) {
		      System.err.println(e.getMessage() + "\n");
		      //e.printStackTrace();
		   }
		   
		   
		  
		}

}
