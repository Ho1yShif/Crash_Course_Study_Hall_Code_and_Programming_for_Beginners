package Episode10;

public class BrokenLogicError {
	public static void processOrder(Order order) {
		double shippingCost = 10;
		if (order.status == "shipped") {
			order.totalCost = order.ProductCost + shippingCost;
		} else if (order.status == "cancelled") {
			order.totalCost = 0;
		}
	}
}