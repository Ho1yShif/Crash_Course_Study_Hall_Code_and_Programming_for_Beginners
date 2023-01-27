package Episode10;

public class FixedLogicError {
	public static void processOrder(Order order) {
		int shippingCost = 10;
		if (order.status == "shipped") {
			order.totalCost = order.ProductCost + shippingCost;
		} else if (order.status == "cancelled") {
			order.totalCost = 0;
		} else if (order.status == "returned") {
			order.totalCost = order.totalCost - shippingCost;
		} else {
			System.out.println("Unsupported status found.");
		}
	}
}