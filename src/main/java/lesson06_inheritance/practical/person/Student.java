package lesson06_inheritance.practical.person;

public class Student extends Person {
    final String TYPE_PERSON = "Student";
    Student(){
        System.out.println(TYPE_PERSON);
    }
    @Override
    void print() {
        System.out.println("im a student");
    }
}
