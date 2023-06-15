package my.simulation.characters;
/**
 * The Knight class represents a knight character in the simulation.
 * It extends the Characters class.
 */

public class Knight extends Characters {
    /**
     * Constructs a new Knight object with the specified attributes.
     *
     * @param name          The name of the knight.
     * @param coordinate_x  The X coordinate of the knight's position.
     * @param coordinate_y  The Y coordinate of the knight's position.
     * @param health        The health value of the knight.
     * @param strength      The strength value of the knight.
     * @param kills         The number of kills made by the knight.
     * @param critical_damage The critical damage value of the knight.
     * @param maxHealth     The maximum health value of the knight.
     * @param move          A boolean indicating if the knight can move.
     * @param tier          The tier value of the knight.
     */
    public Knight(String name, int coordinate_x, int coordinate_y, int health, int strength, int kills, int critical_damage, int maxHealth, boolean move, int tier){
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
