package my.simulation.characters;

public class Dragon extends Atributes_enemies {
    public Dragon(String name, int speed, int range, int coordinate_x, int coordinate_y, int health, int strength){
        super(name, speed, range, coordinate_x, coordinate_y, health, strength);
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
