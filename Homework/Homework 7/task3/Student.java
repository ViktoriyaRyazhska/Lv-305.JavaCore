package task3;

//import java.util.Iterator;
//import java.util.List;

public class Student {
private String name;
private Integer course;

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

	public Student(String name, Integer course) {
		this.name = name;
		this.course = course;
		
	}
	
//	public void printStudent(List<Student> studenti, Integer course) {
//		Iterator<Student> iterator = studenti.iterator();
//		   while(iterator.hasNext()){
//		      Student element = (Student) iterator.next();
//		      if(element.getCourse() == course) {
//		    	  System.out.println(element.getName());
//		      }
//		   }

//	}
	
	@Override
	public String toString() {
		return (this.name + " , course: " + this.course);
	}
}
