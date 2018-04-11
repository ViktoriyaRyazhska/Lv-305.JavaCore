import java.util.Set;
import java.util.TreeSet;

public class Main2 {
	public static void main(String[] args) {
		Set<Employee1> set = new TreeSet(Employee1.getNameComparator());
		set.add(new Employee1(15, "Vasya"));
		set.add(new Employee1(2, "Kat"));
		set.add(new Employee1(40, "Alina"));
		set.add(new Employee1(17, "Vasya"));
		set.add(new Employee1(12, "Anna"));
		set.add(new Employee1(2, "Alina"));
		System.out.println(set);
		
		Set<Employee1> set1 = new TreeSet(Employee1.getTabComparator());
		set1.addAll(set);
		System.out.println(set1);
	}

}
