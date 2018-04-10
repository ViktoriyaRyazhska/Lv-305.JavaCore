package part3;

import java.util.*;

public class Student {
	private String name;
	private Integer course;
	
	public Student(String name, Integer course) {
		super();
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public Integer getCourse() {
		return course;
	}
	
	public void printStudents(List<Student> st, Integer course) {
		Iterator iterator = st.iterator();
		while(iterator.hasNext()) {
			Student el = (Student) iterator.next();
			if(el.getCourse() == course) {
				System.out.println("Student's name is " + el.getName());
			}		
		}
	}
	
	@Override
	public String toString() {
		return ("Student's name is " + this.name + " , course " + this.course);
	}

}


