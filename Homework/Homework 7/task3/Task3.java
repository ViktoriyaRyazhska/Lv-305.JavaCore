//Write class Student that provides information about the name of the student and his course. Class Student should consists of
//properties for access to these fields
//constructor with parameters
//method printStudents (List students, Integer course), which receives a list of students and the course number and prints to the console the names of the students from the list, which are taught in this course (use an iterator)
//methods to compare students by name and by course
//In the main() method 
//declare List students and add to the list five different students
//display the list of students ordered by name
//display the list of students ordered by course.


package task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		List<Student> studenti = new ArrayList<Student>();
		
		studenti.add(new Student("Daria", 4));
		studenti.add(new Student("Lora", 1));
		studenti.add(new Student("Maks", 1));
		studenti.add(new Student("Trooman", 4));
		studenti.add(new Student("Stiven", 3));

		System.out.println("Not sorted list: " + studenti);
		
		studenti.sort(new CompareName());
        for (Student stud : studenti) {
            System.out.println(stud);
        }
        System.out.println();
        
        studenti.sort(new CompareCourse());
        for (Student stud : studenti) {
            System.out.println(stud);
        }
        
       
		
	}

}
