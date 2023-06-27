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

    public void addToIDList(String id) {
        // Guard clause ensures that the ID has a valid format
        if (!isValidIdFormat(id)) {
            System.out.println("ID not added. Invalid ID format.");
            return;
        }

        // Guard clause ensures that the ID is not already in the list of valid IDs
        if (this.ValidIDs.contains(id)) {
            System.out.println("ID not added. ID already exists in the list.");
            return;
        }

        // ID passes checks and can be added to the list
        this.ValidIDs.add(id);
        System.out.println("ID added successfully.");
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
