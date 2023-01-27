package Episode10;

public class BrokenLogicError {
	// Logic Error: Missing functionality for returned orders
	public static void processOrder(int productCost, String orderStatus) {
		double shippingCost = 10.50;
		double totalCost = 0.0;
		if (orderStatus == "shipped") {
			totalCost = productCost + shippingCost;
			System.out.println("The total cost of your shipped order is $" + totalCost + ".");
		} else if (orderStatus == "cancelled") {
			totalCost = 0.0;
			System.out.println("The total cost of your cancelled order is now $0.");
		} 
	}

	public static void main(String[] args) {
		processOrder(100, "shipped");
	}
}