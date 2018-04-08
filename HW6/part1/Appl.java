package part1;

public class Appl {

	public static void main(String[] args) {
		Bird[] b = new Bird[4];
		b[0] = new Eagle("sadq", 124);
		b[1] = new Kiwi("p[tqkwp", 56);
		b[2] = new Penguin("lkfkor", 4);
		b[3] = new Swallow("ssqrtq", 14);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i].fly());
			System.out.println(b[i].toString());
		}

	}

}
