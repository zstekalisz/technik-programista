import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad4_1 {
    public static void main(String[] args) {
        InputStream stream = Zad3_2.class.getClassLoader().getResourceAsStream("liczby.txt");
        Scanner scanner = new Scanner(stream);
        List<Integer> pierwsza = new ArrayList<>();
        List<Integer> druga = new ArrayList<>();
        int i = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            if(i==1){
                for (String l : split){
                    pierwsza.add(Integer.valueOf(l));
                }
                i++;
            }else {
                for (String l : split){
                    druga.add(Integer.valueOf(l));
                }
            }
        }
        int licznik = 0;
        for (Integer pierwszy : pierwsza){
            for (Integer drugi : druga){
                if(drugi%pierwszy==0){
                    licznik++;
                    break;
                }
            }
        }
        System.out.println(licznik);
    }
}
