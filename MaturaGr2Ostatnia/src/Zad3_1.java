import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3_1 {
    public static void main(String[] args) {
        InputStream stream = Zad3_1.class.getClassLoader().getResourceAsStream("pi.txt");
        Scanner sc = new Scanner(stream);
        List<Integer> pi = new ArrayList<>();
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            pi.add(Integer.parseInt(line));
        }
        int licznik = 0;
        for (int i = 0; i<pi.size()-1; i++){
            if(pi.get(i).equals(9) && pi.get(i+1)>0){
                licznik++;
            }
        }
        System.out.println(licznik);
    }
}
