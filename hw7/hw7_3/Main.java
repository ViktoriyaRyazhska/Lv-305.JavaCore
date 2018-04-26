package hw7_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Anna	", 5));
		studentList.add(new Student("Inna	", 2));
		studentList.add(new Student("Nina	", 4));
		studentList.add(new Student("Katja	", 5));
		studentList.add(new Student("Olesja	", 3));

		System.out.println("Sorted students by name: ");
		for (Student studtmp : studentList) {
			System.out.println(studtmp);
		}
		System.out.println("\nSorted students by course: ");
		studentList.sort(new CompareCourse());
		for (Student studtmp : studentList) {
			System.out.println(studtmp);
		}
		System.out.println("\nEnter the course <1..5> make your choice:");
		int course = Integer.parseInt(br.readLine());
		System.out.println("Students of " + course + " course");
		Student st1 = new Student();
		st1.printStudents(studentList, course);
	}
}