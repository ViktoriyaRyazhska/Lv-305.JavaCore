public class Employee {
	int tabNumber;
	String name;

	public Employee(String name, int tabNumber) {
		this.name = name;
		this.tabNumber = tabNumber;
	}

	@Override
    public String toString() {
        return "Employee [tabNumber=" + tabNumber + ", name=" + name + "]";
    }
}
