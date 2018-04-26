package HW7.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    static Comparator<Student> byName = (Student o1, Student o2)->o1.getName().compareTo(o2.getName());

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alol",3));
        students.add(new Student("BRoma", 3));
        students.add(new Student("CVasja", 2));
        students.add(new Student("DSanya", 1));
        students.add(new Student("EAlena", 0));

        displayStudentsByName(students);
        diplayStudentsByCourse(students);


    }
    public static void displayStudentsByName(ArrayList<Student> students) {
        Collections.sort(students, byName );
        students.forEach(value -> System.out.println(value));
        System.out.println("_______________________");

    }
    public static void diplayStudentsByCourse(ArrayList<Student> students){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse() - o2.getCourse();
            }
        });
        students.forEach(value -> System.out.println(value));
        System.out.println("_______________________");

    }

}

