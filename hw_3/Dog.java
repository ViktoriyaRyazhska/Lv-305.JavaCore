package hw_3;

public class Dog {

	private String name;
	private String breed;
	private int age;

	public Dog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
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

	/// enum
	private enum breed {
		Strit, Bul, Spaniel
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// Display the name and the kind of the oldest dog

	public String toString() {
		return "Dog  " + name + " \n Breed  " + breed + " is oldest";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog x = new Dog("Bob", 9, "Strit");
		Dog y = new Dog("Stiv", 8, "Spaniel");
		Dog z = new Dog("Duke", 12, "Bul");

		// порівняння
		System.out.println("All name is difference = " + (x.equals(y) || y.equals(z)));

		// запитати про порівння . також працює x == y && y ==z та &&

		if (x.getName() != y.getName() && x.getName() != z.getName() && y.getName() != z.getName()) {
			System.out.println("All dogs have differense name");
		}

		if (x.age > y.age && x.age > z.age) {
			System.out.println("Oldest is : " + x);
		}
		if (z.age > y.age && z.age > x.age) {
			System.out.println("Oldest is : " + z);
			if (y.age > z.age && y.age > x.age) {
				System.out.println("Oldest is : " + y);
			}

		}
	}
}
