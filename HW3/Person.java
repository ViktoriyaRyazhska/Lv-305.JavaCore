import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

//Create Console Application project in Java.
//Add class Person to the project.
//Class Person should consists of
//two private fields: name and birthYear (the birthday year)
//properties for access to these fields
//default constructor and constructor with 2 parameters
//methods:
//age - to calculate the age of person
//input - to input information about person
//output - to output information about person
//changeName - to change the name of person
//In the method main() create 5 objects of Person type and input information about them.
public class Person {
    private String name = "";
    private int birthYear = 0;

    private String personInfo = "";


    public void changeName(String name) {
        this.name = name;
    }

    public String output() {
        return personInfo;
    }

    public void input(String personInfo) {
        this.personInfo = personInfo;
    }

    public Person() {

    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int age() {
        return LocalDateTime.now().getYear() - birthYear;
    }


}
