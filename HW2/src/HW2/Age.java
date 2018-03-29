package HW2;

public class Age {

    public static void main(String[] args) {
        Person p1 = new Person("Harry",1982);
        Person p2 = new Person("Hermione",1983);
        Person p3 = new Person("Ron",1984);
        Person p4 = new Person("Voldemort",1965);
        Person p5 = new Person("Albus",1956);

        System.out.println(p1);
        System.out.println("Age: " + p1.age());
        System.out.println(p2);
        System.out.println("Age: " + p2.age());
        System.out.println(p3);
        System.out.println("Age: " + p3.age());
        System.out.println(p4);
        System.out.println("Age: " + p4.age());
        System.out.println(p5);
        System.out.println("Age: " + p5.age());



        p1.changeBirthYear(1992);
        p2.changeBirthYear(1993);
        p3.changeBirthYear(1994);
        p4.changeBirthYear(1975);
        p5.changeBirthYear(1966);

        p1.changeName("Draco");
        p2.changeName("Bellatrix");
        p3.changeName("Lucius");
        p4.changeName("Dolores");
        p5.changeName("TomRaddle");



        System.out.println(p1);
        System.out.println("Age: " + p1.age());
        System.out.println(p2.toString());
        System.out.println("Age: " + p2.age());
        System.out.println(p3.toString());
        System.out.println("Age: " + p3.age());
        System.out.println(p4.toString());
        System.out.println("Age: " + p4.age());
        System.out.println(p5.toString());
        System.out.println("Age: " + p5.age());

        }
}
