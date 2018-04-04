import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Person person1 = new Person("West", 1989);
		Person person2 = new Person("Trest", 1988);
		Person person3 = new Person("Wrest", 1987);
		Person person4 = new Person("Krest", 1986);
		Person person5 = new Person();

		System.out.println(person1);
		System.out.println(person1.age() + " years");
		person1.changeName("Hert");
		System.out.println(person1);
		System.out.println();
		
		System.out.println(person2);
		System.out.println(person2.age() + " years");
		person2.changeName("Mert");
		System.out.println(person2);
		System.out.println();
		
		System.out.println(person3);
		System.out.println(person3.age() + " years");
		person3.changeName("Nert");
		System.out.println(person3);
		System.out.println();
		
		System.out.println(person4);
		System.out.println(person4.age() + " years");
		person4.changeName("Lert");
		System.out.println(person4);
		System.out.println();
		
		person5.input();
		person5.output();
	}

}
