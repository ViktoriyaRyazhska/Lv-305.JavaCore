import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ht1_2 {

	
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
	new InputStreamReader(System.in));

    	System.out.println("Як Вас звати");
    	String name = br.readLine();

    	System.out.println("В якому місті Ви проживаєте " + name);
    	String adressSity = br.readLine();

    	System.out.println("На якій вулиці Ви проживаєте");
    	String adressStreet = br.readLine();

    	System.out.print("Вас звати " + name + ", ");  
    	System.out.print("Ви живете у місті " + adressSity + ", ");
    	System.out.print("на вулиці " + adressStreet + ".");
  }
}