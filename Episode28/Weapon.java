package Episode28;

public class Weapon {
	private String name;
	private int maxDamage;

	public Weapon(String name, int maxDamage) {
		this.name = name;
		this.maxDamage = maxDamage;
	}

	public String getName() {
		return name;
	}

	public int getMaxDamage() {
		return maxDamage;
	}
}
