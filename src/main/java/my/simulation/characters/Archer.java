package my.simulation.characters;
/**
 * The Archer class represents an archer character in the simulation.
 * It extends the Characters class.
 */
public class Archer extends Characters {
    /**
     * Constructs a new Archer object with the specified attributes.
     *
     * @param name          The name of the archer.
     * @param coordinate_x  The X coordinate of the archer's position.
     * @param coordinate_y  The Y coordinate of the archer's position.
     * @param health        The health value of the archer.
     * @param strength      The strength value of the archer.
     * @param kills         The number of kills made by the archer.
     * @param critical_damage The critical damage value of the archer.
     * @param maxHealth     The maximum health value of the archer.
     * @param move          A boolean indicating if the archer can move.
     * @param tier          The tier value of the archer.
     */
    public Archer(String name, int coordinate_x, int coordinate_y, int health, int strength, int kills, int critical_damage, int maxHealth, boolean move, int tier){
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
