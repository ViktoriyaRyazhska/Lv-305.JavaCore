package hw7_3;

import java.util.Comparator;

public class CompareCourse implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getCourse() - s2.getCourse();
	}
}