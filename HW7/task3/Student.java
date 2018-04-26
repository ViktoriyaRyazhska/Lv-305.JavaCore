package HW7.task3;

import java.util.ArrayList;

public class Student {
    private String name = "";
    private int course = 0;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public Student() {
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

    public void printStudents(ArrayList<Student> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course) {
                System.out.println(students.get(i).getName());
            }
        }

    }
    //methods to compare students by name and by course  Добавити


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
