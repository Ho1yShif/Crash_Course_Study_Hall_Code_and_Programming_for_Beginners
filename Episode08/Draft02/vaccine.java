package Episode08.Draft02;

public class vaccine {
	public static void main(String[] args) {
	Double temperature = -10.0; // degrees Fahrenheit

	// AND operator
	if (temperature >= -13.0 && temperature <= 5.0) {
		System.out.println("The vaccines are safe.");
	} else {
		System.out.println("Vaccine safety warning: Get the temperature back to a controlled range!");
	}
	}
}