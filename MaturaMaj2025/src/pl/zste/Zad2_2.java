package pl.zste;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad2_2 {
    public static void main(String[] args) {
        InputStream stream = Zad2_1.class.getClassLoader().getResourceAsStream("symbole.txt");
        Scanner scanner = new Scanner(stream);
        List<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            list.add(line);
        }
        for (int i = 0; i < list.size()-2; i++) {
            List<String> trzyLinie = new ArrayList<>();
            trzyLinie.add(list.get(i));
            trzyLinie.add(list.get(i + 1));
            trzyLinie.add(list.get(i + 2));
            //TODO tutaj metoda która szuka kwadratów w 3 liniach
        }
    }

    public static List<ModelZadanie2_2> szukamKwadratow(List<String> trzyLine) {
        //szukamy *
        String[] linia1 = trzyLine.get(0).split("");
        String[] linia2 = trzyLine.get(1).split("");
        String[] linia3 = trzyLine.get(2).split("");
        for (int i = 0; i < 10; i++) {
            List<String> znaki = new ArrayList<>();
            znaki.add(linia1[i]);
            znaki.add(linia2[i]);
            znaki.add(linia3[i]);
            znaki.add(linia1[i+1]);
            znaki.add(linia2[i+1]);
            znaki.add(linia3[i+1]);
            znaki.add(linia1[i+2]);
            znaki.add(linia2[i+2]);
            znaki.add(linia3[i+2]);
            boolean gwiazdka = znaki.stream().allMatch(z -> z.equals("*"));
            if (gwiazdka) {
                ModelZadanie2_2 m = new ModelZadanie2_2();

            }

        }
        return null;
    }

}
