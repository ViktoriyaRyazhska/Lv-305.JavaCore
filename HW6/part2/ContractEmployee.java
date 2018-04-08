package part2;

public class ContractEmployee extends Employee implements Wage {
	private int federalTaxIdmember;
	private int fixedWage;
	private String name;

	public ContractEmployee(String employeeld, String name, int federalTaxIdmember, int fixedWage) {
		super(employeeld);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedWage = fixedWage;
		this.name = name;
	}

	@Override
	public double calculatePay() {
		return this.fixedWage;
	}

	@Override
	public String toString() {
		return ("Employeeld name is " + this.name + ", Id - " + this.federalTaxIdmember + ", wage = "
				+ this.calculatePay());
	}

}
