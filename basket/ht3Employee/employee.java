package ht3Employee;

public class employee {
	private String name;
	private double rate;
	private double hours;
	private static double totalSum;
	
	public static double getTotalSum(){
		return totalSum;
		}
	public static void setTotalSum (double totalSum){
		employee.totalSum = totalSum;}
	public String getName(){
		return name;}
	public void setName (String name){
		this.name = name;}
	public double getRate(){
		return rate;}
	public void setRate(double rate){
		this.rate = rate;}
	public double getHours(){
		return hours;}
	public void setHours (double hours){
		this.hours = hours;}
	
	public employee(){}
	
	public employee(String name, double rate, double hours){
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	public double getSalary(){
		return  rate*hours;
	}
	public String toString(){
		return ("Name: "+ getName()+ "Rate: "+ getRate()+ "Hours: " + getHours());
	}
	public double bonuses(){
		return 0.33*getSalary();
	}
	public String rezum(){
		return ("Worked hard  "+ getName() + " received a salary of $ " + getSalary()
		+ " forever green dollars, spending "+  getHours()+" hours per month.");
		}
}
