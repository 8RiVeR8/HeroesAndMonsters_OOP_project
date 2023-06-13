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

    default int getHealth(){
        return 1;
    }

    default int getMaxHealth(){
        return 1;
    }

    default String getName(){
        return null;
    }

     default int getStrength(){
        return 1;
    }
}
