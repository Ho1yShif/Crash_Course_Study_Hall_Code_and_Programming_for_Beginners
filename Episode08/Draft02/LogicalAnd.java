package Episode08.Draft02;

public class LogicalAnd {
	public static void main(String[] args) {
	Double reader_temp = -10.0; // degrees Fahrenheit

	// AND operator
	if (reader_temp >= -13.0 && reader_temp <= 5.0) {
		System.out.println("The vaccines are safe");
	} else {
		System.out.println("Vaccine safety warning: Get the temperature back to a controlled range!");
	}
	}
}