package Episode5;
import java.util.Scanner;

public class StringInput {
	// Name
	public static void main(String[] args) {
	System.out.println("Enter your first name ");
	Scanner scnr = new Scanner(System.in);
	String firstName = scnr.next();
	System.out.println(firstName);

	// Dummy nextline
	scnr.nextLine();

	// Sentence
	System.out.println("Enter a full sentence");
	String scanLine = scnr.nextLine();
	System.out.println(scanLine);
	scnr.close();
	} 
}