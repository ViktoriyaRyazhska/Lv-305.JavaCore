
public class PizzaOrder {

	private String name;
	private String address;
	private String contactNumber;
	private String size;
	private final double BASIC_CRUST_COST = 30;
	private final double BASIC_CHEESE_COST = 30;
	private final double BASIC_SAUSE_COST = 30;
	private final double DELIVERY_CHARGE = 30;
	private String toppings;

	public PizzaOrder(String name, String address, String contactNumber, String size, String toppings) {
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.size = size;
		this.toppings = toppings;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getSize() {
		return size;
	}

	public double getBASIC_CRUST_COST() {
		return BASIC_CRUST_COST;
	}

	public double getBASIC_CHEESE_COST() {
		return BASIC_CHEESE_COST;
	}

	public double getBASIC_SAUSE_COST() {
		return BASIC_SAUSE_COST;
	}

	public double getDELIVERY_CHARGE() {
		return DELIVERY_CHARGE;
	}

	public String getToppings() {
		return toppings;
	}

	public int getNumberOfToppings() {

		return toppings.split(",").length;

	}

	public double getFinalCrustCost() {

		double finalCrustCost = 0;

		switch (size.toUpperCase())// switch (size)
		{

		case "S":
			finalCrustCost = BASIC_CRUST_COST;
			break;

		case "M":
			finalCrustCost = BASIC_CRUST_COST * 1.5;
			break;

		case "L":
			finalCrustCost = BASIC_CRUST_COST * 2.0;
			break;

		default:
			break;
		}

		return finalCrustCost;
	}

	public double getFinalCheeseCost() {

		double FinalCheeseCost = 0.0;

		switch (size.toUpperCase()) {
		case "S":
			return BASIC_CHEESE_COST;
		case "M":
			return BASIC_CHEESE_COST * 1.5;
		case "L":
			return BASIC_CHEESE_COST * 2.0;
		default:
			break;
		}

		return FinalCheeseCost;
	}

	public double getToppingsCost() {

		double toppingscost = 0.0;

		switch (size.toUpperCase())
		{
		case "S":
			return getNumberOfToppings() * 25;
		case "M":
			return getNumberOfToppings() * 30;
		case "L":
			return getNumberOfToppings() * 35;
		default:
			break;
		}

		return toppingscost;

	}

	public double getFinalPrice(String deliveryOption) {

		double FinalPrice = 0;
		switch (deliveryOption.toUpperCase()) {

		case "D":
			FinalPrice = getFinalCrustCost() + getFinalCheeseCost() + getToppingsCost() + BASIC_SAUSE_COST
					+ getDELIVERY_CHARGE();
		case "P":
			FinalPrice = getFinalCrustCost() + getFinalCheeseCost() + getToppingsCost() + BASIC_SAUSE_COST;

			break;

		}
		return FinalPrice;
	}

	@Override
	public String toString() {
		return "Order Name: " + name + "\nAddress: " + address + "\nContact Number: " + contactNumber + "\nPizza size: "
				+ size + "\nNumber of toppings: " + getNumberOfToppings() + "\nCrust cost: " + getFinalCrustCost()
				+ " UAH" + "\nSauce cost: " + BASIC_SAUSE_COST + " UAH" + "\nCheese cost: " + getFinalCheeseCost()
				+ " UAH" + "\nToppings cost: " + getToppingsCost() + " UAH";
	}
}