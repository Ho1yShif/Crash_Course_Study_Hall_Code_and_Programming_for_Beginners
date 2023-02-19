package Episode13;

public class mushrooms {
	public static void main(String[] args) {
		double shiitake = 12.0;
		double portobello = 15.0;

		double chosenMushroomAmount = Math.max(shiitake, portobello);
		System.out.println(chosenMushroomAmount + " pounds"); // Output: 15.0 for portabello
	}
}