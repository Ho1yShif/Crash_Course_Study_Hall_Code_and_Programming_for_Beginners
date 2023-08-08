package Episode24;

public class PartyGuest {
	String name;
	int age;
	String favoriteDrink;
	boolean allergicToPeanuts;

	public PartyGuest(String name, int age, String favoriteDrink, boolean allergicToPeanuts) {
		this.name = name;
		this.age = age;
		this.favoriteDrink = favoriteDrink;
		this.allergicToPeanuts = allergicToPeanuts;
	}

	public static void main(String[] args) {
		PartyGuest guest = new PartyGuest("Zack", 25, "Ginger Ale", false);
		System.out.println("Name: " + guest.name);
		System.out.println("Age: " + guest.age);
		System.out.println("Favorite Drink: " + guest.favoriteDrink);
		System.out.println("Allergic to peanuts: " + guest.allergicToPeanuts);
	}

	// Default constructor code
	public PartyGuest() {
		// No arguments taken, but we can set default values for the instance variables
		this.name = "";
		this.age = 0;
		this.favoriteDrink = "";
		this.allergicToPeanuts = false;
	}
}
