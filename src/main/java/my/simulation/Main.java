package my.simulation;

import my.simulation.map.Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Jest sobie użytkownik, który na początku wybiera rozmiar planszy
        Map map = new Map();
        int wielkosc_mapy;
        Scanner mapa = new Scanner(System.in);
        System.out.println("Enter size of the map: ");
        wielkosc_mapy=map.map_coordinate(mapa.nextInt());
        System.out.println(wielkosc_mapy);
        map.map_nulling();
        map.map_drawing();
    }
}