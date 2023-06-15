package my.simulation.equipments;
/**
 * The Bad_boost class represents a type of negative boost equipment in the simulation.
 * It extends the Boost class.
 */

public class Bad_boost extends Boost{
    /**
     * Constructs a new Bad_boost object with the specified attributes.
     *
     * @param sort           The type or category of the bad boost.
     * @param coordinates_x  The X coordinate of the bad boost's position.
     * @param coordinates_y  The Y coordinate of the bad boost's position.
     */
    public Bad_boost(String sort, int coordinates_x, int coordinates_y){
        setName(sort);
        this.coordinate_x=coordinates_x;
        this.coordinate_y=coordinates_y;
    }
}
