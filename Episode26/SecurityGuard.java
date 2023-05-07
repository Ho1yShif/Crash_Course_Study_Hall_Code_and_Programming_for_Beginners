package Episode26;

import java.util.ArrayList;

public class SecurityGuard {
	private ArrayList<String> ValidIDs;

	public SecurityGuard(ArrayList<String> idList) {
		// When a guard is created, we give them the list of IDs
		this.ValidIDs = idList;
	}

	private boolean isValidIdFormat(String id) {
		// Check if ID has 8 characters
		return id.length() == 8;
	}
	
	public boolean grantAccess(String id) {
		// Guard clause ensures that the ID is valid format
		if (!isValidIdFormat(id)) {
			return false;
		}

		// Guard clause ensures that the ID in list of valid IDs
		if (!this.ValidIDs.contains(id)) {
			return false;
		}

		// We now know the ID is valid, access can be granted!
		return true;
	}

	public String message(String id) {
		if (grantAccess(id)) {
			return "Access granted! Enjoy your day.";
		}

		return "Access not granted. Please present a new ID and try again.";
	}

	public static void main(String[] args) {
		ArrayList<String> ValidIDs = new ArrayList<String>();
		ValidIDs.add("123123123");
		ValidIDs.add("00000000");
		ValidIDs.add("05082021");

		SecurityGuard guard = new SecurityGuard(ValidIDs);

		String check = guard.message("05082021");

		System.out.println(check);
	}
}

