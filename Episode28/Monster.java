package Episode28;

import Episode28.Weapon;

public class Monster {
	private String name;
	private int currentHealth;
	private Weapon weapon;

	public Monster(String name, int currentHealth, Weapon weapon) {
		this.name = name;
		this.currentHealth = currentHealth;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void takeDamage(int damage) {
		this.currentHealth -= damage;
		System.out.println(this.name + " takes " + damage + " damage. Current health: " + this.currentHealth);
	}

	public void attack(Monster other) {
		int damage = this.weapon.getMaxDamage();
		other.takeDamage(damage);
		System.out.println(this.name + " attacks " + other.getName() + " with " + this.weapon.getName() + " for " + damage + " damage.");
	}
}
