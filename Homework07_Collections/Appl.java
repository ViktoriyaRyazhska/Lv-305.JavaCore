import java.util.ArrayList;
import java.util.List;

/**
 * In the main() method
 * declare List students and add to the list five different students
 * display the list of students ordered by name
 * display the list of students ordered by course.
 */
public class Appl {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jack", 1));
        studentList.add(new Student("John", 2));
        studentList.add(new Student("Jim", 3));
        studentList.add(new Student("Jin", 4));
        studentList.add(new Student("Jay", 5));


        printAll(studentList);
        studentList.sort(new Student.NameComparator());
        printAll(studentList);


        printAll(studentList);
        studentList.sort(new Student.CourseComparator());
        printAll(studentList);


    }
    public static void printAll(List list){
        for(Object l:list){
            System.out.println(l);
        }
        System.out.println();
    }
}
