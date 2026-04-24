import java.io.InputStream;
import java.util.Scanner;

public class Zad2_3 {
    public static void main(String[] args) {
        InputStream stream = Zad2_3.class.getClassLoader().getResourceAsStream("bin.txt");
        Scanner scanner = new Scanner(stream);
        int max = 0;
        String maxBinary = "";
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            int liczba = 0;
            String[] split = line.split("");
            int potega = split.length-1;
            for(String bit : split){
                int i = Integer.parseInt(bit);
                if(i>0){
                    int skladowa = (int)Math.pow(2, potega);
                    liczba = liczba + skladowa;
                }
                potega--;
            }
            if(liczba>max){
                maxBinary = line;
                max = liczba;
            }
        }
        System.out.println(maxBinary);
        System.out.println(max);
    }
}
