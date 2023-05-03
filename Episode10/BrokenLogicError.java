package Episode10;

public class BrokenLogicError {
	// Logic Error: Missing functionality for returned orders
	public static double processOrder(int productCost, String orderStatus) {
		double shippingCost = 10.50;
		double totalCost = 0.0;
		if (orderStatus.compareTo("shipped") == 0) {
			totalCost = productCost + shippingCost;
			System.out.println("The total cost of your shipped order is $" + totalCost + ".");
			return totalCost;
		} else if (orderStatus.compareTo("cancelled") == 0) {
			totalCost = 0.0;
			System.out.println("The total cost of your cancelled order is now $0.");
			return 0.0;
		} else {
			return 0.0;
		}
	}

	public static void main(String[] args) {
		processOrder(100, "shipped");
	}
}
