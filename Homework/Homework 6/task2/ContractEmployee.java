package task2;

public class ContractEmployee extends Employee implements Pay {
	private String federalTaxIdmember;
	private double hourlyPaid;
	private double numbHoursWorked;

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
    public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	
    public double getHourlyPaid() {
		return hourlyPaid;
	}
	public void setHourlyPaid(double hourlyPaid) {
		this.hourlyPaid = hourlyPaid;
	}

	
	public double getNumbHoursWorked() {
		return numbHoursWorked;
	}
	public void setNumbHoursWorked(double numbHoursWorked) {
		this.numbHoursWorked = numbHoursWorked;
	}
	
	
	public ContractEmployee(String employeeId, String employeeName, String federalTaxIdmember, double hourlyPaid,
			double numbHoursWorked) {
		super(employeeId, employeeName);
		this.federalTaxIdmember = federalTaxIdmember;
		this.hourlyPaid = hourlyPaid;
		this.numbHoursWorked = numbHoursWorked;
	}
	
	@Override
	public double calculatePay() {

		return getHourlyPaid() * getNumbHoursWorked() ;
	}

	@Override
	public String toString() {
		return "SalariedEmployee: " + "ID- " + getEmployeeId() + ", Employee name- " + getEmployeeName()+ ", Federal Tax Idmember- " + 
				federalTaxIdmember + ", Monthly wage- " + calculatePay();
	}
}
