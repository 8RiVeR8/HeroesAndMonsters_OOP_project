package my.simulation.characters;

import my.simulation.map.Dependence;

public abstract class Characters implements Dependence {
    //Pododawać public private i protected!!
    public int strength;
    public int coordinate_x;
    public int coordinate_y;
    public int health;
    public int kills;
    public int critical_damage = 2*strength;

    public String name;
    public int maxHealt;
    public boolean move;
    public int tier;

    @Override
    public int getX(){
        return coordinate_x;
    }

    @Override
    public int getY(){
        return coordinate_y;
    }

    @Override
    public void freshIndex(int new_Y, int new_X){
        this.coordinate_x=new_X;
        this.coordinate_y=new_Y;
    }

}
