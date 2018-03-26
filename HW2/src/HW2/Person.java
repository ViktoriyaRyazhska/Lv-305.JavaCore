package HW2;
import java.time.Year;
import java.util.Calendar;

public class Person {
  private String name;
private int birthYear;
private int Year;

    Calendar calendar = Calendar.getInstance();
    java.time.Year = calendar.get(Calendar.YEAR);

private int age () { return  Year - birthYear;
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

    public Person () {
    }

    public Person (String name, int birthYear) {
    this.name = name;
    this. birthYear = birthYear;
    }

    public int changeBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this.birthYear;
    }

        public String changeName(String name) {
            this.name = name;
            return this.name;
        }



        @Override
        public String toString() {
            return "Person (name = " + this.name + " birhtday year = " + this.birthYear + ")";
        }

}
