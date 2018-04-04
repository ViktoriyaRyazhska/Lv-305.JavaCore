
public class Task1 {

	public static void main(String[] args) {
//		read 3 float numbers and check: are they all belong to the range [-5,5];
float a = -1.4f, b = 2.6f, c = 5.1f;
if (a >= -5 & a <=5 ) {
	System.out.println(a + " belong to range [-5,5]");
}
else {
	System.out.println(a + " don't belong to range [-5,5]");
}

if (b >= -5 & b<=5) {
	System.out.println(b + " belong to range [-5,5]");
}
else {
	System.out.println(b + " don't belong to range [-5,5]");
}

if (c >= -5 & c<=5) {
	System.out.println(c + " belong to range [-5,5]");
}
else {
	System.out.println(c + " don't belong to range [-5,5]");
}
	
	if (a >= -5 & a <=5 & b >= -5 & b<=5 & c >= -5 & c<=5) {
		System.out.println("All numbers belong to range [-5,5]");
	}
	else {
		System.out.println("Not all numbers belong to range [-5,5]");
	}
	}

}
