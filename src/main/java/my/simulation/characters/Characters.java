package my.simulation.characters;

import my.simulation.map.Dependence;

public abstract class Characters implements Dependence {
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
    public int tier;

    public int getX(){
        return coordinate_x;
    }

    public int getY(){
        return coordinate_y;
    }

    public void freshIndex(int new_X, int new_Y){
        this.coordinate_x=new_X;
        this.coordinate_y=new_Y;
    }

}
