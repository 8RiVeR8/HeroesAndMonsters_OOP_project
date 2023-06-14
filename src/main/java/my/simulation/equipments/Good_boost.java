package my.simulation.equipments;

import my.simulation.map.Dependence;

public class Good_boost extends Boost{
    public Good_boost(String sort, int coordinate_x, int coordinate_y){
        setName(sort);
        this.coordinate_x=coordinate_x;
        this.coordinate_y=coordinate_y;
    }
}
