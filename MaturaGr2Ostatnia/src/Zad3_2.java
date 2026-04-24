import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3_2 {

    public static void main(String[] args) {
        InputStream stream = Zad3_1.class.getClassLoader().getResourceAsStream("pi.txt");
        Scanner sc = new Scanner(stream);
        List<Integer> pi = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            pi.add(Integer.parseInt(line));
        }
        List<Integer> blocks = new ArrayList<>();
        for (int i = 0; i< pi.size()-1;i++){
            int liczba = pi.get(i)*10 + pi.get(i+1);
            blocks.add(liczba);
        }
        int maxBlock = 0;
        int liczbaWystapien = 0;
        for (int i = 0; i<100; i++){
            int wystapienie =0;
            for (Integer b : blocks){
                if(b.equals(i)){
                    wystapienie++;
                }
            }
        }
    }
}
