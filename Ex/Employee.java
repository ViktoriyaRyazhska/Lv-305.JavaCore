package Ex;

public class Employee {

	private String name;
	private int rate;
	private int hours;
	private static double totalSum=0;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		totalSum = totalSum - this.rate * this.hours;
		this.rate = rate;
		totalSum = totalSum + this.rate * this.hours;

	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		totalSum = totalSum - this.rate * this.hours;
		this.hours = hours;
		totalSum = totalSum + this.rate * this.hours;

	}

	public static double getTotalSum() {
		return totalSum;
	}

	public static void setTotalSum(double totalSum) {
		Employee.totalSum = totalSum;
	}
	
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + this.rate * this.hours;

	}


	public int getSalary() {
		return  rate * hours;
		}
	
	public int getBonuses() {
		return  (double) (rate * hours * 0.1);
		}

	@Override
	public String toString() {
	return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours +"]";
	}

	


	
	