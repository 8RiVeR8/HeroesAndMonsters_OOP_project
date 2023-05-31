package my.simulation.characters;

import my.simulation.map.Dependence;

public class Characters implements Dependence {
    //Pododawać public private i protected!!
    public int strength;
    public int speed;
    public String sort;
    public int range;
    public int coordinate_x;
    public int coordinate_y;
    public int health;
    public int deaths;
    public int kills;
    public int critical_damage = 2*strength;
    public int delay;
    public String name;
    public int maxHealt;
    public boolean move;

    public void Kills(){

    }
    public void Deaths(){

    }

}
