import java.io.IOException;

class main {

	public static void main(String[] args) throws IOException {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();

		p1.input();
		p2.input();
		p3.input();
		p4.input();
		p5.input();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);

		p1.Age();
		p2.Age();
		p3.Age();
		p4.Age();
		p5.Age();
	}
}