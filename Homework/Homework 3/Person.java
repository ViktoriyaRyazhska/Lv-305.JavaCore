import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

import javax.jws.soap.InitParam;
import javax.print.attribute.IntegerSyntax;

public class Person {
	private static final int IntegerSyntax = 0;
	// two private fields
	private String name;
	private int birthYear;

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	// Constructors
	public Person() {

	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	// Methods
	public int age() {
		return LocalDateTime.now().getYear() - birthYear;
	}

	@Override
	public String toString() {
		return name + " " + birthYear;
	}

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter you name");
		this.name = br.readLine();
		System.out.println("Enter your birth year");
		this.birthYear = Integer.parseInt(br.readLine());
	}

	public void output() {
		System.out.println("Your name is " + name + ", You are " + age());
	}

	public void changeName(String name) {
		this.name = name;
	}
	
}
