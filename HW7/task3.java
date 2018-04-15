package HW7;

import java.util.LinkedList;
import java.util.List;

public class task3 {

	public static void main(String[] args) {
		List<Student> students = new LinkedList<>();
		students.add(new Student("Olga", 4));
		students.add(new Student("Roman", 1));
		students.add(new Student("Marta", 3));
		students.add(new Student("Vasya", 3));
		students.add(new Student("NataLya", 4));
		students.sort(new Student.NameComparator());
		students.sort(new Student.NameComparator());
        System.out.println(students);
        students.sort(new Student.CourseComparator());
        System.out.println(students);
	}

}
