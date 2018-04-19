/*
Write class Student that provides information about the name
        of the student and his course. Class Student should consists of
        a) properties for access to these fields
        b) constructor with parameters
        c) method printStudents (List students, Integer course), which
        receives a list of students and the course number and prints
        to the console the names of the students from the list,
        which are taught in this course (use an iterator)
        d) methods to compare students by name and by course
        e) In the main() method
        • declare List students and add to the list five different
        students
        • display the list of students ordered by name
        • display the list of students ordered by course.
*/


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private Integer course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String toString() {
        return "Student name = " + name + "  course = " + course + " ";
    }

    public void printStudent(List<Student> students){
        Iterator it = students.iterator();
        while(it.hasNext()) {
            System.out.println((Student)it.next());

        }

    }

   public static class NameComparator implements Comparator<Student>{

    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }}

    public static class courseComparator implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            return o1.course.compareTo (o2.getCourse ());
        }
    }

    public static void main(String[] args) {
        List<Student>  student = new ArrayList<>();
        student.add(new Student("bob", 1));
        student.add(new Student("bob1", 2));
        student.add(new Student("bob4", 1));
        student.add(new Student("bob3", 3));
        student.add(new Student("bob2", 4));
        student.add(new Student("bob5", 5));
        System.out.println ("Ordered by name");
        student.sort(new NameComparator());
        for (Student i : student) {
            System.out.println( i);
        }
        System.out.println ("\n Ordered by course");
        student.sort(new courseComparator());
        for (Student i : student) {
            System.out.println(i);

        }

//        display the list of students ordered by name

        }




    }

