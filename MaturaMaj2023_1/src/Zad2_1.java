import java.util.ArrayList;
import java.util.List;

public class Zad2_1 {
    public static void main(String[] args) {
        int bloks = convert(245);
        System.out.println(bloks);
    }

    public static int convert(int n){
        int current = -1;
        int previous = -1;
        int bloki = 0;
        while (n>0){
            if (bloki==0){
                bloki++;
                previous = n%2;
                n = n/2;
                continue;
            }
            current = n%2;
            n = n/2;
            if(current!=previous){
                bloki++;
                previous = current;
            }
        }
        return bloki;
    }
}
