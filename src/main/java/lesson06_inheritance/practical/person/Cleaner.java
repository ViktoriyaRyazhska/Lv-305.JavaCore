package lesson06_inheritance.practical.person;

public class Cleaner extends Staff{
    final String TYPE_PERSON = "Cleaner";
    Cleaner(){
        System.out.println(TYPE_PERSON);
    }
    @Override
    void print() {
        System.out.println("im a cleaner");
    }

    @Override
    void salary() {
        System.out.println("salary for "+TYPE_PERSON);
    }
}
