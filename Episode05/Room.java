package Episode05;
import java.util.Scanner;

public class Room {
	public static void main(String[] args) {
	// Goal: Find the area of a studio apartment in square feet

	System.out.println("What is the length of your studio apartment in feet?");
	Scanner scnr = new Scanner(System.in);
	int aptLength = scnr.nextInt();

	System.out.println("What is the width of your studio apartment in feet?");
	double aptWidth = scnr.nextDouble();

	double aptArea = aptLength * aptWidth;
	System.out.println("The area of your studio apartment is " + aptArea + " square feet.");
	scnr.close();
	} 
}