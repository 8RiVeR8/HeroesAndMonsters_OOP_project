package my.simulation.characters;

public class Goblin extends Characters {
    public Goblin(String name, int coordinate_x, int coordinate_y, int health, int strength, int kills, int critical_damage, int maxHealth, boolean move){
        this.name=name;
        this.maxHealt=maxHealth;
        this.move=move;
        this.coordinate_x=coordinate_x;
        this.coordinate_y=coordinate_y;
        this.health=health;
        this.strength=strength;
        this.kills=kills;
        this.critical_damage=critical_damage;
    }

    public boolean Isattack() {
        return false;
    }
    public boolean Healt(){
        return false;
    }

    public void Pozition(){

    }
    public void Collected(){

    }
}
