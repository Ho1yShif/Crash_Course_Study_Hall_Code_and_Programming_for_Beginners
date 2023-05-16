package Episode28;

import java.util.Random;

public class Battle {
    public static void main(String[] args) {
        // Instantiate weapons
        Weapon sword = new Weapon("Sword", 10);
        Weapon axe = new Weapon("Axe", 15);

        // Instantiate monsters
        Monster monster1 = new Monster("Dracus", 50, sword);
        Monster monster2 = new Monster("Frostbite", 60, axe);

        // Loop to control the rounds of the battle
        Random random = new Random();
        int round = 1;
        while (monster1.getCurrentHealth() > 0 && monster2.getCurrentHealth() > 0) {
            System.out.println("Round " + round + " begins!");

            // Determine which monster attacks first randomly
            Monster attacker = random.nextBoolean() ? monster1 : monster2;
            Monster defender = attacker == monster1 ? monster2 : monster1;

            // Attacker attacks defender
            int damage = attacker.attack();
            defender.takeDamage(damage);
            System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damage + " damage.");
            System.out.println(defender.getName() + " has " + defender.getCurrentHealth() + " health remaining.");

            // Check if the battle is over
            if (monster1.getCurrentHealth() <= 0 || monster2.getCurrentHealth() <= 0) {
                break;
            }

            // Defender attacks attacker
            damage = defender.attack();
            attacker.takeDamage(damage);
            System.out.println(defender.getName() + " attacks " + attacker.getName() + " for " + damage + " damage.");
            System.out.println(attacker.getName() + " has " + attacker.getCurrentHealth() + " health remaining.");

            // Check if the battle is over
            if (monster1.getCurrentHealth() <= 0 || monster2.getCurrentHealth() <= 0) {
                break;
            }

            round++;
        }

        // Determine the winner
        if (monster1.getCurrentHealth() > 0) {
            System.out.println(monster1.getName() + " wins the battle!");
        } else {
            System.out.println(monster2.getName() + " wins the battle!");
        }
    }
}
