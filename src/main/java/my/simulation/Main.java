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
        int a=0,b =0, g=0, t=0, k=0, gb=0, bb=0, d=0, suma=0;
        System.out.println("Hello and welcome in the simulation. \nIt is recommended to get smaller map if you want to end simulation faster.");
        System.out.println("There are 6 types of Heroes and monster.\nPlease enter their number");
        System.out.println("Number of Archers: ");
        a=mapa.nextInt();
        System.out.println("Number of Barbarians: ");
        b=mapa.nextInt();
        System.out.println("Number of Dragons: ");
        d=mapa.nextInt();
        System.out.println("Number of Goblins: ");
        g=mapa.nextInt();
        System.out.println("Number of Tanks: ");
        t=mapa.nextInt();
        System.out.println("Number of Knights: ");
        k=mapa.nextInt();
        System.out.println("Number of Apples: ");
        gb=mapa.nextInt();
        System.out.println("Number of Salmonella: ");
        bb=mapa.nextInt();
        System.out.println("Enter size of the map: ");
        wielkosc_mapy=map.map_coordinate(mapa.nextInt());
        suma=a+b+g+t+k+gb+bb+d;
        if(wielkosc_mapy*wielkosc_mapy<suma){
            System.out.println("You entered too many objects for to small map!");
        }else{
            if(a==0 && b==0 && d==0 && g==0 && t==0 && k==0){
                System.out.println("There is no objects that can move one the map\nThere is no winner!");
            }else{
                System.out.println(wielkosc_mapy+" x "+wielkosc_mapy);
                map.map_nulling();
                map.RandomObjectPlacing(a, b, d, g, t, k, bb, gb);
                map.map_drawing();
                map.statisticts();
                TimeUnit.SECONDS.sleep(1);
                while(map.end()){
                    map.cycle();
                    map.map_drawing();
                    map.statisticts();
                    TimeUnit.SECONDS.sleep(1);
                }
            }
        }
    }
}