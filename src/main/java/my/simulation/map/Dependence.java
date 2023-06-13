package my.simulation.map;

public interface Dependence {
    default void freshIndex(int new_Y, int new_X){
    }

    default int getX(){
        return 1;
    }

    default int getY(){
        return 1;
    }
}
