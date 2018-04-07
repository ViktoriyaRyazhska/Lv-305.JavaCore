package lesson06_inheritance.practical.person;

public class Teacher extends Staff {
    final String TYPE_PERSON = "Teacher";

    @Override
    void salary() {
        System.out.println("salary for "+TYPE_PERSON);
    }

    Teacher(){
        System.out.println(TYPE_PERSON);
    }
    @Override
    void print() {
        System.out.println("im a teacher");
    }
}
