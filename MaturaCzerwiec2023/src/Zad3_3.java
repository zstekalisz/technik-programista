import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3_3 {
    public static void main(String[] args) {
        InputStream stream = Zad3_1.class.getClassLoader().getResourceAsStream("anagram.txt");
        Scanner scanner = new Scanner(stream);
        int rowne = 0;
        int prawie = 0;
        List<Integer> liczby = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int i = Integer.parseInt(line, 2);
            liczby.add(i);
        }
        List<Integer> absy = new ArrayList<>();
        for (int i = 0; i < liczby.size()-1; i++) {
            Integer pierwsza = liczby.get(i);
            Integer druga = liczby.get(i+1);
            int abs = Math.abs(pierwsza - druga);
            absy.add(abs);
        }
        absy.stream()
                .max(Integer::compare)
                .ifPresent(i-> System.out.println(Integer.toBinaryString(i)));
    }
}
