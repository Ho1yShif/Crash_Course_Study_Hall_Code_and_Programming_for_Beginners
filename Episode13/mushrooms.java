package Episode13;

public class mushrooms {
	public static void main(String[] args) {
		double shiitakePounds = 12.0;
		double portobelloPounds = 15.0;

		double chosenMushroomAmount = Math.max(shiitakePounds, portobelloPounds);
		System.out.println(chosenMushroomAmount + " pounds"); // Output: 15.0 for portabello
	}
}