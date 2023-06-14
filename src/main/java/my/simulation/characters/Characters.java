package my.simulation.characters;

import my.simulation.map.Dependence;

public abstract class Characters implements Dependence {
    private int strength;
    public int coordinate_x;
    public int coordinate_y;
    private int health;
    public int kills;
    public int critical_damage = 2*strength;

    private String name;
    private int maxHealt;
    public boolean move;
    private int tier;

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

    @Override
    public int getHealth(){
        return health;
    }

    @Override
    public int getMaxHealth(){
        return maxHealt;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getStrength(){
        return strength;
    }

    public int getTier(){
        return tier;
    }

    public void setStrength(int strength){
        this.strength=strength;
    }

    public void setHealth(int health){
        this.health=health;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setMaxHealt(int maxHealt){
        this.maxHealt=maxHealt;
    }

    public void setTier(int tier){
        this.tier=tier;
    }
}
