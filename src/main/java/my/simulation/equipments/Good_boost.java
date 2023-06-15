package my.simulation.equipments;

import my.simulation.map.Dependence;
/**
 * The Good_boost class represents a type of positive boost equipment in the simulation.
 * It extends the Boost class.
 */

public class Good_boost extends Boost{
    /**
     * Constructs a new Good_boost object with the specified attributes.
     *
     * @param sort           The type or category of the good boost.
     * @param coordinate_x   The X coordinate of the good boost's position.
     * @param coordinate_y   The Y coordinate of the good boost's position.
     */
    public Good_boost(String sort, int coordinate_x, int coordinate_y){
        setName(sort);
        this.coordinate_x=coordinate_x;
        this.coordinate_y=coordinate_y;
    }
}
