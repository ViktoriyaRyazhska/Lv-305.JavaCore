package part2;

public abstract class Employee implements Wage{
	private String employeeld;
	
	public Employee(String employeeld) {
		this.employeeld = employeeld;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public Employee() {
		super();
	}

	public abstract double calculatePay();

	
	
}
