package Episode10;

public class FixedLogicError {
	public static void processOrder(int productCost, String orderStatus) {
		// Added functionality for return orders as well as a catch-all else statement
		double shippingCost = 10.50;
		double totalCost = 0.0;
		if (orderStatus == "shipped") {
			totalCost = productCost + shippingCost;
			System.out.println("The total cost of your shipped order is $" + totalCost + ".");
		} else if (orderStatus == "cancelled") {
			totalCost = 0.0;
			System.out.println("The total cost of your cancelled order is now $0.");
		} else if (orderStatus == "returned") {
			totalCost = productCost - shippingCost;
			System.out.println("The total cost of your returned order is $" + totalCost + ".");
		} else {
			System.out.println("Unsupported order status.");
		}
	}

	public static void main(String[] args) {
		processOrder(100, "returned");
	}
}