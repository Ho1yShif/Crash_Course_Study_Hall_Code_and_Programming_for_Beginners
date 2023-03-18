package Episode08.Draft01;

import java.util.Scanner;

public class multiOutcomes {
	public static void main(String[] args) {
	System.out.println("How many hours have you spent watching Vlogbrothers videos?");
	Scanner scnr = new Scanner(System.in);
	int vlogbrosWatchTime = scnr.nextInt();

	// Conditional statement
	if (vlogbrosWatchTime == 100) {
		System.out.println("You're a Nerdfighter!");
	} else if (vlogbrosWatchTime == 90) {
		System.out.println("You're almost a Nerdfighter!");
	} else if (vlogbrosWatchTime == 80) {
		System.out.println("You're getting close to becoming a Nerdfighter!");
	}

	scnr.close();
	} 
}