package ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class County {
	
	public enum Continents {
		
		Afrika, SouthAmerika, NorthAmerika, Asia, Europe;
			
	}
	
	
	static Continents continents;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your country");
		String a = br.readLine();
		System.out.println("Your continent " + a);
				
		switch (a){
		case "Nigeria": case "Egypt":
			continents = Continents.Afrika; break;
		case "Brazil": case "Argentina":
			continents = Continents.SouthAmerika; break;
		case "Usa": case "Canada":
			continents = Continents.NorthAmerika; break;
		case "Ukraine": case "Poland":
			continents = Continents.Europe; break;
		case "China": case "Japan":
			continents = Continents.Asia; break;
		default: System.out.println("wrong");
		         System.exit(0);
		         
		
			
		}
	}

}
