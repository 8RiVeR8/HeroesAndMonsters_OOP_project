package my.simulation.equipments;

import my.simulation.map.Dependence;

public abstract class Boost implements Dependence {
    public String sort;
    public int coordinate_x;
    public int coordinate_y;
    public int getCoordinate_x(){
        return coordinate_x;
    }
    public int getCoordinate_y(){
        return coordinate_y;
    }
}
