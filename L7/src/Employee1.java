import java.util.Comparator;

public class Employee1 {
	int tabNumber;
	String name;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + tabNumber;
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
		Employee1 other = (Employee1) obj;
		if (tabNumber != other.tabNumber)
			return false;
		return true;
	}

	public Employee1(int tabNumber, String name) {
		this.tabNumber = tabNumber;
		this.name = name;
	}

	static NameComparator nameComparator = new NameComparator();
	static TabComparator tabComparator = new TabComparator();

	public static Comparator getNameComparator() {
		return nameComparator;
	}

	public static Comparator getTabComparator() {
		return tabComparator;
	}
	
	@Override
	public String toString() {
		return "Employee1 [tabNumber=" + tabNumber + ", name=" + name + "]";
	}



	static class NameComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((Employee1) o1).name.compareTo(((Employee1) o2).name);
		}
	}

	static class TabComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((Employee1) o1).tabNumber - ((Employee1) o2).tabNumber;
		}
	}
}
