package Episode22;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class scores {
    public static void main(String[] args) {
        try {
            // Open the file using FileInputStream
            FileInputStream inputStream = new FileInputStream("/Users/shifra.isaacs/Documents/GH/CC_SH_PoP/Episode22/Files/student_scores.txt");

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

            // Calculate the average score for each student and store it in an ArrayList
            ArrayList<Double> averages = new ArrayList<>();
            for (ArrayList<Integer> studentScores : scores) {
                double sum = 0;
                for (int score : studentScores) {
                    sum += score;
                }
                double average = sum / studentScores.size();
                averages.add(average);
            }

            // Write the output CSV file
            PrintWriter writer = new PrintWriter(new FileWriter("student_averages.csv"));
			// Write the header of the CSV file
			writer.println("Student Name,Average Test Score");

			for (int i = 0; i < names.size(); i++) {
				String studentName = names.get(i);
				Double studentAverage = averages.get(i);
				writer.println(studentName + "," + studentAverage);
			}
            writer.close();

            // Close the FileInputStream and Scanner
            inputStream.close();
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
