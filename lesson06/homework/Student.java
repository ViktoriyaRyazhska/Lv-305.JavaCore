package lesson06.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int course;

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

    @Override
    public String toString() {
        return String.format("[name: %s , course : %d]",getName(),getCourse());
    }
    private Student(){}

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
    void printStudents(List<Student> students, Integer course){
       students.stream().filter(x->x.getCourse()==course).forEach(student -> System.out.println(student.getName()));
    }
    private class NameComparator implements Comparator<Student> {
         public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    private class CourseComparator implements Comparator<Student>{
         public int compare(Student o1, Student o2) {
            return o1.getCourse()-o2.getCourse();
        }
    }
    static void printByNames(List<Student> list){
        System.out.println(list.stream().sorted(new Student().new NameComparator()).collect(Collectors.toList()));
    }
   static void printByCourse(List<Student> list){
        System.out.println(list.stream().sorted(new Student().new CourseComparator()).collect(Collectors.toList()));
    }


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ida",2));
        students.add(new Student("Jacey",3));
        students.add(new Student("Sabrina",2));
        students.add(new Student("Gabry",4));
        students.add(new Student("Letty",5));
        printByNames(students);
        printByCourse(students);

    }
}
