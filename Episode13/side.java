package Episode13;

public class side {
    public static void makeSandwich(String main_sandwich_type, String side_sandwich_type) {
        String protein = "";
        int sourdough = 1;
        int lettuce = 1;
        int tomatoes = 1;
    
        if (main_sandwich_type.equals("blt")) {
          protein = "bacon";
        } else if (main_sandwich_type.equals("chicken")) {
          protein = "chicken";
        }
    
        // recursively call makeSandwich to create a side sandwich
        sandwich side_sandwich = makeSandwich(side_sandwich_type, "");
    
        System.out.println("You have a " + main_sandwich_type + " sandwich and a " side_sandwich_type + " side sandwich.");
      }
    
    public static void main(String args[]) { 
        makeSandwich("blt", "chicken"); // our main and side sandwich orders
  } 
}
