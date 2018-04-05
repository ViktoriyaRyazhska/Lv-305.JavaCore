import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Vasya", 15));
        list.add(new Employee("Anna", 2));
        list.add(new Employee("Alina", 40));

        list.sort(new NameComparator());
        for (Employee employee : list) {
            System.out.println(employee);
        }
        System.out.println();
		list.sort(new TabComparator());
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }   
}
