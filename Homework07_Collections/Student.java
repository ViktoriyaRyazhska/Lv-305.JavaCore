import java.util.Comparator;
import java.util.List;

/**
 * Write class Student that provides information about the name of the student and his course.
 * Class Student should consists of
 * properties for access to these fields
 * constructor with parameters
 * method printStudents (List students, Integer course),
 * which receives a list of students and the course number
 * and prints to the console the names of the students from the list, which are taught in this course (use an iterator)
 * methods to compare students by name and by course
 */
public class Student {
    private String name;
    private int course;

    static NameComparator nameComparator = new NameComparator();
    static CourseComparator courseComparator = new CourseComparator();


    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public CourseComparator getCourseComparator() {
        return courseComparator;
    }

    public NameComparator getNameComparator() {
        return nameComparator;
    }

    public void printStudent(List<Student> studentList, Integer course){
        for(Student student:studentList){
            if(student.getCourse()==course){
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return getName()+" - "+getCourse();
    }
        static class NameComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Student)o1).getName().compareTo(((Student)o2).getName());
        }
    }
    static class CourseComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Student)o1).getCourse() - (((Student)o2).getCourse());
        }
    }
}
