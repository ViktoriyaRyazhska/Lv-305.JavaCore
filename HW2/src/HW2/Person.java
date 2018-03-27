package HW2;
import java.util.Calendar;

public class Person {
  private String name;
private int birthYear;
private int age;
//    public static int currentYear()
//    {
//        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
//        calendar.setTime(new java.util.Date());
//        return calendar.get(java.util.Calendar.YEAR);
//    }
public int age () {
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    return currentYear - birthYear;
}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    this.birthYear = birthYear;
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
            return this.name + " birhtday year = " + this.birthYear + ", age " + this.age;
        }

}
