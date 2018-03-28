package l6;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.io.BufferedReader;

public class Person {

	private String name;
    private int birthYear;
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    
    public Person() {
}
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
	public int age () {
		
		Calendar calendar = Calendar.getInstance();
		int Year = calendar.get(Calendar.YEAR);
		int age = Year - birthYear;
		
		return age;
	} 
			
	@Override
	public String toString() {
		return name;
			
	}
	
	public void input () throws IOException {
		
		System.out.println("Your name");
		name = br.readLine();
		System.out.println("Year of birth");
		birthYear = Integer.parseInt(br.readLine());
			
	}
	
	public void output () {
		System.out.println("Your name is " + name + ", You are " + age());
	}
	public void ChangeName(String name) {
		this.name = name;
	}
	public static void main (String[] args) throws IOException{
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		person1.input();
		person1.output();
		person2.input();
		person2.output();
		person3.input();
		person3.output();
		person4.input();
		person4.output();
		person5.input();
		person5.output();
	}
	
}    
