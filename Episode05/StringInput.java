package Episode05;
import java.util.Scanner;

public class StringInput {
	// Neighborhood
	public static void main(String[] args) {
	System.out.println("Enter your NYC neighborhood.");
	Scanner scnr = new Scanner(System.in);
	String aptNeighborhood = scnr.next();
	System.out.println(aptNeighborhood);

	// Dummy nextLine
	scnr.nextLine();

	// Address
	System.out.println("Enter your address.");
	String aptAddress = scnr.nextLine();
	System.out.println(aptAddress);
	scnr.close();
	} 
}