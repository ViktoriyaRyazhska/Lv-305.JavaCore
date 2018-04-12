package task2;

public class Task2 {

	public static void main(String[] args) {
		Employee [] employee = new Employee[4];
		employee[0] = new SalariedEmployee("SE 1", "Markus", "SSN-5551", 28180);
		employee[1] = new SalariedEmployee("SE 2", "Maximus", "SSN-5543", 17770);
		employee[2] = new ContractEmployee("CE 1", "Maria", "FTIdM-3230", 110, 143);
		employee[3] = new ContractEmployee("CE 2", "Meelena", "FTIdM-4378", 110, 157);

		Employee tmp;
		for (int i = 0; i < employee.length - 1; i++) {
			for (int j = i+1; j < employee.length; j++) {
				if(employee[i].calculatePay() < employee[j].calculatePay()) {
					tmp = employee[i];
					employee[i] = employee[j];
					employee[j] = tmp;
				}
			}
		}
		
		
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
		}
	}

}
