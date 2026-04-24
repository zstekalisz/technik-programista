package pl.zste;

import java.io.InputStream;
import java.util.*;

public class Zad2_3 {
    public static void main(String[] args) {
        InputStream stream = Zad2_3.class.getClassLoader().getResourceAsStream("symbole_przyklad.txt");
        Scanner scanner = new Scanner(stream);
        List<Integer> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
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
            list2.add(line);
        }
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
        if(max.isPresent()){
            Integer maxInt = max.get();
            System.out.println(maxInt);
            int index = list.indexOf(maxInt);
            System.out.println(list2.get(index));
        }
    }
}
