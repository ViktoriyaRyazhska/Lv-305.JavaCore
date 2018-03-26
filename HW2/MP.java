import java.io.IOException;

public class MP {

	public static void main(String[] args) throws IOException {
		HW2 person1 = new HW2();
		person1.input();
		person1.output();
		HW2 person2 = new HW2();
		person2.input();
		person2.output();
		HW2 person3 = new HW2();
		person3.input();
		person3.output();
		HW2 person4 = new HW2();
		person4.input();
		person4.output();
		HW2 person5 = new HW2();
		person5.input();
		person5.output();
		person1.changeName("Josyp");
		person2.changeName("Bodyk");
		person3.changeName("Jack");
		person4.changeName("Dimon");
		person5.changeName("Andrew");
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();
	}

}
