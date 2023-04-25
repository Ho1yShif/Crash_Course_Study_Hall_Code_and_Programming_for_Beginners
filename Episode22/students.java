package Episode22;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class students {
	public static void main(String[] args) {
		String[] studentNames = {
			"Avery Nguyen",
			"Brianna Thompson",
			"Carlos Rodriguez",
			"Dakota Black",
			"Elijah Patel",
			"Fatima Ali",
			"Gabriel Brown",
			"Hannah Kim",
			"Isaiah Jackson",
			"Jasmine Singh"
		};

		// Create a PrintWriter object to write to the CSV file
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new FileWriter("student_names.csv"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Write the header of the CSV file
		writer.println("Student Names");

		// Write each student name to the CSV file
		for (String name : studentNames) {
			writer.println(name);
		}

		// Close PrintWriter
		writer.close();
	}
}
