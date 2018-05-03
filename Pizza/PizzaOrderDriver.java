import java.util.Scanner;

public class PizzaOrderDriver {

	public static void main(String[] args) {

		String order = "y";
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Lviv Pizza!");

			System.out.print("Please enter a name for order: ");
			String name = sc.nextLine();

			System.out.print("Please choose Delivery press <d> or Pick up press <p>: ");
			String dop = sc.nextLine(); 
			switch (dop.toUpperCase()) {
			case "D":

				
				System.out.print("Please enter your address (for example <str.Sadova 25/12>): ");
				String address = sc.nextLine();
				
				System.out.print("Please enter your contact number (for example <80676676767>): ");
				String contactNumber = sc.nextLine();
				
				System.out.print("Please choose the size of pizza 25cm, 30cm, 35cm press <S>, <M> or <L>: ");
				String size = sc.nextLine();
				System.out.print("Please enter the toppings you want to add separated by a comma for example <Mozzarella, parmesan>: ");
				String toppings = sc.nextLine();
				System.out.print("****************************************************\n");

				
				PizzaOrder pizzaorderObj1 = new PizzaOrder(name, address, contactNumber, size, toppings);
				System.out.println("Please review your order below:");
				System.out.println(pizzaorderObj1.toString());
				System.out.println("");
				System.out.println("Delivery charges : " + pizzaorderObj1.getDELIVERY_CHARGE()+ "UAH");
				System.out.print("****************************************************\n");
				System.out.println("Total bill amount to be paid: " + pizzaorderObj1.getFinalPrice(dop)+" UAH");
				System.out.print("****************************************************\n");
				System.out.println("Do you wish to place another order?(Y/N): ");
				order = sc.nextLine();
				break;
			case "P":

				
				System.out.print("Please enter your address (for example <str.Sadova 25/12>): ");
				address = sc.nextLine();
			
				System.out.print("Please enter your contact number (for example <80676676767>): ");
				contactNumber = sc.nextLine();
				
				System.out.print("Please choose the size of pizza 25cm, 30cm, 35cm press <S>, <M> or <L>: ");
				size = sc.nextLine();
				
				System.out.print("Please enter the toppings you want to add separated by a comma (for example <Mozzarella, parmesan>): ");
				toppings = sc.nextLine();
				System.out.print("****************************************************\n");

			
				PizzaOrder pizzaorderObj2 = new PizzaOrder(name, address, contactNumber, size, toppings);
				System.out.println("Please review your order below:");
				System.out.println(pizzaorderObj2.toString());
				System.out.println("****************************************************");
				System.out.println("Total bill amount to be paid: " + pizzaorderObj2.getFinalPrice(dop) +" UAH");
				System.out.print("****************************************************\n");
				System.out.println("Do you wish to place another order?(y/n): ");
				order = sc.nextLine();
				break;
			}
		} while (order.equals("y"));
		System.out.println("Thank you for your order!");
	}
}