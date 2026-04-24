import java.util.ArrayList;
import java.util.List;

public class Zad2_1 {

    public static int intToBinaryTab(int x){
        List<Integer> result = new ArrayList<>();
        while (x>0){
            int bit = x%2;
            result.add(bit);
            x = x/2;
        }
        int bloki = 1;
        for (int i = 0; i<result.size()-1; i++){
            if(!result.get(i).equals(result.get(i+1))){
                bloki++;
            }
        }
        return bloki;
    }

    public static void main(String[] args) {
        int wynik = intToBinaryTab(245);
        System.out.println(wynik);
    }
}
