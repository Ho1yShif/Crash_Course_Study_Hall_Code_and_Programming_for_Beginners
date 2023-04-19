package Episode20;

public class efficientCereal {
	
	public static void main(String[] args) {
		String boxOfCereal = "cereal";
		String actualCereal = boxOfCereal;
		System.out.println(boxOfCereal == actualCereal);
		System.out.println(boxOfCereal.equals(actualCereal));
	}
}