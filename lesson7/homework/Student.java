package lesson7.homework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private Integer course;

    static NameComparator nameComparator = new NameComparator();
    static CourseComparator courseComparator = new CourseComparator();

    public static Comparator getNameComparator( ) {
        return nameComparator;
    }

    public static Comparator getCourseComparator( ) {
        return courseComparator;
    }


    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (course != null ? course.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents (List<Student> students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse().equals(course)) {
                System.out.println(student);
            }
        }
    }


}
