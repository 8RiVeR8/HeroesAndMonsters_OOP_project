package my.simulation.map;

import my.simulation.characters.*;
import my.simulation.equipments.Bad_boost;
import my.simulation.equipments.Good_boost;

import java.util.ArrayList;
import java.util.Random;

/**
 This class represents a character in the game scenario.
 Each character has a name, health, strength, and tier.
 The name identifies the character type, such as Archer, Barbarian, etc.
 Health indicates the character's remaining health points.
 Strength represents the character's combat power.
 Tier is a measure of the character's level or rank.
 The class includes methods for accessing and modifying these attributes.
 It also supports actions like setting a character's position on the map and updating the character's status.
 Overall, this class encapsulates the properties and behaviors of a character in the game scenario.
 */
public class Map {
    private int amountOfArchers=0;
    private int amountOfBarbarians=0;
    private int amountOfDragons=0;
    private int amountOfGoblins=0;
    private int amountOfKnights=0;
    private int amountOfTanks=0;
    private int amountOfGoodBoosts=0;
    private int amountOfBadBoosts=0;
    private int amountOfBoosts=0;
    private int deadArchers=0;
    private int deadBarbarians=0;
    private int deadDragons=0;
    private int deadGoblins=0;
    private int deadKnights=0;
    private int deadTanks=0;
    private int coordinate_x_y;
    ArrayList<ArrayList<Characters>> map = new ArrayList<>(coordinate_x_y);


    /**
     Retrieves the current map configuration.
     @return The map, represented as a two-dimensional ArrayList of Characters.
     */
    public ArrayList<ArrayList<Characters>> getMap(){
        return map;
    }



    /**
     Sets the size of the map grid based on the given coordinate value.
     This method updates the size of the map grid to match the specified coordinate value.
     @param x_y The coordinate value representing the size of the map grid.
     @return The updated coordinate value after setting the map size.
     */
    public int map_coordinate(int x_y){
        this.coordinate_x_y=x_y;
        return coordinate_x_y;
    }


    /**

     Initializes the map grid by setting all elements to null.
     This method fills the map grid with null values for each coordinate.
     */
    public void map_nulling(){
        for(int i=0; i<coordinate_x_y; i++){
            map.add(new ArrayList<Characters>(coordinate_x_y));
            for(int j=0; j<coordinate_x_y; j++){
                map.get(i).add(null);
            }
        }
        this.map=map;
    }


    /**

     Randomly places characters and boosts on the map grid.
     This method randomly places a specified number of characters and boosts on the map grid.
     @param howManyArcher The number of Archer characters to place on the map.
     @param howManyBarbarian The number of Barbarian characters to place on the map.
     @param howManyDragon The number of Dragon characters to place on the map.
     @param howManyGoblin The number of Goblin characters to place on the map.
     @param howManyTank The number of Tank characters to place on the map.
     @param howManyKnight The number of Knight characters to place on the map.
     @param howMuchBadBoost The number of Bad Boosts to place on the map.
     @param howMuchGoodBoost The number of Good Boosts to place on the map.
     */
    public void RandomObjectPlacing(int howManyArcher, int howManyBarbarian, int howManyDragon, int howManyGoblin, int howManyTank, int howManyKnight, int howMuchBadBoost, int howMuchGoodBoost){
        this.amountOfArchers=howManyArcher;
        this.amountOfBarbarians=howManyBarbarian;
        this.amountOfDragons=howManyDragon;
        this.amountOfGoblins=howManyGoblin;
        this.amountOfKnights=howManyKnight;
        this.amountOfTanks=howManyTank;
        this.amountOfGoodBoosts=howMuchGoodBoost;
        this.amountOfBadBoosts=howMuchBadBoost;
        this.amountOfBoosts=howMuchGoodBoost+howMuchBadBoost;

        int i;
        i=0;
        while(i<howManyArcher){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Archer("Archer", rand_y, rand_x, 150, 30, 0, 30,150,true ,1));
                i++;
            }
        }

        i=0;
        while(i<howManyKnight){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Knight("Knight", rand_y, rand_x, 200, 35, 0, 30,200, true, 1));
                i++;
            }
        }

        i=0;
        while(i<howManyTank){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Tank("Tank", rand_y, rand_x, 250, 35, 0, 30,250, true, 1));
                i++;
            }
        }

        i=0;
        while(i<howManyDragon){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Dragon("Dragon", rand_y, rand_x, 175, 40, 0, 30,175,true, 1));
                i++;
            }
        }

        i=0;
        while(i<howManyGoblin){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Goblin("Goblin", rand_y, rand_x, 100, 50, 0, 30,100,true, 1));
                i++;
            }
        }

        i=0;
        while(i<howManyBarbarian){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Barbarian("Barbarian", rand_y, rand_x, 150, 45, 0, 30,150,true, 1));
                i++;
            }
        }

        i=0;
        while(i<howMuchGoodBoost){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Good_boost("Apple", rand_y, rand_x));
                i++;
            }
        }

        i=0;
        while(i<howMuchBadBoost){
            int rand_x = (int) (Math.random()*(coordinate_x_y));
            int rand_y = (int) (Math.random()*(coordinate_x_y));
            if(map.get(rand_x).get(rand_y)==null){
                map.get(rand_x).set(rand_y, new Bad_boost("Salmonella", rand_y, rand_x));
                i++;
            }
        }
    }

