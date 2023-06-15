package my.simulation.equipments;

import my.simulation.characters.Characters;
import my.simulation.map.Dependence;
/**
 * The Boost class represents an abstract base class for boost equipment in the simulation.
 * It extends the Characters class and implements the Dependence interface.
 */

public abstract class Boost extends Characters{
    /**
     * Returns the X coordinate of the boost's position.
     *
     * @return The X coordinate of the boost's position.
     */
    public int get_X(){
        return coordinate_x;
    }

    /**
     * Returns the Y coordinate of the boost's position.
     *
     * @return The Y coordinate of the boost's position.
     */
    public int get_Y(){
        return coordinate_y;
    }
}
