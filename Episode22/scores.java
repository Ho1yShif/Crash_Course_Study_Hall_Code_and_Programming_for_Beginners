package Episode22;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class scores {
	public static void main(String[] args) {
		try {
			// Open the file using FileInputStream
			FileInputStream inputStream = new FileInputStream("Episode22/Files/student_scores.txt");

			// Create a Scanner to read the file
			Scanner scanner = new Scanner(inputStream);

			// Initialize ArrayLists to store the names and scores
			ArrayList<String> names = new ArrayList<>();
			ArrayList<ArrayList<Integer>> scores = new ArrayList<>();

			// Loop through the lines and add the names and scores to the ArrayLists
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split(",");
				String studentName = parts[0];
				int score1 = Integer.parseInt(parts[1].trim());
				int score2 = Integer.parseInt(parts[2].trim());
				int score3 = Integer.parseInt(parts[3].trim());

				// Add the name to the names ArrayList
				names.add(studentName);

				// Create a new ArrayList to store the scores for this student
				ArrayList<Integer> studentScores = new ArrayList<>();
				studentScores.add(score1);
				studentScores.add(score2);
				studentScores.add(score3);

				// Add the scores ArrayList to the scores ArrayList of ArrayLists
				scores.add(studentScores);
			}

			// Print the contents of the names and scores ArrayLists
			for (int i = 0; i < names.size(); i++) {
				String studentName = names.get(i);
				ArrayList<Integer> studentScores = scores.get(i);
				System.out.println(studentName + ": " + studentScores.get(0) + ", " + studentScores.get(1) + ", " + studentScores.get(2));
			}

			// Close the FileInputStream and Scanner
			inputStream.close();
			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}