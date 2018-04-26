import java.util.Scanner;

public class task1 {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n0 = 1;
		int n1 = 1;
		int n2;
		System.out.println("Enter number of Fibonachi");
		int x = in.nextInt();
		System.out.println(n0+ " " +n1+ " ");
		for (int i = 0; i <= x ; i++) {
			n2 = n0 + n1;
			n0 = n1;
			n1 = n2;
			System.out.println(n2);
		}
	}
}
