
public class Task1b {

	public static void main(String[] args) {
		// read 3 integer numbers and write max and min of them;
		int a = -5, b = 2, c = 23;

		if (a > b & a > c)

		{
			System.out.println(a + " is Max number");
		} else if (b > a & b > c) {
			System.out.println(b + " is Max number");
		} else if (c > a & c > b) {
			System.out.println(c + " is Max number");
		}

		if (a < b & a < c)

		{
			System.out.println(a + " is Min number");
		} else if (b < a & b < c) {
			System.out.println(b + " is Min number");
		} else if (c < a & c < b) {
			System.out.println(c + " is Min number");
		}
	}
}