import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zad3_1 {
    public static void main(String[] args) {
        InputStream stream = Zad3_1.class.getClassLoader().getResourceAsStream("pi.txt");
        Scanner sc = new Scanner(stream);
        List<String> pi = new ArrayList<>();
        while (sc.hasNextLine()){
            pi.add(sc.nextLine());
        }
        List<Integer> liczby = new ArrayList<>();
        for (int i = 0; i<pi.size()-1; i++){
            String s = pi.get(i);
            s = s+pi.get(i+1);
            liczby.add(Integer.parseInt(s));
        }
        int size = liczby.stream()
                .filter(i -> i > 90)
                .collect(Collectors.toList()).size();
        System.out.println(size);
    }
}
