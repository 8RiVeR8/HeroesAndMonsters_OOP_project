package my.simulation;

import my.simulation.characters.Archer;
import my.simulation.characters.Characters;
import my.simulation.characters.Dragon;
import my.simulation.characters.Knight;
import my.simulation.map.Map;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Jest sobie użytkownik, który na początku wybiera rozmiar planszy
        Map map = new Map();
        int wielkosc_mapy;
        Scanner mapa = new Scanner(System.in);
        System.out.println("Enter size of the map: ");
        wielkosc_mapy=map.map_coordinate(mapa.nextInt());
        System.out.println(wielkosc_mapy+" x "+wielkosc_mapy);
        map.map_nulling();
        map.RandomObjectPlacing(3, 3, 3, 3, 3, 3, 3, 3);
        map.map_drawing();

        ArrayList<ArrayList<Characters>> list = map.getMap();
        for(int i=0; i<wielkosc_mapy; i++){
            for(int j=0; j<wielkosc_mapy; j++){
                if(list.get(i).get(j)!=null){
                    if(list.get(i).get(j).move==true){
                        list.get(i).get(j).move=false;
                        Random random = new Random();
                        Characters champ = list.get(i).get(j);
                        int randmove = random.nextInt(4);
                        switch (randmove){
                            case 0://stój w miejscu
                                break;
                            case 1://ruch w prawo
                                if(j + 1 > 10){//ściana
                                    list.get(i).remove(j - 1);
                                    list.get(i).add(j - 1,champ);
                                }
                                else {
                                    list.get(i).remove(j);
                                    list.get(i).add(j, null);
                                    list.get(i).remove(j + 1);
                                    list.get(i).add(j + 1, champ);
                                }
                                break;
                            case 2://ruch w lewo
                                if(j - 1 < 0){//ściana
                                    list.get(i).remove(j);
                                    list.get(i).add(j,null);
                                    list.get(i).remove(j + 1);
                                    list.get(i).add(j + 1,champ);
                                }
                                else {
                                    list.get(i).remove(j);
                                    list.get(i).add(j, null);
                                    list.get(i).remove(j - 1);
                                    list.get(i).add(j - 1, champ);
                                }
                                break;
                            case 3://ruch do góry
                                if(i - 1 < 0){//ściana
                                    list.get(i).remove(j);
                                    list.get(i).add(j,null);
                                    list.get(i + 1).remove(j);
                                    list.get(i + 1).add(j,champ);
                                }
                                else {
                                    list.get(i).remove(j);
                                    list.get(i).add(j, null);
                                    list.get(i - 1).remove(j);
                                    list.get(i - 1).add(j, champ);
                                }
                                break;
                            case 4://ruch w dół
                                if(i + 1 > 10){//ściana
                                    list.get(i).remove(j);
                                    list.get(i).add(j,null);
                                    list.get(i - 1).remove(j);
                                    list.get(i - 1).add(j,champ);
                                }
                                else {
                                    list.get(i).remove(j);
                                    list.get(i).add(j, null);
                                    list.get(i + 1).remove(j);
                                    list.get(i + 1).add(j, champ);
                                }
                                break;
                        }
                    }
                }
            }
        }
        map.map_drawing();
        //System.out.println(map.getMap());
    }
}