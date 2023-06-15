package my.simulation.characters;
/**
 * The Tank class represents a tank character in the simulation.
 * It extends the Characters class.
 */

public class Tank extends Characters {
    /**
     * Constructs a new Tank object with the specified attributes.
     *
     * @param name          The name of the tank.
     * @param coordinate_x  The X coordinate of the tank's position.
     * @param coordinate_y  The Y coordinate of the tank's position.
     * @param health        The health value of the tank.
     * @param strength      The strength value of the tank.
     * @param kills         The number of kills made by the tank.
     * @param critical_damage The critical damage value of the tank.
     * @param maxHealth     The maximum health value of the tank.
     * @param move          A boolean indicating if the tank can move.
     * @param tier          The tier value of the tank.
     */
    public Tank(String name, int coordinate_x, int coordinate_y, int health, int strength, int kills, int critical_damage, int maxHealth, boolean move, int tier){
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
