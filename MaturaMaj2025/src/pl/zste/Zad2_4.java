package pl.zste;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad2_4 {
    public static void main(String[] args) {
        InputStream stream = Zad2_3.class.getClassLoader().getResourceAsStream("symbole_przyklad.txt");
        Scanner scanner = new Scanner(stream);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] split = line.split("");
            int potega = line.length()-1;
            int wynik = 0;
            for (String znak : split){
                if(znak.equals("o")){
                    potega--;
                }else if(znak.equals("+")){
                    int l = (int)Math.pow(3, potega);
                    wynik = wynik+l;
                    potega--;
                }else {
                    int l = (int)Math.pow(3, potega);
                    l = l * 2;
                    wynik = wynik+l;
                    potega--;
                }
            }
            list.add(wynik);
        }
        int suma = 0;
        for (Integer i : list){
            suma+=i;
        }
        System.out.println(suma);
        System.out.println(konwersja(suma));
    }

    public static String konwersja(int suma){
        StringBuilder builder = new StringBuilder();
        while (suma>0){
            int reszta = suma%3;
            builder.append(reszta);
            suma = suma/3;
        }
        String sysTrojkowy = builder.reverse().toString();
        sysTrojkowy = sysTrojkowy.replaceAll("0", "o");
        sysTrojkowy = sysTrojkowy.replaceAll("1", "+");
        sysTrojkowy = sysTrojkowy.replaceAll("2", "*");
        return sysTrojkowy;
    }

}
