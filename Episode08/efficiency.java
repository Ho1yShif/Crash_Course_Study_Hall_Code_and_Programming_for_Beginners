package Episode08;

import java.util.Scanner;

public class efficiency {
	public static void main(String[] args) {
	
	// Improve efficiency by avoiding calculations when input is 1
	System.out.println("Enter an integer:");
	Scanner scnr = new Scanner(System.in);
	int num = scnr.nextInt();

	if (num == 1) {
		System.out.println(1);
	} else {
		// Perform calculation only if condition is not met
		System.out.println(num * num);
	}

	scnr.close();
	} 
}