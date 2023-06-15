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

    /**
     * Retrieves the X coordinate of the character.
     *
     * @return The X coordinate.
     */
    @Override
    public int getX(){
        return coordinate_x;
    }

    /**
     * Retrieves the Y coordinate of the character.
     *
     * @return The Y coordinate.
     */
    @Override
    public int getY(){
        return coordinate_y;
    }

    /**
     * Updates the character's coordinates.
     *
     * @param new_Y The new Y coordinate.
     * @param new_X The new X coordinate.
     */
    @Override
    public void freshIndex(int new_Y, int new_X){
        this.coordinate_x=new_X;
        this.coordinate_y=new_Y;
    }

    /**
     * Retrieves the character's current health.
     *
     * @return The health value.
     */
    @Override
    public int getHealth(){
        return health;
    }

    /**
     * Retrieves the character's maximum health.
     *
     * @return The maximum health value.
     */
    @Override
    public int getMaxHealth(){
        return maxHealt;
    }

    /**
     * Retrieves the character's name.
     *
     * @return The name of the character.
     */
    @Override
    public String getName(){
        return name;
    }

    /**
     * Retrieves the character's strength value.
     *
     * @return The strength value.
     */
    @Override
    public int getStrength(){
        return strength;
    }

    /**
     * Retrieves the character's tier.
     *
     * @return The tier value.
     */
    public int getTier(){
        return tier;
    }

    /**
     * Sets the strength value of the character.
     *
     * @param strength The new strength value.
     */
    public void setStrength(int strength){
        this.strength=strength;
    }

    /**
     * Sets the health value of the character.
     *
     * @param health The new health value.
     */
    public void setHealth(int health){
        this.health=health;
    }

    /**
     * Sets the name of the character.
     *
     * @param name The new name.
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * Sets the maximum health value of the character.
     *
     * @param maxHealt The new maximum health value.
     */
    public void setMaxHealt(int maxHealt){
        this.maxHealt=maxHealt;
    }

    /**
     * Sets the tier value of the character.
     *
     * @param tier The new tier value.
     */
    public void setTier(int tier){
        this.tier=tier;
    }
}
