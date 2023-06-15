package my.simulation.characters;
/**
 * The Dragon class represents a dragon character in the simulation.
 * It extends the Characters class.
 */

public class Dragon extends Characters {
    /**
     * Constructs a new Dragon object with the specified attributes.
     *
     * @param name          The name of the dragon.
     * @param coordinate_x  The X coordinate of the dragon's position.
     * @param coordinate_y  The Y coordinate of the dragon's position.
     * @param health        The health value of the dragon.
     * @param strength      The strength value of the dragon.
     * @param kills         The number of kills made by the dragon.
     * @param critical_damage The critical damage value of the dragon.
     * @param maxHealth     The maximum health value of the dragon.
     * @param move          A boolean indicating if the dragon can move.
     * @param tier          The tier value of the dragon.
     */
    public Dragon(String name, int coordinate_x, int coordinate_y, int health, int strength, int kills, int critical_damage, int maxHealth, boolean move, int tier){
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
