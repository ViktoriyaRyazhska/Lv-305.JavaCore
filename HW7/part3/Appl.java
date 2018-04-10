package part3;

import java.util.*;

public class Appl {

	public static void main(String[] args) {
		List<Student> st = new LinkedList<Student>();
		st.add(new Student("Ivan", 4));
		st.add(new Student("Artur", 1));
		st.add(new Student("Marta", 3));
		st.add(new Student("Andrii", 4));
		st.add(new Student("Ira", 2));
		
		st.sort(new  NameComparator());
        for (Student student : st) {
            System.out.println(student);
        }
        System.out.println();
        st.sort(new  CourseComparator());
        for (Student student : st) {
            System.out.println(student);
        }
        System.out.println();
        
        
        prSt pr = new prSt();
		pr.printStudents(st, 4);
	}

	

}
