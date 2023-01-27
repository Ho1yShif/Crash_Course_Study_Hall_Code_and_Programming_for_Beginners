package Episode10;

public class Newthing {
	public static void processOrder(int productCost, String orderStatus) {
		double shippingCost = 10.00;
		double totalCost = 5.00;
		if (orderStatus == "shipped") {
			totalCost = productCost + shippingCost;
		} else if (orderStatus == "cancelled") {
			totalCost = 0;
		} else if (orderStatus == "returned") {
			totalCost = totalCost - shippingCost;
		} else {
			System.out.println("An unsupported order status was entered.");
		}
	}
}
