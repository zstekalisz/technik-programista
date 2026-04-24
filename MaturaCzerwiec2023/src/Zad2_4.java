import java.io.InputStream;
import java.util.Scanner;

public class Zad2_4 {
    public static void main(String[] args) {
        InputStream stream = Zad2_4.class.getClassLoader().getResourceAsStream("sufiks_4.txt");
        Scanner scanner = new Scanner(stream);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            int index = Zad2_3.dajTablice(split[1])[0];
            String  szukaneSlowo = split[1].substring(--index);
            System.out.println(szukaneSlowo);

        }

    }
}
