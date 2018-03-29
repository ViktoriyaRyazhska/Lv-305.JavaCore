package par1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import part2.Dog;

public class P1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
//		1)
		float a,b,c;
		a = Float.parseFloat(br.readLine());
		b = Float.parseFloat(br.readLine());
		c = Float.parseFloat(br.readLine());
		if(a<=5.0 && a>=-5.0 && b<=5.0 && b>=-5.0 && c<=5.0 && c>=-5.0 ) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
//		2)
		int d,e,f;
		d = Integer.parseInt(br.readLine());
		e = Integer.parseInt(br.readLine());
		f = Integer.parseInt(br.readLine());
		int max = 0, min = 0;
		if(d>e && d>f) {
			max = d;
		}
		else if(e>d && e>f) {
			max = e;
		}
		else if(f>d && f>e) {
			max = f;
		}
		System.out.println("max = " + max);
		if(d<e && d<f) {
			min = d;
		}
		else if(e<d && e<f) {
			min = e;
		}
		else if(f<e && f<d) {
			min = f;
		}
		System.out.println("min = " + min);
		
		
//		3)
		int httpnum;
		HTTPError er = null;
		httpnum = Integer.parseInt(br.readLine());
		switch (httpnum) {
		case 400 :
			er = HTTPError.badRequest;
			System.out.println(er);
			break;
		case 401 :
			er = HTTPError.Unauthorized;
			System.out.println(er);
			break;
		case 402 : 
			er = HTTPError.paymentRequired;
			System.out.println(er);
			break;
		case 404 : 
			er = HTTPError.notFound;
			System.out.println(er);
			break;
		default : 
			System.out.println("Unknown error");
		}	
		
		Dog dog1 = new Dog("Brovko","layka", 13);
		Dog dog2 = new Dog("Brovko","bulldog", 7);
		Dog dog3 = new Dog("Groysman","boxer", 3);
		
		if(dog1.getName() != dog2.getName() && dog1.getName() != dog3.getName() && dog2.getName() != dog3.getName()) {
			System.out.println("here is no two dogs with the same name");
		}
		else if (dog1.getName() == dog2.getName()) {
			System.out.println("First dog's and second dog's name is " + dog1.getName());
		}
		else if (dog1.getName() == dog3.getName()) {
			System.out.println("First dog's and third dog's name is " + dog1.getName());
		}
		else if (dog2.getName() == dog3.getName()) {
			System.out.println("First dog's and second dog's name is " + dog3.getName());
		}
		else {
			System.out.println("All dogs have the same name " + dog1.getName());
		}
		
		if(dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			dog1.printOn();
		}
		else if(dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
			dog2.printOn();
		}
		else if(dog3.getAge() > dog2.getAge() && dog3.getAge() > dog1.getAge()) {
			dog3.printOn();
		}
	}
}
