package Episode13;

public class mushrooms {
	public static void main(String[] args) {
		double shiitake = 12.0;
		double portabello = 15.0;

		double chosenMushroomAmount = Math.max(shiitake, portabello);
		System.out.println(chosenMushroomAmount); // Output: 15.09 for portabello
	}
}