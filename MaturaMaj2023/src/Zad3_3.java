import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3_3 {


    public static void main(String[] args) {
        InputStream stream = Zad3_2.class.getClassLoader().getResourceAsStream("skrot2.txt");
        Scanner scanner = new Scanner(stream);
        List<Long> result = new ArrayList<>();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            Long liczba = Long.valueOf(line);
            long skrot = Zad3_1.obliczM(liczba);
            if(skrot!=-1L){
                if(nwd(liczba, skrot)==7L){
                    result.add(liczba);
                }

            }
        }
        result.forEach(System.out::println);

    }

    public static long nwd(long liczba, long skrot){
        while (liczba!=skrot){
            if(liczba>skrot){
                liczba = liczba-skrot;
            }else {
                skrot = skrot - liczba;
            }
        }
        return liczba;
    }
}
