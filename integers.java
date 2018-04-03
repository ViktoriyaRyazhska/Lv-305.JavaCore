package hm4;

public class integers {

	public static void main(String[] args) {
		int[] arr = { 8, -4, 6, 0, 8, -7, 7, 7, -3 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) { sum += arr[i];}
		if (sum > 0) {
			System.out.println("Sum = " + sum);
		}
		else {
			int product = 1;
			for (int i = 0; i < 5; i++) {
				if (arr[i] > 0) {product = product * arr[i];}}
			System.out.println("Product = " + product);

		}

	

}
}
