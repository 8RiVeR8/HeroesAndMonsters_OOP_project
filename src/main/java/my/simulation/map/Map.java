package my.simulation.map;

import my.simulation.characters.Archer;
import my.simulation.characters.Characters;
import my.simulation.equipments.Good_boost;

import java.util.ArrayList;

public class Map {
    //Pododawać public private i protected!!
    int coordinate_x_y;
    ArrayList<ArrayList<Characters>> map = new ArrayList<>(coordinate_x_y);

    public ArrayList<ArrayList<Characters>> getMap(){
        return map;
    }

    public int map_coordinate(int x_y){
        this.coordinate_x_y=x_y;
        return coordinate_x_y;
    }

    public void map_nulling(){
        for(int i=0; i<coordinate_x_y; i++){
            map.add(new ArrayList<Characters>(coordinate_x_y));
            for(int j=0; j<coordinate_x_y; j++){
                map.get(i).add(null);
            }
        }
        this.map=map;
    }
    public void RandomObjectPlacing(int howManyArcher, int howManyBarbarian, int howManyDragon, int howManyGoblin, int howManyTank, int howManyKnight, int howMuchBadBoost, int howMuchGoodBoost){
        int i;
        i=0;
        while(i<howManyArcher){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Archer("Archer", rand_x, rand_y, 200, 25, 0, 30,200,false));
                //System.out.print("A ");
                i++;
            }
        }

        i=0;
        while(i<howManyKnight){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Archer("Knight", rand_x, rand_y, 200, 25, 0, 30,200, false));
                //System.out.print("K ");
                i++;
            }
        }

        i=0;
        while(i<howManyTank){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Archer("Tank", rand_x, rand_y, 200, 25, 0, 30,200, false));
                //System.out.print("T ");
                i++;
            }
        }

        i=0;
        while(i<howManyDragon){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Archer("Dragon", rand_x, rand_y, 200, 25, 0, 30,200,false));
                //System.out.print("D ");
                i++;
            }
        }

        i=0;
        while(i<howManyGoblin){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Archer("Goblin", rand_x, rand_y, 200, 25, 0, 30,200,false));
                //System.out.print("G ");
                i++;
            }
        }

        i=0;
        while(i<howManyBarbarian){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Archer("Barbarian", rand_x, rand_y, 200, 25, 0, 30,200,false));
                //System.out.print("B ");
                i++;
            }
        }

        i=0;
        while(i<howMuchGoodBoost){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Good_boost("Apple", rand_x, rand_y));
                //System.out.print("a ");
                i++;
            }
        }

        i=0;
        while(i<howMuchBadBoost){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Good_boost("Salmonella", rand_x, rand_y));
                i++;
            }
        }
    }

    public void map_drawing(){
        /*for (int i=0; i<coordinate_x_y+2; i++){
            System.out.print("‖︎");
            for(int j=0; j<coordinate_x_y; j++){
                if(i==0 || i==coordinate_x_y+1){
                    System.out.print("♛︎︎ ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("‖︎︎");
        }*/
        System.out.print("╔");
        for(int i=0; i<coordinate_x_y; i++){
            System.out.print("═══");
        }
        System.out.print("╗");
        System.out.println();

        for(int i=0; i<coordinate_x_y; i++){
            System.out.print("‖︎︎");
            for(int j=0; j<coordinate_x_y; j++){
                if(map.get(i).get(j)!=null){
                    if(map.get(i).get(j).name=="Archer"){
                        System.out.print(" A ");
                    }
                    if(map.get(i).get(j).name=="Tank"){
                        System.out.print(" T ");
                    }
                    if(map.get(i).get(j).name=="Knight"){
                        System.out.print(" K ");
                    }
                    if(map.get(i).get(j).name=="Goblin"){
                        System.out.print(" G ");
                    }
                    if(map.get(i).get(j).name=="Dragon"){
                        System.out.print(" D ");
                    }
                    if(map.get(i).get(j).name=="Barbarian"){
                        System.out.print(" B ");
                    }
                    if(map.get(i).get(j).sort=="Apple"){
                        System.out.print(" a ");
                    }
                    if(map.get(i).get(j).sort=="Salmonella"){
                        System.out.print(" s ");
                    }
                }else{
                    System.out.print("   ");
                }
            }
            System.out.print("‖︎︎");
            System.out.println();
        }
        System.out.print("╚");
        for(int i=0; i<coordinate_x_y; i++){
            System.out.print("═══");
        }
        System.out.print("╝");
        System.out.println();
    }
}
