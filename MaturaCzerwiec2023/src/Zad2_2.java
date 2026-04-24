import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad2_2 {
    public static void main(String[] args) {
        InputStream stream = Zad2_2.class.getClassLoader().getResourceAsStream("slowa3.txt");
        Scanner scanner = new Scanner(stream);
        List<String> odczyt = new ArrayList<>();
        while (scanner.hasNextLine()){
            odczyt.add(scanner.nextLine());
        }
        String[] split = odczyt.get(2).split(" ");
        int k1 = Integer.parseInt(split[0]);
        int k2 = Integer.parseInt(split[1]);
        boolean b = Zad2_1.czyMniejszy(odczyt.get(1), k1, k2);
        System.out.println(b ? "TAK":"NIE");
    }
}