/**

 Draws the map grid with characters and boosts.
 This method prints the map grid with characters and boosts represented by specific symbols and colors.
 Characters are represented by their initials (A, B, D, G, K, T), and boosts are represented by lowercase letters (a, s).
 The colors used for characters and boosts are as follows:
 Archer: Green
 Barbarian: Blue
 Dragon: Yellow
 Goblin: Purple
 Knight: Cyan
 Tank: Red
 Apple (Good Boost): Light Yellow
 Salmonella (Bad Boost): Light Purple
 */
    public void map_drawing(){
        System.out.print("*");
        for(int i=0; i<coordinate_x_y; i++){
            System.out.print(" * ");
        }
        System.out.print("*");
        System.out.println();

        for(ArrayList<Characters> characters : map){
            System.out.print("*");
            for(Characters character : characters){
                if(character != null){
                    switch (character.getName()) {
                        case "Archer":
                            System.out.print("\u001B[32m A \u001B[0m");
                            break;
                        case "Barbarian":
                            System.out.print("\u001B[34m B \u001B[0m");
                            break;
                        case "Dragon":
                            System.out.print("\u001B[33m D \u001B[0m");
                            break;
                        case "Goblin":
                            System.out.print("\u001B[35m G \u001B[0m");
                            break;
                        case "Knight":
                            System.out.print("\u001B[36m K \u001B[0m");
                            break;
                        case "Tank":
                            System.out.print("\u001B[31m T \u001B[0m");
                            break;
                        case "Apple":
                            System.out.print("\u001B[93m a \u001B[0m");
                            break;
                        case "Salmonella":
                            System.out.print("\u001B[95m s \u001B[0m");
                            break;
                    }
                }else{
                    System.out.print("   ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.print("*");
        for(int i=0; i<coordinate_x_y; i++){
            System.out.print(" * ");
        }
        System.out.print("*");
        System.out.println();
    }

/**

 Executes a cycle of movement for characters on the map.
 This method iterates through the map and performs movement for each character that is eligible to move.
 Characters can move in four directions: right, left, up, and down, based on a random selection.
 If a character encounters an obstacle (wall) or another character during movement, a corresponding action is performed.
 After the cycle is completed, the movement status is updated for each character.
 */
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
                    switch (map.get(i).get(j).getName()){
                        case "Archer", "Barbarian", "Dragon", "Goblin", "Knight", "Tank":
                                map.get(i).get(j).move = true;
                            break;
                        case "Apple", "Salmonella":
                            map.get(i).get(j).move = false;
                            break;
                    }
                }
            }
        }

    }

    /**
     Prints the statistics of various units and boosts in the game.
     The statistics include the number of archers, barbarians, dragons,
     goblins, knights, tanks, boosts, good boosts, and bad boosts.
     The number of dead units for each type is also displayed.
     The statistics are displayed in different colors for better readability.
     */
    public void statisticts(){
        System.out.println("\u001B[32mArchers\u001B[37m: "+"\u001B[97m"+amountOfArchers+"\t \u001B[91mDeads: "+"\u001B[33m"+deadArchers);
        System.out.println("\u001B[34mBarbarians\u001B[37m: "+"\u001B[97m"+amountOfBarbarians+"\t \u001B[91mDeads: "+"\u001B[33m"+deadBarbarians);
        System.out.println("\u001B[33mDragons\u001B[37m: "+"\u001B[97m"+amountOfDragons+"\t \u001B[91mDeads: "+"\u001B[33m"+deadDragons);
        System.out.println("\u001B[35mGoblins\u001B[37m: "+"\u001B[97m"+amountOfGoblins+"\t \u001B[91mDeads: "+"\u001B[33m"+deadGoblins);
        System.out.println("\u001B[36mKnights\u001B[37m: "+"\u001B[97m"+amountOfKnights+"\t \u001B[91mDeads: "+"\u001B[33m"+deadKnights);
        System.out.println("\u001B[31mTanks\u001B[37m: "+"\u001B[97m"+amountOfTanks+"\t \u001B[91mDeads: "+"\u001B[33m"+deadTanks);
        System.out.println("\u001B[39mBoosts\u001B[93m: "+"\u001B[97m"+amountOfBoosts+"\u001B[32m Good boosts\u001B[37m: "+amountOfGoodBoosts+"\u001B[95m Bad boosts\u001B[37m: "+amountOfBadBoosts);
    }

    /**
     Performs an activity between two characters: a champion and a foe.
     The activity can involve combat or interaction with boosts.
     @param champ The champion character.
     @param foe The foe character.
     */
    private void activity(Characters champ, Characters foe){
        switch (foe.getName()){
            case "Archer", "Barbarian", "Dragon", "Goblin", "Knight", "Tank":
                if(champ.getName()==foe.getName()){
                    foe.setTier(foe.getTier()+1);
                }else{
                        while(foe.getHealth()>0 || champ.getHealth()>0){
                            foe.setHealth(foe.getHealth()-(champ.getStrength()*champ.getTier())/2);
                            if(foe.getHealth()<=0){
                                break;
                            }
                            champ.setHealth(champ.getHealth()-(foe.getStrength()*foe.getTier())/2);
                        }
                    if(champ.getHealth()>0){
                        delete(champ.coordinate_y, champ.coordinate_x);
                        champ.freshIndex(foe.coordinate_y, foe.coordinate_x);
                        delete(foe.coordinate_y, foe.coordinate_x);
                        map.get(foe.coordinate_y).set(foe.coordinate_x, champ);
                        switch (foe.getName()){
                            case "Archer":
                                amountOfArchers--;
                                deadArchers++;
                                break;
                            case "Barbarian":
                                amountOfBarbarians--;
                                deadBarbarians++;
                                break;
                            case "Dragon":
                                amountOfDragons--;
                                deadDragons++;
                                break;
                            case "Goblin":
                                amountOfGoblins--;
                                deadGoblins++;
                                break;
                            case "Knight":
                                amountOfKnights--;
                                deadKnights++;
                                break;
                            case "Tank":
                                amountOfTanks--;
                                deadTanks++;
                                break;
                        }
                    }else{
                        delete(foe.coordinate_y, foe.coordinate_x);
                        foe.freshIndex(champ.coordinate_y, champ.coordinate_x);
                        delete(champ.coordinate_y, champ.coordinate_x);
                        map.get(champ.coordinate_y).set(champ.coordinate_x, foe);
                        switch (champ.getName()){
                            case "Archer":
                                amountOfArchers--;
                                deadArchers++;
                                break;
                            case "Barbarian":
                                amountOfBarbarians--;
                                deadBarbarians++;
                                break;
                            case "Dragon":
                                amountOfDragons--;
                                deadDragons++;
                                break;
                            case "Goblin":
                                amountOfGoblins--;
                                deadGoblins++;
                                break;
                            case "Knight":
                                amountOfKnights--;
                                deadKnights++;
                                break;
                            case "Tank":
                                amountOfTanks--;
                                deadTanks++;
                                break;
                        }
                    }
                }
                break;
            case "Apple":
                champ.setHealth(champ.getMaxHealth());
                delete(champ.coordinate_y, champ.coordinate_x);
                champ.freshIndex(foe.coordinate_y, foe.coordinate_x);
                delete(foe.coordinate_y, foe.coordinate_x);
                map.get(foe.coordinate_y).set(foe.coordinate_x, champ);
                switch(foe.getName()){
                    case "Apple":
                        amountOfGoodBoosts--;
                        break;
                }
                break;

            case "Salmonella":
                champ.setHealth(0);
                delete(champ.coordinate_y, champ.coordinate_x);
                champ.freshIndex(foe.coordinate_y, foe.coordinate_x);
                delete(foe.coordinate_y, foe.coordinate_x);
                map.get(foe.coordinate_y).set(foe.coordinate_x, champ);
                if(champ.getHealth()<=0){
                    delete(champ.coordinate_y, champ.coordinate_x);
                    map.get(foe.coordinate_y).set(foe.coordinate_x, null);
                    switch (champ.getName()){
                        case "Archer":
                            amountOfArchers--;
                            deadArchers++;
                            break;
                        case "Barbarian":
                            amountOfBarbarians--;
                            deadBarbarians++;
                            break;
                        case "Dragon":
                            amountOfDragons--;
                            deadDragons++;
                            break;
                        case "Goblin":
                            amountOfGoblins--;
                            deadGoblins++;
                            break;
                        case "Knight":
                            amountOfKnights--;
                            deadKnights++;
                            break;
                        case "Tank":
                            amountOfTanks--;
                            deadTanks++;
                            break;
                    }
                }
                amountOfBadBoosts--;
                break;
        }
    }

    /**
     Deletes the character at the specified coordinates from the map.
     @param y The y-coordinate of the character's position.
     @param x The x-coordinate of the character's position.
     */
    private void delete(int y, int x){
        map.get(y).set(x, null);
    }

