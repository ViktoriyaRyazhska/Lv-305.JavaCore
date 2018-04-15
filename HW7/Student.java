package HW7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Student 
{
	private String name;
	private int course;
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course != other.course)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString()
	{
		return "name: "+name+", course: "+course;
	}
	static NameComparator nameComparator = 
			new NameComparator( );
    static CourseComparator tabComparator = 
			new CourseComparator();
     public static Comparator getNameComparator( ) {
        return nameComparator;
    }
   public static Comparator getTabComparator( ) {
      return tabComparator;
   }
	static class NameComparator implements Comparator {
		  public int compare(Object o1, Object o2) {
		    return ((Student)o1).name.compareTo(((Student)o2).name);
		  }
		}

		static class CourseComparator implements Comparator {
		  public int compare(Object o1, Object o2) {
		    return ((Student)o1).course - ((Student)o2).course;
		  }
		}
		public void printStudents (List<Student> students, Integer course)
		{
			for (Iterator i = students.iterator(); i.hasNext();)
			{
				   Student entry = (Student) i.next();
				   if(entry.getCourse()==course)
				   {
					   System.out.println(entry.getName());
				   }
			}
		}

	
}

