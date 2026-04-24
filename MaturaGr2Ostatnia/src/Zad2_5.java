import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad2_5 {
    public static void main(String[] args) {
        InputStream stream = Zad2_5.class.getClassLoader().getResourceAsStream("bin.txt");
        Scanner sc = new Scanner(stream);
        List<String> results = new ArrayList<>();
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] split = line.split("");
            int p = 0;
            int potega = split.length-1;
            for (String bit : split){
                if(bit.equals("0")){
                    potega--;
                    continue;
                }
                int pow = (int)Math.pow(2, potega);
                p += pow;
                potega--;
            }
            int polowa = p/2;
            int wynik = p^polowa;
            String binary = Integer.toBinaryString(wynik);
            results.add(binary);
        }
        Path path = Paths.get("res/wyniki2_5.txt");
        try {
            Files.write(path, results);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
