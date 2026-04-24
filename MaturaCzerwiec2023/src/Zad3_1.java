import java.io.InputStream;
import java.util.Scanner;

public class Zad3_1 {
    public static void main(String[] args) {
        InputStream stream = Zad3_1.class.getClassLoader().getResourceAsStream("anagram.txt");
        Scanner scanner = new Scanner(stream);
        int rowne = 0;
        int prawie = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] split = line.split("");
            int licznikZero = 0;
            int licznikJeden = 0;
            for (String s : split){
                if (s.equals("0")) licznikZero++;
                if (s.equals("1")) licznikJeden++;
            }
            if(licznikZero==licznikJeden){
                rowne++;
            }
            if(Math.abs(licznikZero-licznikJeden)==1){
                prawie++;
            }
        }
        System.out.println("Rowne "+rowne);
        System.out.println("Prawie rowne "+prawie);
    }
}