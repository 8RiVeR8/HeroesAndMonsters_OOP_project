package my.simulation.map;

import my.simulation.characters.Characters;

import java.util.ArrayList;

public class Map {
    //Pododawać public private i protected!!
    int coordinate_x_y;
    ArrayList<ArrayList<Characters>> map = new ArrayList<>(coordinate_x_y);

    public int map_coordinate(int x_y){
        this.coordinate_x_y=x_y;
        return coordinate_x_y*coordinate_x_y;
    }

    public void map_nulling(){
        for(int i=0; i<coordinate_x_y; i++){
            map.add(new ArrayList<Characters>(coordinate_x_y));
            for(int j=0; j<coordinate_x_y; j++){
                map.get(i).add(null);
            }
        }
    }

    public void map_drawing(){
        for (int i=0; i<coordinate_x_y+2; i++){
            System.out.print("‖︎");
            for(int j=0; j<coordinate_x_y; j++){
                if(i==0 || i==coordinate_x_y+1){
                    System.out.print("♛︎︎ ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("‖︎︎");
        }
    }
}
