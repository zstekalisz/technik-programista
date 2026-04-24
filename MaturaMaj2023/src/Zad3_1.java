import java.io.InputStream;
import java.util.Scanner;

public class Zad3_1 {

    public static void main(String[] args) {
        InputStream stream = Zad3_1.class.getClassLoader().getResourceAsStream("skrot_przyklad.txt");
        Scanner scanner = new Scanner(stream);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
        }
    }

    public static long obliczM(long n){
        long b = 1;
        long m = 0;
        boolean flaga = false;
        while (n>0){
            long a = n%10;
            n = n/10;
            if(a%2!=0){
               flaga = true;
               m = m + (a*b);
               b = b * 10;
            }

        }
        if(flaga){
            return m;
        }else return -1;

    }
}
