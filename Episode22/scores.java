package Episode22;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class scores {
	public static void main(String[] args) {
		try {
			// Open the file using FileInputStream
			FileInputStream inputStream = new FileInputStream("/Users/shifra.isaacs/Documents/GH/CC_SH_PoP/Episode22/names_and_scores.txt");

			// Create a Scanner to read the file
			Scanner scanner = new Scanner(inputStream);

			// Loop through the lines and print the test scores for each student
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split(",");
				String studentName = parts[0];
				int score1 = Integer.parseInt(parts[1].trim());
				int score2 = Integer.parseInt(parts[2].trim());
				int score3 = Integer.parseInt(parts[3].trim());
				System.out.println(studentName + ": " + score1 + ", " + score2 + ", " + score3);
			}

			// Close the FileInputStream and Scanner
			inputStream.close();
			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

