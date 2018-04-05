public class main {

	public static void main(final String[] args) {
		bird bird[] = new bird[4];

		bird[0] = new eagle("Jack", "lay aggs");
		bird[3] = new swallow("Star", "lay aggs");
		bird[1] = new penguin("Dancer", "lay aggs");
		bird[2] = new chicken("Arty", "does not lay eggs");

		for (int i = 0; i < bird.length; i++) {
			System.out.println((bird[i].toString()+ bird[i].fly()) + ".");
		}
	}
}