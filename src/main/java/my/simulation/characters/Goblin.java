package my.simulation.characters;
/**
 * The Goblin class represents a goblin character in the simulation.
 * It extends the Characters class.
 */

public class Goblin extends Characters {
    /**
     * Constructs a new Goblin object with the specified attributes.
     *
     * @param name          The name of the goblin.
     * @param coordinate_x  The X coordinate of the goblin's position.
     * @param coordinate_y  The Y coordinate of the goblin's position.
     * @param health        The health value of the goblin.
     * @param strength      The strength value of the goblin.
     * @param kills         The number of kills made by the goblin.
     * @param critical_damage The critical damage value of the goblin.
     * @param maxHealth     The maximum health value of the goblin.
     * @param move          A boolean indicating if the goblin can move.
     * @param tier          The tier value of the goblin.
     */
    public Goblin(String name, int coordinate_x, int coordinate_y, int health, int strength, int kills, int critical_damage, int maxHealth, boolean move, int tier){
        setName(name);
        setMaxHealt(maxHealth);
        this.move=move;
        this.coordinate_x=coordinate_x;
        this.coordinate_y=coordinate_y;
        setHealth(health);
        setStrength(strength);
        this.kills=kills;
        this.critical_damage=critical_damage;
        setTier(tier);
    }
}
