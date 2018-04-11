//Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.

public class Task2 {
	public static void main(String[] args) {
		int num[] = { 2, -3, 5, 5, 6, 11, 3, 7, 8, 4 };
		int sum = 0, product = 1;
		boolean neg = true;
		
		for (int i=0; i<5; i++) {
			if (num[i] <= 0) {
				 neg = false;
			}
		}
		if(neg) {
			for (int i = 0; i < 5; i++) { sum += num[i];}
			System.out.println("Sum = " + sum);

		} else {for (int i = 8; i < 10; i++) {
			if (num[i] > 0) {product = product * num[i];}}
		System.out.println("Product = " + product);

			
		}
		
}

}