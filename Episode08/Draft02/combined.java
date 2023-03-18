package Episode08.Draft02;

public class combined {
	public static void main(String[] args) {
	Double reader_temp = 103.0; // degrees Fahrenheit

	// Combined conditions operator
	if ((reader_temp  >= 95.0 || reader_temp  <= 32.0) && reader_temp != 105 ) {
		System.out.println("This weather meets some very specific criteria!");
	}
}
}