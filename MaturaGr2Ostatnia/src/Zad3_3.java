import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3_3 {
    public static void main(String[] args) {
        InputStream stream = Zad3_1.class.getClassLoader().getResourceAsStream("pi.txt");
        Scanner sc = new Scanner(stream);
        List<Integer> pi = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            pi.add(Integer.parseInt(line));
        }
        List<String> results = new ArrayList<>();
        for (int i = 0; i< pi.size()-6; i++){
            int previous = -1;
            StringBuilder b = new StringBuilder();
            boolean przelamanie = true;
            for (int j = i; j<i+6; j++){
                if(i==j){
                    previous = pi.get(j);
                    b.append(previous);
                    continue;
                }
                int current = pi.get(j);
                if(i+1 == j && current<=previous){
                    break;
                }
                if(!przelamanie && current>=previous){
                    break;
                }
                if(previous>=current && przelamanie){
                    if(current==previous && j==i+5){
                        break;
                    }
                    przelamanie = false;
                }



                b.append(current);
                previous = current;
            }
            String s = b.toString();
            if(s.length()==6){
                results.add(s);
            }
        }
        results.forEach(System.out::println);
        System.out.println(results.size());

    }
}
