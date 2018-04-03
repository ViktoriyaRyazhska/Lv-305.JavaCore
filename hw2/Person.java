import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

class Person {
	private String name;
	private int birthYear;
	public String n;

	public Person() {
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void Age() {
		int yyyy = LocalDateTime.now().getYear() - birthYear;
		System.out.println(name + " your age is " + yyyy + " years.");
	}

	public String toString() {
		return name + ", year of birth " + birthYear + ".";
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name");
		this.name = br.readLine();
		System.out.println("Enter the year of birth");
		this.birthYear = Integer.parseInt(br.readLine());
	}
}