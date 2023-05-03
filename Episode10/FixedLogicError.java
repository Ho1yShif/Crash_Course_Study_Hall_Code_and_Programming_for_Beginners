package Episode10;

public class FixedLogicError {
	public static double processOrder(int productCost, String orderStatus) {
		// Added functionality for return orders as well as a catch-all else statement
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
		} else if (orderStatus.compareTo("returned") == 0) {
			totalCost = productCost - shippingCost;
			System.out.println("The total cost of your returned order is $" + totalCost + ".");
			return totalCost;
		} else {
			System.out.println("Unsupported order status.");
			return 0.0;
		}
	}

	public static void main(String[] args) {
		processOrder(100, "returned");
	}
}