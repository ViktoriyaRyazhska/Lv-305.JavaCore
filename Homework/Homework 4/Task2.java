class Dog {
	private String name;
	private String breed; 
	private int age;
	public enum Breed { Collie, ChowChow, GermanShepherd 
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
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + ", " + breed + ", " + age + " years old";
	}
	
}
public class Task2 {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Chuppy", "Collie", 3);
		Dog dog2 = new Dog("Droopy", "ChowChow", 8);
		Dog dog3 = new Dog("Snoopy", "GermanShepherd", 6);
		
		if (dog1.getName() == dog2.getName()) {
			System.out.println("First and second dogs have the same name");
		}
		else if (dog1.getName() == dog3.getName()) {
			System.out.println("First and third dogs have the same name");
		}
		else if (dog2.getName() == dog3.getName()) {
			System.out.println("Second and third sogs have the same name");
		}
		else {
			System.out.println("All dogs have different names");
		}
	
		if (dog1.getAge() > dog2.getAge() & dog1.getAge() > dog2.getAge()) {
			System.out.println("The oldest dog is:");
			System.out.println(dog1);
			}
			
			else if (dog2.getAge() > dog1.getAge() & dog2.getAge() > dog3.getAge()) {
				System.out.println("The oldest dog is:");
				System.out.println(dog2);
			}
	
			else {
				System.out.println("The oldest dog is:");
				System.out.println(dog3);
			}
	}

}
