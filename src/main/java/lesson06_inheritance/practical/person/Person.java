package lesson06_inheritance.practical.person;

public abstract class Person {
    String name;
    abstract void print();

    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Student();
        persons[1] = new Teacher();
        persons[2] = new Cleaner();
        for(Person person : persons){
            person.print();
            if(person instanceof Staff){
                ((Staff) person).salary();
            }
        }
    }
}
