package my.simulation.characters;

public class Knight extends Characters {
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
