package my.simulation.characters;
/**
 * The Barbarian class represents a barbarian character in the simulation.
 * It extends the Characters class.
 */
public class Barbarian extends Characters {
    /**
     * Constructs a new Barbarian object with the specified attributes.
     *
     * @param name          The name of the barbarian.
     * @param coordinate_x  The X coordinate of the barbarian's position.
     * @param coordinate_y  The Y coordinate of the barbarian's position.
     * @param health        The health value of the barbarian.
     * @param strength      The strength value of the barbarian.
     * @param kills         The number of kills made by the barbarian.
     * @param critical_damage The critical damage value of the barbarian.
     * @param maxHealth     The maximum health value of the barbarian.
     * @param move          A boolean indicating if the barbarian can move.
     * @param tier          The tier value of the barbarian.
     */
    public Barbarian(String name, int coordinate_x, int coordinate_y, int health, int strength, int kills, int critical_damage, int maxHealth, boolean move, int tier){
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
