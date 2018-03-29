
public class Prog {

	public static void main(String[] args) {
		Employee em1 = new Employee("Bodya",4,7);
		Employee em2 = new Employee("Artur",1,9);
		Employee em3 = new Employee("Mykola",5,8);

		System.out.println(em1);
		System.out.println(em2);
		System.out.println(em3);
		
//		em1.printOn();
//		em2.printOn();
//		em3.printOn();
		em1.changeRate(2);
		em2.changeRate(3);
		em3.changeRate(2);
		System.out.println(em1);
		System.out.println(em2.toString());
		System.out.println(em3.toString());
		em1.printOn();
		em2.printOn();
		em3.printOn();
		Employee.totalSumma();
	}

}
