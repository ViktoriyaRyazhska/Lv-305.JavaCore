package hm4;

public class integers2 {

	public static void main(String[] args) {
		int[] arr = {2, -5, 7, -4, 8};
		int pos = arr[0];
		int ipos = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] > 0) {
				i++;
				pos = arr[i];
				ipos = i;
			}
			i++;
		}
		System.out.print("Second positiv number  = " + pos);
		System.out.println(" is in " + (ipos + 1) + " place");


	}

}
