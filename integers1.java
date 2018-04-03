package hm4;

public class integers1 {

	public static void main(String[] args) {
		int[] arr = {2, -5, 7, -4, 8};

		int min = arr[0];
		int imin = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] < min) {
				min = arr[i];
				imin = i;
			}
			i++;
		}
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " place");

		int pos = arr[0];
		int kpos = 0;
		int k = 0;
		while (k < arr.length) {
			if (arr[k] > min) {
				k++;
				pos = arr[k];
				kpos = k;
			}
			i++;
		}
		System.out.print("Second positiv number  = " + pos);
		System.out.println(" is in " + (kpos + 1) + " place");

	}

}
