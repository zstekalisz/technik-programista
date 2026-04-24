import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zad4_4 {
    public static void main(String[] args) {
        InputStream stream = Zad4_4.class.getClassLoader().getResourceAsStream("liczby_przyklad.txt");
        Scanner scanner = new Scanner(stream);
        List<Integer> pierwsza = new ArrayList<>();
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            for (String l : split){
                pierwsza.add(Integer.valueOf(l));
            }
        }
        //liczymy srednia
        int suma1 = 0;
        for (int i = 5; i<5+50; i++){
            suma1+=pierwsza.get(i);
        }
        System.out.println("Srednia = "+suma1/50D);

        List<Srednia> wyniki = new ArrayList<>();
        for (int i = 0; i< pierwsza.size()-50; i++){
            //liczymy srednią dla pierwszej 50-tki
            int suma = 0;
            for (int j = i; j<i+50; j++){
                suma+= pierwsza.get(j);
            }
            Srednia srednia = new Srednia(suma, 50D, i);
            wyniki.add(srednia);
            for (int j = i+50; j<pierwsza.size();j++){
                int kolejny = pierwsza.get(j);
                Srednia nastepna = new Srednia(srednia, kolejny);
                wyniki.add(nastepna);
                srednia = nastepna;
            }
        }
        wyniki.stream()
                .max((a,b)-> a.compareTo(b))
                .ifPresent(s->{
                    System.out.println(s);
                    System.out.println("Liczba to :" + pierwsza.get(s.i));
                });
    }
}
