package part3;

import java.util.Iterator;
import java.util.List;

public class prSt {
	public void printStudents(List<Student> st, Integer course) {
		Iterator iterator = st.iterator();
		while(iterator.hasNext()) {
			Student el = (Student) iterator.next();
			if(el.getCourse() == course) {
				System.out.println("Student's name is " + el.getName());
			}		
		}
	}
}
