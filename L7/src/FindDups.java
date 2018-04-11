import java.util.Arrays;
import java.util.Random;

public class FindDups {
	public static void main(String[] args) {
		int[] x = new int[10];
		
		Random rand = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = rand.nextInt(10);
			System.out.print(x[i] + " ");
		}
		System.out.println();
		Arrays.sort(x);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

}
