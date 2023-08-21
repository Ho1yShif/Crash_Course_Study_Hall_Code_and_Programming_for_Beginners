package Episode26;

import java.util.ArrayList;

public class NonGuardClause {
    private boolean isValidIdFormat(String id) {
        // Check if ID has 8 characters
        return id.length() == 8;
    }

    public void addToIDList(String id) {
        // Guard clause ensures that the ID has a valid format
        if isValidIdFormat(id) {
            System.out.println("ID format validated. Proceeding to next step");
            return;
        } else {
            System.out.println("ID not added. Invalid ID format.");
            return;
        }

        // Guard clause ensures that the ID is not already in the list of valid IDs
        if (this.ValidIDs.contains(id)) {
            System.out.println("ID not added. ID already exists in the list.");
            return;
        }

    public static void main(String[] args) {
        ArrayList<String> ValidIDs = new ArrayList<String>();
        ValidIDs.add("123123123");
        ValidIDs.add("00000000");
        ValidIDs.add("05082021");

        SecurityGuard guard = new SecurityGuard(ValidIDs);

        guard.addToIDList("05082021");
    }
}
