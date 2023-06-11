package my.simulation.characters;

public class Tank extends Characters {
    public Tank(String name, int coordinate_x, int coordinate_y, int health, int strength, int kills, int critical_damage, int maxHealth, boolean move, int tier){
        this.name=name;
        this.maxHealt=maxHealth;
        this.move=move;
        this.coordinate_x=coordinate_x;
        this.coordinate_y=coordinate_y;
        this.health=health;
        this.strength=strength;
        this.kills=kills;
        this.critical_damage=critical_damage;
        this.tier=tier;
    }
    public void Attack(){

    }
    public void Healt(){

    }
    public void collected(){

    }
    public void getHit(){

    }
    public void Position(){

    }
}
