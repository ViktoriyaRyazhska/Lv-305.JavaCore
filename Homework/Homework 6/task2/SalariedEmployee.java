package task2;

public class SalariedEmployee extends Employee implements Pay {
	private String socialSecurityNumber;
	private double fixedpaid;

	
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}



	public double getFixedpaid() {
		return fixedpaid;
	}
	public void setFixedpaid(double fixedpaid) {
		this.fixedpaid = fixedpaid;
	}

	
	public SalariedEmployee(String employeeId, String employeeName, String socialSecurityNumber, double fixedpaid) {
		super(employeeId, employeeName);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedpaid = fixedpaid;
	}
	
	@Override
	public double calculatePay() {

		return getFixedpaid();
	}
	
	@Override
	public String toString() {
		return "SalariedEmployee: " + "ID- " + getEmployeeId() + ", Employee name- " + getEmployeeName()+ ", Security number- " + 
	socialSecurityNumber + ", Monthly wage- "
				+ calculatePay();
	}
	
	
}
