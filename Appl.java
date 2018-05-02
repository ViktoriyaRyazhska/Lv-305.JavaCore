package prj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		dogs dog[] = new dogs[6];
		
		dog[0] = new AustralianKelpie();
		dog[1] = new FoxTerrier();
		dog[2] = new KerryBlueTerrier();
		dog[3] = new NorskBuhund();
		dog[4] = new OldEnglishSheepdog();
		dog[5] = new Sheltie();
		
		System.out.println("Input number:" + "\n1-Austrian Kelpie" + "\n2-Fox Terrier" + "\n3-Kerry Blue Terrier"
				+ "\n4-Norsk Buhund" + "\n5-Old English Sheepdog" + "\n6-Sheltie");
		
		int decision;
		decision = Integer.parseInt(br.readLine()) - 1;
		
		dog[decision].info();
		
		
	}

	public void info() {
		
	}
}