/**

 Checks if the game has ended by determining if any unit type has been completely eliminated.
 Prints the corresponding winner's message based on the remaining units.
 @return {@code false} if any unit type has been eliminated and prints the corresponding winner's message,
 */
    public boolean end(){
        if(amountOfArchers==0 && amountOfTanks==0 && amountOfKnights==0 && amountOfGoblins==0 && amountOfDragons==0){
            System.out.println();
            System.out.println("\u001B[42m\u001B[30m♛ Barbarians win ♛\u001B[37m");
            return false;
        }
        if(amountOfBarbarians==0 && amountOfTanks==0 && amountOfKnights==0 && amountOfGoblins==0 && amountOfDragons==0){
            System.out.println();
            System.out.println("\u001B[42m\u001B[30m♛ Archers win ♛\u001B[37m");
            return false;
        }
        if(amountOfBarbarians==0 && amountOfArchers==0 && amountOfKnights==0 && amountOfGoblins==0 && amountOfDragons==0){
            System.out.println();
            System.out.println("\u001B[42m\u001B[30m♛ Tanks win ♛\u001B[37m");
            return false;
        }
        if(amountOfBarbarians==0 && amountOfTanks==0 && amountOfArchers==0 && amountOfGoblins==0 && amountOfDragons==0){
            System.out.println();
            System.out.println("\u001B[42m\u001B[30m♛ Knights win ♛\u001B[37m");
            return false;
        }
        if(amountOfBarbarians==0 && amountOfTanks==0 && amountOfKnights==0 && amountOfArchers==0 && amountOfDragons==0){
            System.out.println();
            System.out.println("\u001B[42m\u001B[30m♛ Goblins win ♛\u001B[37m");
            return false;
        }
        if(amountOfBarbarians==0 && amountOfTanks==0 && amountOfKnights==0 && amountOfGoblins==0 && amountOfArchers==0){
            System.out.println();
            System.out.println("\u001B[42m\u001B[30m♛ Dragons win ♛\u001B[37m");
            return false;
        }
        return true;
    }
}
