package part2;

public class Dog {
	private String name, breed;
	private int age;
	
	
	public Dog() {
	}
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printOn() {
		System.out.println("The oldest's dog name is " + this.name + " and breed is " + this.breed);
	}
	
	
	
	
	
	
	
}
