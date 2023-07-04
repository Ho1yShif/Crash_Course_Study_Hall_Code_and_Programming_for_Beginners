package Episode28;

public class Monster {
	private String name;
	private int health;
	private Weapon weapon;

	public Monster(String name, int health, Weapon weapon) {
		this.name = name;
		this.health = health;
		this.weapon = weapon;
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
		System.out.printf("%s attacks %s with %s for %d damage.\n", this.name, other.getName(),  this.weapon.getName(),  damage);
	}
}
