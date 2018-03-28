
public class Person {
	private static final int currentYear = 2018;
	private static int birthYear;
	private String name;
	public static int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		 Person.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

		public int getAge() {
			int getAge= currentYear- birthYear;
			return getAge;
			}
		 
		@Override
		     public String toString()
		    {
		        return name+" "+getAge()+" роки";
		    }
}




         
        