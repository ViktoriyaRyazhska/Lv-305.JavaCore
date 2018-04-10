package homework6;

public class ContractEmployee implements Employee {
	public int employeeld;
	public String name;
	public String federalTaxIdmember;
	public double hourlyRate;
	public int hoursWorked;

	public ContractEmployee(int employeeld, String name, String federalTaxIdmember, double hourlyRate,
			int hoursWorked) {
		super();
		this.employeeld = employeeld;
		this.name = name;
		this.federalTaxIdmember = federalTaxIdmember;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public ContractEmployee() {
		super();
	}

	public int getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(int employeeld) {
		this.employeeld = employeeld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public int employeeld() {
		return this.employeeld();
	}

	@Override
	public double calculatePay() {
		return hourlyRate*hoursWorked;
		
	}
	public void output() {
		System.out.println("id: " + employeeld + ". name " + name + ". Salary: " + calculatePay());
	}

	@Override
	public String toString() {
		return "ContractEmployee [employeeld=" + employeeld + ", name=" + name + ", federalTaxIdmember="
				+ federalTaxIdmember + ", salary=" + calculatePay() + "]";
	}
	
}
