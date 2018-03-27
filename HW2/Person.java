package HW2;

public class Person 
{
	private String name;
	private int birthYear;
	public Person() {}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
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
	public int age()
	{
		return 2018-birthYear;
	}
	public void input(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public void output() {
		System.out.println("Name: "+name+", birth year: "+birthYear+", age:"+age());
	}
	public void changeName(String name)
	{
		this.name=name;
	}
	
	
}
