package hw10_3;

public class hw10_3 {
	public static void main(String[] args) {

		Thread1 next = new Thread1();
		next.start();
	}
}
//OUTPUT
//1) Thraed #2
//2) Thraed #2
//3) Thraed #2
//============
//1) Thraed #3
//2) Thraed #3
//3) Thraed #3
//4) Thraed #3
//5) Thraed #3