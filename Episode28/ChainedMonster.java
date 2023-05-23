package Episode28;

import Episode28.Weapon;

public class ChainedMonster {
	private String name;
	private int health;
	private Weapon weapon;

	public ChainedMonster(String name, int health, Weapon weapon) {
		this.name = name;
		this.health = health;
		this.weapon = weapon;
	}

	public ChainedMonster(String name, Weapon weapon) {
		// Constructor chaining to reuse the three-parameter constructor
		this(name, 100, weapon);
	}

	public String getName() {
		return name;
	}

	public int gethealth() {
		return health;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void takeDamage(int damage) {
		this.health -= damage;
		System.out.println(this.name + " takes " + damage + " damage. Current health: " + this.health);
	}

	public void attack(Monster other) {
		int damage = this.weapon.getMaxDamage();
		other.takeDamage(damage);
		System.out.println(this.name + " attacks " + other.getName() + " with " + this.weapon.getName() + " for " + damage + " damage.");
	}
}
