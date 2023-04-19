package Episode20;

import java.util.ArrayList;

public class friendsArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> friends = new ArrayList<String>();
		System.out.println("Before: " + friends.size()); // Before: 0
		friends.add("Taha");
		friends.add("Melissa");
		friends.add("Hank");
		friends.add("John");
		friends.add("Tom");
		System.out.println("After: " + friends.size()); // After: 5
	}
}