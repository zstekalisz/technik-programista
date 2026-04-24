package pl.zste;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3_2 {
    public static void main(String[] args) {
        //podpunktA();
        podpunktB();
    }

    public static void podpunktA(){
        InputStream stream = Zad3_2.class.getClassLoader().getResourceAsStream("dron.txt");
        Scanner scanner = new Scanner(stream);
        int x = 0;
        int y = 0;
        List<Punkt> punkty = new ArrayList<>();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            Integer v1 = Integer.valueOf(split[0]);
            Integer v2 = Integer.valueOf(split[1]);
            x = x+v1;
            y = y+v2;
            Punkt punkt = new Punkt(x, y);
            punkty.add(punkt);
        }
        int licznik = 0;
        for (Punkt p : punkty){
            if (p.x>0 && p.x<5000 && p.y>0 && p.y<5000){
                licznik++;
            }
        }
        System.out.println(licznik);
    }
    public static void podpunktB(){
        InputStream stream = Zad3_2.class.getClassLoader().getResourceAsStream("dron.txt");
        Scanner scanner = new Scanner(stream);
        int x = 0;
        int y = 0;
        List<Punkt> punkty = new ArrayList<>();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            Integer v1 = Integer.valueOf(split[0]);
            Integer v2 = Integer.valueOf(split[1]);
            x = x+v1;
            y = y+v2;
            Punkt punkt = new Punkt(x, y);
            punkty.add(punkt);
        }
        List<Srodek> srodki = new ArrayList<>();
        for (int i = 0; i< punkty.size(); i++){
            Punkt p1 = punkty.get(i);
            for(int j = i+1; j< punkty.size(); j++){
                Punkt p2 = punkty.get(j);
                Srodek srodek = new Srodek(p1, p2);
                srodki.add(srodek);
            }
        }
        srodki.forEach(s->{
            punkty.forEach(punkt -> {
                if(s.x == punkt.x && s.y == punkt.y){
                    System.out.println(s);
                }
            });
        });
    }
}
