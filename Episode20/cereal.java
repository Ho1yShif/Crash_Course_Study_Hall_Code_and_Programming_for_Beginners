package Episode20;

public class cereal {
	
	public static void main(String[] args) {
		String boxOfCereal = new String("cereal");
		String actualCereal = new String("cereal");
		System.out.println(boxOfCereal == actualCereal);
		System.out.println(boxOfCereal.equals(actualCereal));

		if (boxOfCereal == actualCereal) {
			System.out.println("boxOfCereal and actualCereal point to the same memory location");
		} else {
			System.out.println("boxOfCereal and actualCereal point to different memory locations");
		}

		if (boxOfCereal.equals(actualCereal)) {
			System.out.println("boxOfCereal and actualCereal have the same content");
		} else {
			System.out.println("boxOfCereal and actualCereal have different content");
		}
}
}