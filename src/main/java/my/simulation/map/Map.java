package my.simulation.map;

import my.simulation.characters.*;
import my.simulation.equipments.Bad_boost;
import my.simulation.equipments.Good_boost;

import java.util.ArrayList;
import java.util.Random;

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
                map.get(rand_x).set(rand_y, new Archer("Archer", rand_x, rand_y, 200, 25, 0, 30,200,true ,1));
                //System.out.print("A ");
                i++;
            }
        }

        i=0;
        while(i<howManyKnight){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Knight("Knight", rand_x, rand_y, 200, 25, 0, 30,200, true, 1));
                //System.out.print("K ");
                i++;
            }
        }

        i=0;
        while(i<howManyTank){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Tank("Tank", rand_x, rand_y, 200, 25, 0, 30,200, true, 1));
                //System.out.print("T ");
                i++;
            }
        }

        i=0;
        while(i<howManyDragon){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Dragon("Dragon", rand_x, rand_y, 200, 25, 0, 30,200,true, 1));
                //System.out.print("D ");
                i++;
            }
        }

        i=0;
        while(i<howManyGoblin){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Goblin("Goblin", rand_x, rand_y, 200, 25, 0, 30,200,true, 1));
                //System.out.print("G ");
                i++;
            }
        }

        i=0;
        while(i<howManyBarbarian){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Barbarian("Barbarian", rand_x, rand_y, 200, 25, 0, 30,200,true, 1));
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
                map.get(rand_x).set(rand_y, new Bad_boost("Salmonella", rand_x, rand_y));
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
                    if(map.get(i).get(j).name=="Apple"){
                        System.out.print(" a ");
                    }
                    if(map.get(i).get(j).name=="Salmonella"){
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

    public void cycle(){
        for(int i=0; i<coordinate_x_y; i++){
            for(int j=0; j<coordinate_x_y; j++){
                if(map.get(i).get(j)!=null){
                    if(map.get(i).get(j).move==true){
                        map.get(i).get(j).move=false;
                        Random random = new Random();
                        Characters champ = map.get(i).get(j);
                        int randmove = random.nextInt(4);
                        Characters foe;
                        switch (randmove){
                            //case 0://stój w miejscu
                               // break;
                            case 0://ruch w prawo
                                if(j + 1 > coordinate_x_y-1){//ściana
                                    if((foe = map.get(i).get(j-1)) == null){
                                        champ.freshIndex(i,j-1);
                                        map.get(i).set(j, null);
                                        map.get(i).set(j-1,champ);
                                    }else{
                                        activity(champ, foe);
                                    }
                                }
                                else {
                                    if((foe = map.get(i).get(j+1)) == null){
                                        champ.freshIndex(i,j+1);
                                        map.get(i).set(j, null);
                                        map.get(i).set(j+1,champ);
                                    }else{
                                        activity(champ, foe);
                                    }
                                }
                                break;
                            case 1://ruch w lewo
                                if(j - 1 < 0) {//ściana
                                    if ((foe = map.get(i).get(j + 1)) == null) {
                                        champ.freshIndex(i, j + 1);
                                        map.get(i).set(j, null);
                                        map.get(i).set(j + 1, champ);
                                    } else {
                                        activity(champ, foe);
                                    }
                                }
                                else {
                                    if((foe = map.get(i).get(j-1)) == null){
                                        champ.freshIndex(i,j-1);
                                        map.get(i).set(j, null);
                                        map.get(i).set(j-1,champ);
                                    }else{
                                        activity(champ, foe);
                                    }
                                }
                                break;
                            case 2://ruch do góry
                                if(i - 1 < 0){//ściana
                                    if((foe = map.get(i+1).get(j)) == null){
                                        champ.freshIndex(i+1,j);
                                        map.get(i).set(j, null);
                                        map.get(i+1).set(j,champ);
                                    }else{
                                        activity(champ, foe);
                                    }
                                }
                                else {
                                    if((foe = map.get(i-1).get(j)) == null){
                                        champ.freshIndex(i-1,j);
                                        map.get(i).set(j, null);
                                        map.get(i-1).set(j,champ);
                                    }else{
                                        activity(champ, foe);
                                    }
                                }
                                break;
                            case 3://ruch w dół
                                if(i + 1 > coordinate_x_y-1){//ściana
                                    if((foe = map.get(i-1).get(j)) == null){
                                        champ.freshIndex(i-1,j);
                                        map.get(i).set(j, null);
                                        map.get(i-1).set(j,champ);
                                    }else{
                                        activity(champ, foe);
                                    }
                                }
                                else {
                                    if((foe = map.get(i+1).get(j)) == null){
                                        champ.freshIndex(i+1,j);
                                        map.get(i).set(j, null);
                                        map.get(i+1).set(j,champ);
                                    }else{
                                        activity(champ, foe);
                                    }
                                }
                                break;
                        }
                    }
                }
            }
        }

        for(int i=0; i<coordinate_x_y; i++){
            for(int j=0; j<coordinate_x_y; j++){
                if(map.get(i).get(j)!=null){
                    switch (map.get(i).get(j).name){
                        case "Archer", "Barbarian", "Dragon", "Goblin", "Knight", "Tank":
                            if(map.get(i).get(j).health >= (map.get(i).get(j).maxHealt / 3)) {
                                map.get(i).get(j).move = true;
                            }
                            break;
                        case "Apple", "Salmonella":
                            map.get(i).get(j).move = false;
                            break;
                    }
                    //map.get(i).get(j).move=true;
                }
            }
        }

    }

    public void statisticts(){

    }

    public void activity(Characters champ, Characters foe){
        switch (foe.name){
            case "Archer", "Barbarian", "Dragon", "Goblin", "Knight", "Tank":
                if(champ.name==foe.name){
                    champ.tier++;
                    foe.tier++;
                }else{
                    if(champ.tier>=foe.tier){
                        delete(foe.coordinate_y, foe.coordinate_x);
                        switch (foe.name){
                            case "Archer":
                                //dodać
                                break;
                            case "Barbarian":
                                //dodać
                                break;
                            case "Dragon":
                                //dodać
                                break;
                            case "Goblin":
                                //dodać
                                break;
                            case "Knight":
                                //dodać
                                break;
                            case "Tank":
                                //dodać
                                break;
                        }
                    }else{
                        delete(champ.coordinate_y, champ.coordinate_x);
                        switch (champ.name){
                            case "Archer":
                                //dodać
                                break;
                            case "Barbarian":
                                //dodać
                                break;
                            case "Dragon":
                                //dodać
                                break;
                            case "Goblin":
                                //dodać
                                break;
                            case "Knight":
                                //dodać
                                break;
                            case "Tank":
                                //dodać
                                break;
                        }
                    }
                }
                break;
            case "Apple", "Salmonella":
                delete(foe.coordinate_y, foe.coordinate_x);
                switch(foe.name){
                    case "Apple":
                        //dodać
                        break;
                    case "Salmonella":
                        //dodać
                        break;
                }
                break;
        }

    }

    public void delete(int y, int x){
        map.get(y).set(x, null);
    }
}
