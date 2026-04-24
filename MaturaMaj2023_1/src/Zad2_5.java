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
        Scanner scanner = new Scanner(stream);
        List<String> toWrite = new ArrayList<>();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] split = line.split("");
            int potega = split.length-1;
            int liczba = 0;
            for(String bit : split){
                int i = Integer.parseInt(bit);
                if(i>0){
                    int skladowa = (int)Math.pow(2, potega);
                    liczba = liczba + skladowa;
                }
                potega--;
            }
            int pol = liczba/2;
            int wynik = liczba^pol;
            toWrite.add(Integer.toBinaryString(wynik));


        }
        Path path = Paths.get("res/wyniki2_5.txt");
        try {
            Files.write(path, toWrite);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
