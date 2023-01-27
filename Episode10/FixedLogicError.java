package Episode10;

public class FixedLogicError {
	public static void processOrder(int productCost, String orderStatus) {
		// Added functionality for return orders as well as a catch-all else statement
		double shippingCost = 10.50;
		double totalCost = 5.00;
		if (orderStatus == "shipped") {
			totalCost = productCost + shippingCost;
			System.out.println("The total cost of your shipped item is $" + totalCost + ".");
		} else if (orderStatus == "cancelled") {
			totalCost = 0;
			System.out.println("The total cost of your cancelled item is now $0.");
		} else if (orderStatus == "returned") {
			totalCost = totalCost - shippingCost;
			System.out.println("The total cost of your returned item is $" + totalCost + ".");
		} else {
			System.out.println("Unsupported order status.");
		}
	}

	public static void main(String[] args) {
		processOrder(100, "shipped");
	}
}