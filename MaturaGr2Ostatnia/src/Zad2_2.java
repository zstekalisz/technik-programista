import java.io.InputStream;
import java.util.Scanner;

public class Zad2_2 {
    public static void main(String[] args) {
        InputStream stream = Zad2_2.class.getClassLoader().getResourceAsStream("bin.txt");
        Scanner sc = new Scanner(stream);
        int licznik = 0;
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] result = line.split("");
            int bloki = 1;
            for (int i = 0; i<result.length-1; i++){
                if(!result[i].equals(result[i+1])){
                    bloki++;
                }
            }
            if(bloki<=2){
                licznik++;
            }
        }
        System.out.println(licznik);
    }
}
