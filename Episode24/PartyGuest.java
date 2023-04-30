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
		PartyGuest zack = new PartyGuest("Zack", 25, "Ginger Ale", false);
		System.out.println("Name: " + zack.name);
		System.out.println("Age: " + zack.age);
		System.out.println("Favorite Drink: " + zack.favoriteDrink);
		System.out.println("Allergic to peanuts: " + zack.allergicToPeanuts);
	}
}
