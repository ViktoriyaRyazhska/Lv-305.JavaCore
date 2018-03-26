import java.util.Calendar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HW2 {
	private String name;
	private int birthdayYear;
	
	BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthdayYear() {
		return birthdayYear;
	}
	public void setBirthdayYear(int birthdayYear) {
		this.birthdayYear = birthdayYear;
	}
	public HW2(String name, int birthdayYear) {
		super();
		this.name = name;
		this.birthdayYear = birthdayYear;
	}
	public HW2() {
		super();
	}
	public int age(){
		Calendar calendar = Calendar.getInstance();
		int Year = calendar.get(Calendar.YEAR);
		int age = Year - birthdayYear;
		return age;
	}
	public void input() throws IOException{
		System.out.println("Input your name: ");
		this.name = br.readLine();
		System.out.println("Input your birth year: ");
		this.birthdayYear = Integer.parseInt(br.readLine());
	}
	public void output() {
		System.out.println("your name is " + name);
		System.out.println("you were born in " + birthdayYear);
		System.out.println("Now you are " + age());
	}
	public void changeName(String name) {
		this.name = name;
	}
}
