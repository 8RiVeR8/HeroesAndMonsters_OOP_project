package my.simulation.characters;

public class Characters {
    //Pododawać public private i protected!!
    private int strength;
    private int speed;
    private int range;
    private int coordinate_x;
    private int coordinate_y;
    private int health;
    private int deaths;
    private int kills;
    private int critical_damage = 2*strength;
    private int delay;
    private String name;

    public Characters(String name, int coordinate_x, int coordinate_y, int health, int strength, int kills, int critical_damage, int delay, int range, int speed){
        this.name=name;
        this.speed=speed;
        this.range=range;
        this.coordinate_x=coordinate_x;
        this.coordinate_y=coordinate_y;
        this.health=health;
        this.strength=strength;
        this.kills=kills;
        this.critical_damage=critical_damage;
        this.delay=delay;
    }
    public void Kills(){

    }
    public void Deaths(){

    }

}
