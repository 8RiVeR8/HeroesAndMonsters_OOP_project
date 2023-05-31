package my.simulation;

import my.simulation.characters.Archer;
import my.simulation.characters.Dragon;
import my.simulation.characters.Knight;
import my.simulation.map.Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Archer archer1 = new Archer("Archer", 5, 6, 100, 15, 0, 25, 1,false);
        //Knight knight1 = new Knight("Knight", 7, 6, 200, 20, 0, 25, 1,false);
        //Dragon dragon1 = new Dragon("Dragon", 3, 2, 150, 20, 0, 30, 1,false);
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
    }
}