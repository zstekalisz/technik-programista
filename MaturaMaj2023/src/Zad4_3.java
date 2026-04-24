import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Zad4_3 {
    public static void main(String[] args) {
        InputStream stream = Zad3_2.class.getClassLoader().getResourceAsStream("liczby.txt");
        Scanner scanner = new Scanner(stream);
        List<Integer> pierwsza = new ArrayList<>();
        List<Integer> druga = new ArrayList<>();
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            for (String l : split){
                pierwsza.add(Integer.valueOf(l));
            }
        }
        Comparator<Integer> comparator = Comparator.naturalOrder();
        pierwsza.sort(comparator);
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            for (String l : split){
                druga.add(Integer.valueOf(l));
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Integer liczba : druga){
            int l = liczba;
            for (int i = 0; i< pierwsza.size(); i++){
                if(l==1){
                    result.add(liczba);
                    break;
                }else{
                    if(l%pierwsza.get(i)==0){
                        l = l/pierwsza.get(i);
                    }
                }
            }

        }
        result.forEach(System.out::println);
    }
}
