package Episode08.Draft01;

import java.util.Scanner;

public class combined {
	public static void main(String[] args) {
	System.out.println("How many hours have you spent watching Vlogbrothers videos?");
	Scanner scnr = new Scanner(System.in);
	int vlogbrosWatchTime = scnr.nextInt();

	System.out.println("How many books by the Green brothers have you read?");
	int greenBooksRead = scnr.nextInt();

	if ((vlogbrosWatchTime == 100 || vlogbrosWatchTime == 80) && greenBooksRead > 0) {
		System.out.println("You're a Nerdfighter!");
	} else {
		System.out.println("You're not a Nerdfighter yet!");
	}

	scnr.close();
	}
}