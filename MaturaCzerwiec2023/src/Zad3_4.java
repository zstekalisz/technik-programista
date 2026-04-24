import java.io.InputStream;
import java.util.*;

public class Zad3_4 {
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
        int a = 0;
        for (Integer l : liczby){
            while (l>0){
                int reszta = l%10;
                if(reszta==0){
                    a++;
                    break;
                }
                l=l/10;
            }
        }
        System.out.println("Odpowiedź a :"+(liczby.size()-a));
        //********************* zadanie b
        int b = 0;
        int najwieksza = 0;
        for (Integer l : liczby){
            Set<Integer> zbior = new HashSet<>();
            while (l>0){
                int reszta = l%10;
                zbior.add(reszta);
                l=l/10;
            }
            int suma = 0;
            for (Integer i : zbior){
                suma+=i;
            }
            if(b<suma){
                b = suma;
                najwieksza = l;
            }
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(najwieksza);
    }
}
