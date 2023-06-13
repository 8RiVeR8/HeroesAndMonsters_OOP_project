package my.simulation.equipments;

import my.simulation.characters.Characters;
import my.simulation.map.Dependence;

public abstract class Boost extends Characters{
    public int get_X(){
        return coordinate_x;
    }
    public int gwt_Y(){
        return coordinate_y;
    }
}
