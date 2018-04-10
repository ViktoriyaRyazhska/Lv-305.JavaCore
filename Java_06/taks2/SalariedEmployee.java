package homework6;

public class SalariedEmployee implements Employee  {
	public int employeeld;
	public String name;
	public String socialSecurityNumber;
	public double fixedMonthlyPayment;
	

	public SalariedEmployee(int employeeld, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
		super();
		this.employeeld = employeeld;
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public SalariedEmployee() {
		super();
	}

	@Override
	public String toString() {
		return "SalariedEmployee [employeeld=" + employeeld + ", name=" + name + ", socialSecurityNumber="
				+ socialSecurityNumber + ", fixedMonthlyPayment=" + fixedMonthlyPayment + "]";
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

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	@Override
	public int employeeld() {
		return this.employeeld();
	}

	@Override
	public double calculatePay() {
		return this.fixedMonthlyPayment;
	}
	public void output() {
		System.out.println("id: " + employeeld + ". name " + name + ". Salary: " + calculatePay());
	}
}
