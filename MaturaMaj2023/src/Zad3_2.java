import java.io.InputStream;
import java.util.Scanner;

public class Zad3_2 {

    public static int licznik = 0;
    public static long najwieksza = 0;

    public static void main(String[] args) {
        InputStream stream = Zad3_2.class.getClassLoader().getResourceAsStream("skrot.txt");
        Scanner scanner = new Scanner(stream);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            Long liczba = Long.valueOf(line);
            long skrot = Zad3_1.obliczM(liczba);
            if(skrot==-1L){
                licznik++;
                if (najwieksza<liczba){
                    najwieksza = liczba;
                }
            }
        }
        System.out.println("Ilość liczb "+ licznik);
        System.out.println("Największa "+najwieksza);

    }
}
