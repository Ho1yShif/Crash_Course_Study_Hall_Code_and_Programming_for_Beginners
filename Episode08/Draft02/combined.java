package Episode08.Draft02;

public class combined {
	public static void main(String[] args) {
	Double temperature = 103.0; // degrees Fahrenheit

	// Combined conditions
	if ((temperature  >= 95.0 || temperature  <= 32.0) && temperature > -130 && temperature > 140) {
		System.out.println("This weather meets some very specific criteria!");
	}
}
}