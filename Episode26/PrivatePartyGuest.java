package Episode26;
//package Episode26;

public class PrivatePartyGuest {
	private String name;
	private int age;
	private String favoriteDrink;
	private boolean allergicToPeanuts;

	// No constructor method

	// Getter methods for access
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public String getFavoriteDrink() {
		return favoriteDrink;
	}

	public boolean isAllergicToPeanuts() {
		return allergicToPeanuts;
	}

	// Setter methods for modification
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFavoriteDrink(String favoriteDrink) {
		this.favoriteDrink = favoriteDrink;
	}

	public void setAllergicToPeanuts(boolean allergicToPeanuts) {
		this.allergicToPeanuts = allergicToPeanuts;
	}

	public static void main(String[] args) {
		PrivatePartyGuest zack = new PrivatePartyGuest();
		// Use setter and getter instead of constructor with arguments
		zack.setFavoriteDrink("Ginger Ale");
		System.out.println(zack.getFavoriteDrink());
	}
}
