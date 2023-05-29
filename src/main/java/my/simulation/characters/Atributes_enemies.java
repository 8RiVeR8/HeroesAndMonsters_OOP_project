package my.simulation.characters;

public class Atributes_enemies {
    //Pododawać public private i protected!!
    private int strength;
    private int speed;
    private int range;
    private int coordinate_x;
    private int coordinate_y;
    private int health;
    private String name;

    public Atributes_enemies(String name, int speed, int range, int coordinate_x, int coordinate_y, int health, int strength){
        this.name=name;
        this.speed=speed;
        this.range=range;
        this.coordinate_x=coordinate_x;
        this.coordinate_y=coordinate_y;
        this.health=health;
        this.strength=strength;
    }
}
