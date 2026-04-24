import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Zad3_2 {
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
        Set<Integer> bezPowtorzen = new HashSet<>(liczby);
        int max = 100;
        int iloscMax = 100;
        for (Integer i : bezPowtorzen){
            int ileRazy = 0;
            for (Integer j : liczby){
                if(i.equals(j)){
                    ileRazy++;
                }
            }
            if(ileRazy<iloscMax){
                max = i;
                iloscMax = ileRazy;
            }
        }
        System.out.println("Max dla "+max+ " wynosi "+iloscMax+" razy");
    }
}
