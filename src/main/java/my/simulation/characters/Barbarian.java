package my.simulation.characters;

public class Barbarian extends Characters {
    public Barbarian(String name, int coordinate_x, int coordinate_y, int health, int strength, int kills, int critical_damage, int delay, int range, int speed){
        super(name, coordinate_x, coordinate_y, health, strength, kills, critical_damage, delay, range, speed);
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
