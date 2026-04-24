import java.io.InputStream;
import java.util.Scanner;

public class Zad2_3 {
    public static void main(String[] args) {
        InputStream stream = Zad2_3.class.getClassLoader().getResourceAsStream("bin.txt");
        Scanner sc = new Scanner(stream);
        int max = 0;
        String maxBinary = "";
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] bits = line.split("");
            int potega = bits.length-1;
            int liczba = 0;
            for (String bitString : bits){
                if(bitString.equals("0")){
                    potega--;
                    continue;
                }
                int part = (int)Math.pow(2, potega);
                liczba = liczba + part;
                potega--;
            }
            if(max<liczba){
                max = liczba;
                maxBinary = line;
            }
        }
        System.out.println(maxBinary);
        System.out.println(max);
    }
}
