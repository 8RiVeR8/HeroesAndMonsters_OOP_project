package my.simulation;

import my.simulation.characters.Archer;
import my.simulation.characters.Characters;
import my.simulation.characters.Dragon;
import my.simulation.characters.Knight;
import my.simulation.map.Map;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Jest sobie użytkownik, który na początku wybiera rozmiar planszy
        Map map = new Map();
        int wielkosc_mapy;
        Scanner mapa = new Scanner(System.in);
        System.out.println("Enter size of the map: ");
        wielkosc_mapy=map.map_coordinate(mapa.nextInt());
        System.out.println(wielkosc_mapy+" x "+wielkosc_mapy);
        map.map_nulling();
        map.RandomObjectPlacing(3, 3, 3, 3, 3, 3, 3, 3);
        //map.map_drawing();

        //ArrayList<ArrayList<Characters>> list = map.getMap();
        //map.map_drawing();
        //System.out.println(map.getMap());

        while(true){
            map.cycle();
            map.map_drawing();

            TimeUnit.SECONDS.sleep(1);
        }
    }
}