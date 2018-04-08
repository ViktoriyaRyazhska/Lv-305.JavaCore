package part2;

public class SalariedEmployee extends Employee implements Wage {
	private int socialSecurityNumber;
	private double hourlyRate;
	private int workedHours;
	private String name; 

	public SalariedEmployee(String employeeld,String name, int socialSecurityNumber, double hourlyRate, int workedHour) {
		super(employeeld);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.workedHours = workedHour;
		this.name = name;
	}

	@Override
	public double calculatePay() {
		return this.hourlyRate * this.workedHours;
	}
	
	@Override
	public String toString() {
		return ("Employeeld name is " + this.name + ", Id - " + this.socialSecurityNumber + ", wage = " + this.calculatePay());
	}

}
