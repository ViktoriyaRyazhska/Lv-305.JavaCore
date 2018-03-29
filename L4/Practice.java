import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

//	int a = 5,  b = 10, c = 100;
//	if (a % 2 == 0 ) {System.out.println(a + " is odd");}
//	if (b % 2 == 0 ) {System.out.println(b + " is odd");}
//	if (c % 2 == 0 ) {System.out.println(c + " is odd");}
//	
	BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
//System.out.println("Input Number ");
//int input = Integer.parseInt(br.readLine());
//if (input % 2 == 0 ) {System.out.println(input + " is odd");} else {System.out.println(input + " is even");}
	
	
//System.out.println("Input Day Number ");
// input = Integer.parseInt(br.readLine());
//
//switch (input) {
//case 2:
//System.out.println("Your day is Monday");
//	break;
//case 3:
//	System.out.println("Your day is Tuesday");
//	break;
//case 4:
//	System.out.println("Your day is Wednesday");
//	break;
//default:
//	System.out.println("Wrong number. Keep trying.");
//}

Continent cont = Continent.Eurasia;

System.out.println("Input Country");
String count = br.readLine();


switch (count.toLowerCase()) {
case "ukraine":
	cont = Continent.Eurasia;
break;
case "usa":
	cont = Continent.Nort_America;
break;

default:
System.out.println("Wrong!");
System.exit(0);
}

System.out.println(cont);

	}
}






enum Continent {
	Eurasia, Antarctida, Nort_America, South_America
}





	
	
	 
	
	
	
	


