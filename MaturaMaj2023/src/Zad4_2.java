import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Zad4_2 {
    public static void main(String[] args) {
        InputStream stream = Zad3_2.class.getClassLoader().getResourceAsStream("liczby.txt");
        Scanner scanner = new Scanner(stream);
        List<Integer> pierwsza = new ArrayList<>();
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            for (String l : split){
                pierwsza.add(Integer.valueOf(l));
            }
        }
        Comparator<Integer> comparator = Comparator.naturalOrder();
        Comparator<Integer> reversed = comparator.reversed();
        pierwsza.sort(reversed);
        System.out.println(pierwsza.get(100));
    }
}
