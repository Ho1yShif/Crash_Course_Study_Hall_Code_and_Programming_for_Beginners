package Episode13;

public class caprese {
	public static sandwich makeSandwich(String sandwich_type) {
		int baguette = 1;
		int tomatoes = 1;
		int basil = 1;
		int arugula = 1;
		int mozzarella = 1;
		int balsamic = 1;
		System.out.println("You have a " + sandwich_type + " sandwich");
		return sandwich;
	}

	public static salad makeSalad(String topping) {
		int lettuce = 1;
		int tomatoes = 1;
		int onions = 1;
		int croutons = 1;
		System.out.println("You have a salad topped with " + topping);
		return salad;
	}

	public static void makeOrder(String sandwich_type, String salad_type) {
		makeSandwich(sandwich_type);
		makeSalad(salad_type);
	}

	public static void main(String[] args) {
		makeOrder("caprese", "chicken");
	}
}