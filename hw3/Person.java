 import java.util.Scanner;

@SuppressWarnings("unused")
public class Person {
		// input private fields 
	private int birthYear; 
	private String name ;
	/**
	 * @return the birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}
	/**
	 * @param birthYear the birthYear to set
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	// empty constructor 
		 public Person() {}
		
	/**
	 * @param birthYear
	 * @param name
	 */
	public Person(int birthYear, String name) {
		
		this.birthYear = birthYear;
		this.name = name;
	}
	public int age ; 
	public int age() {
		age = 2018 - birthYear; 
		return age;
	}
	 public void input() {
		 ///name
		 
	 Scanner cs = new Scanner(System.in); 
	 System.out.println(" What is you name: "); 
	 name = cs.nextLine();
	 // year
	 
	 System.out.println("what is your birth Year: ");
	 birthYear = cs.nextInt();
	 
	 
	 }
	 public void output() {
		System.out.println("Hello " + name + " year is  " + age());
	 }
	  // change Name 
	 
	    public void changeName() {
		Scanner cs = new Scanner(System.in); 
		
		System.out.println("input new name :  " ); 
		this.name = cs.next();
		
		
	
}
}
	