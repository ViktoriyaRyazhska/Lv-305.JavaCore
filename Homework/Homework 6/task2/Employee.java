package task2;

public abstract class Employee implements Pay{
private String employeeId;
private String employeeName;

public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}


public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}


public Employee(String employeeId, String employeeName) {
	
	this.employeeId = employeeId;
	this.employeeName = employeeName;
}
@Override
public abstract double calculatePay();



}
