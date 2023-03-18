package Episode08.Draft02;

public class weather {
	public static void main(String[] args) {
	Double reader_temp = 70.0; // degrees Fahrenheit

	// Conditional statements
	if (reader_temp == 70.0) {
		System.out.println("The weather outside is perfect!");
	} else if (reader_temp  >= 95.0) {
		System.out.println("Heat Warning: Remember to stay cool and stay hydrated!");
	} else if (reader_temp  <= 32.0) {
		System.out.println("Freeze Warning: Remember to wear lots of layers!");
	}
	} 
}